package com.isd.sappu.savari.services;

import java.util.List;

import com.isd.sappu.savari.domains.Rating;

public interface RatingService {

	public long saveUpdateRating(Rating rating);
	
	public Rating getRating(long ratingId);
	
	public Rating getRating(long userId, long productId);
	
	public List<Rating> getRatingsByUserId(long userId);
	
	public List<Rating> getRatingsByProductId(long productId);
	
	public String deleteRating(Rating rating);
	
	public int calculateOverallRating(long productId);
	
}
