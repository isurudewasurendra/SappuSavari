package com.isd.sappu.savari.dao;

import java.util.List;

import com.isd.sappu.savari.domains.Rating;

public interface RatingDao {

	public long saveUpdateRating(Rating rating);
	
	public Rating getRating(long ratingId);
	
	public Rating getRating(long userId, long productId);
	
	public List<Rating> getRatingsByUserId(long userId);
	
	public List<Rating> getRatingsByProductId(long productId);
	
	public String deleteRating(Rating rating);
	
}
