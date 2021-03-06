package com.isd.sappu.savari.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.isd.sappu.savari.domains.FollowSeller;
import com.isd.sappu.savari.domains.Notification;
import com.isd.sappu.savari.domains.Product;
import com.isd.sappu.savari.domains.SearchRequest;
import com.isd.sappu.savari.domains.SystemUser;
import com.isd.sappu.savari.util.EnumConstant;
import com.isd.sappu.savari.util.SendEmailUsingGMailSMTP;

@Component
public class ScheduleLocationSearchService {

	@Autowired
	SystemUserService systemUserService;

	@Autowired
	ProductService productService;

	@Autowired
	SearchRequestService searchRequestService;
	
	@Autowired
	NotificationService notificationService;
	
	@Autowired
	FollowSellerService followSellerService;

	@Scheduled(fixedDelay = 10000000 * 20)
	public void SchedularServiceMethod() {
		System.out.println("****************Schedular started running at " + new Date() + "**********************");

		// get application users
		List<SystemUser> applicationUserList = systemUserService.getAllSystemUsers();

		for (SystemUser applicationUser : applicationUserList) {

			List<Product> relevantProducts = new ArrayList<Product>();
			List<Product> searchedProductList = new ArrayList<Product>();

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
				searchedProductList.addAll(searchedProducts);
			}

			for (Product product : relevantProducts) {
				System.out.println("--------relevant product id--------" + product.getProductId());
			}
			
			System.out.println("********************************provide favorite notification**********************************");
			for (Product product : favoriteProducts) {
				//get no of comment after favorite added date and time
				//check existing notification
				//if not exist add notification as not seen
			}
			
			System.out.println("********************************provide comment notification**********************************");
			for (Product product : commentedProducts) {
				//get no of comment after last comment added date and time
				//check existing notification
				//if not exist add notification as not seen
			}

			System.out.println("********************************provide short distance notification**********************************");
			for (Product product : relevantProducts) {
				// calculate the distance
				double fromLat = applicationUser.getLatitude();
				double fromLon = applicationUser.getLongtitude();
				double toLat = product.getUser().getLatitude();
				double toLon = product.getUser().getLongtitude();
				
				//get follow user by application user
				List<FollowSeller> followSellers = followSellerService.findFollowSellers(applicationUser.getUserId());
				for (FollowSeller followSeller : followSellers) {
					//if the seller id in follow user == product.getUser()
					if(followSeller.getSellerId() == product.getUser().getUserId()){
						//do the distance calculation
						double distance = this.getDistanceFromLatLonInKm(fromLat, fromLon, toLat, toLon);
						if (distance < 1) {
							//this product details should post the users notification panel high priority
							Notification notification = new Notification(0, EnumConstant.NotificationType.DISTANCE.toString(), "your seller is near by", 5, null, new Date(), applicationUser, product);
							List<Notification> existNotifications = notificationService.getNotification(applicationUser.getUserId(), product.getProductId(), EnumConstant.NotificationType.DISTANCE.toString());
							if(existNotifications == null || (existNotifications != null && existNotifications.size() == 0)){
								notificationService.saveUpdateNotification(notification);
								
								SendEmailUsingGMailSMTP email = new SendEmailUsingGMailSMTP();
								String subject = "ALERT!" + product.getUser().getFirstName() + "IS NEAR YOU." + product.getUser().getMobileNo();
								String content = "Your interested product("+product.getProductTitle()+") owner is near by, Please contact him to make a appointment or send a message.";
								email.sendMail(applicationUser.getUsername(), subject, content);
							}
						}
					}
				}
			}
			
			System.out.println("********************************provide search notification**********************************");
			for (Product product : searchedProductList) {
				//this product details should post the users notification panel low priority
				
				
				Notification notification = new Notification(0, EnumConstant.NotificationType.SEARCH.toString(), "we found out a new product", 4, null, new Date(), applicationUser, product);
				List<Notification> existNotifications = notificationService.getNotification(applicationUser.getUserId(), product.getProductId(), EnumConstant.NotificationType.SEARCH.toString());
				if(existNotifications == null || (existNotifications != null && existNotifications.size() == 0)){
					notificationService.saveUpdateNotification(notification);
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
