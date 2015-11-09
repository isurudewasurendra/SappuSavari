package com.isd.sappu.savari.services;

import org.springframework.stereotype.Service;

@Service
public class LocationServiceImpl implements LocationService {

	@Override
	public double getDistance(double fromLat, double fromLon, double toLat, double toLon, char unit) {
		double theta = fromLon - toLon;
		  double dist = Math.sin(deg2rad(fromLat)) * Math.sin(deg2rad(toLat)) + Math.cos(deg2rad(fromLat)) * Math.cos(deg2rad(toLat)) * Math.cos(deg2rad(theta));
		  dist = Math.acos(dist);
		  dist = rad2deg(dist);
		  dist = dist * 60 * 1.1515;
		  if (unit == 'K') {
		    dist = dist * 1.609344;
		  } else if (unit == 'N') {
		  	dist = dist * 0.8684;
		    }
		  return (dist);
	}
	
	private double deg2rad(double deg) {
	  return (deg * Math.PI / 180.0);
	}
	
	private double rad2deg(double rad) {
	  return (rad * 180 / Math.PI);
	}

}
