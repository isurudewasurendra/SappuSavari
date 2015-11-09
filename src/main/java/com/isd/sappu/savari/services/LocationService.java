package com.isd.sappu.savari.services;

public interface LocationService {

	public double getDistance(double fromLat, double fromLon, double toLat, double toLon, char unit);
	
}
