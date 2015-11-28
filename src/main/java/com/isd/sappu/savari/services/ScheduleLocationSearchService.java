package com.isd.sappu.savari.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

import com.isd.sappu.savari.domains.Product;
import com.isd.sappu.savari.domains.SearchRequest;
import com.isd.sappu.savari.domains.SystemUser;

public class ScheduleLocationSearchService {

	@Autowired
	SystemUserService systemUserService;

	@Autowired
	ProductService productService;

	@Autowired
	SearchRequestService searchRequestService;

	@Scheduled(fixedDelay = 1000 * 10)
	public void demoServiceMethod() {
		System.out.println("****************Schedular started running at " + new Date() + "**********************");

		// get application users
		List<SystemUser> applicationUserList = systemUserService.getAllSystemUsers();

		for (SystemUser applicationUser : applicationUserList) {

			List<Product> relevantProducts = new ArrayList<Product>();

			// get favorite products
			List<Product> favoriteProducts = productService.getFavoriteProductsByUser(applicationUser.getUserId());
			relevantProducts.addAll(favoriteProducts);

			// get commented products
			List<Product> commentedProducts = productService.getCommentedProductsByUser(applicationUser.getUserId());
			relevantProducts.addAll(commentedProducts);

			// get all search requests
			List<SearchRequest> searchRequests = searchRequestService
					.getAllSearchRequestByUserId(applicationUser.getUserId());
			for (SearchRequest searchRequest : searchRequests) {
				List<Product> searchedProducts = productService.getSearchedProductList(searchRequest);
				relevantProducts.addAll(searchedProducts);
			}

			for (Product product : relevantProducts) {
				System.out.println("--------relevant product id--------" + product.getProductId());
			}

			for (Product product : relevantProducts) {
				System.out.println("--------get relevant product id--------" + product.getProductId());
				// calculate the distance
				double fromLat = applicationUser.getLatitude();
				double fromLon = applicationUser.getLongtitude();
				double toLat = product.getUser().getLatitude();
				double toLon = product.getUser().getLongtitude();
				double distance = this.getDistanceFromLatLonInKm(fromLat, fromLon, toLat, toLon);
				if (distance < 1) {
					//this product details should post the users notification panel
					
				}
			}

		}

		System.out.println("****************Schedular finished running at " + new Date() + "*********************");
	}

	// using Haversine_formula to get the distance
	// http://www.movable-type.co.uk/scripts/latlong.html ||
	// https://en.wikipedia.org/wiki/Haversine_formula
	public double getDistanceFromLatLonInKm(double fromLat, double fromLon, double toLat, double toLon) {
		try {
			int R = 6371; // Radius of the earth in km
			double dLat = deg2rad(toLat - fromLat); // deg2rad below
			double dLon = deg2rad(toLon - fromLon);
			double a = Math.sin(dLat / 2) * Math.sin(dLat / 2)
					+ Math.cos(deg2rad(fromLat)) * Math.cos(deg2rad(toLat)) * Math.sin(dLon / 2) * Math.sin(dLon / 2);
			double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
			double d = R * c; // Distance in km
			return d;
		} catch (Exception e) {
			System.out.println("****error occured when calculating the distance");
			e.printStackTrace();
			return -1;
		}

	}

	public double deg2rad(double deg) {
		return deg * (Math.PI / 180);
	}

}
