package com.isd.sappu.savari.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isd.sappu.savari.dao.RatingDao;
import com.isd.sappu.savari.domains.Rating;

@Service
public class RatingServiceImpl implements RatingService {

	@Autowired
	private RatingDao ratingDao;
	
	@Autowired
	private ProductService productService;
	
	@Override
	public long saveUpdateRating(Rating rating) {
		return ratingDao.saveUpdateRating(rating);
	}

	@Override
	public Rating getRating(long ratingId) {
		return ratingDao.getRating(ratingId);
	}

	@Override
	public List<Rating> getRatingsByUserId(long userId) {
		return ratingDao.getRatingsByUserId(userId);
	}

	@Override
	public List<Rating> getRatingsByProductId(long productId) {
		return ratingDao.getRatingsByProductId(productId);
	}

	@Override
	public String deleteRating(Rating rating) {
		return ratingDao.deleteRating(rating);
	}

	@Override
	public int calculateOverallRating(long productId) {
		List<Rating> ratingList = this.getRatingsByProductId(productId);
		int ratingSum = 0;
		int ratingCount = 0;
		
		for (Rating rating : ratingList) {
			ratingCount++;
			ratingSum = ratingSum + rating.getRating();
		}
		
		return ratingSum/ratingCount;
	}

	@Override
	public Rating getRating(long userId, long productId) {
		return ratingDao.getRating(userId, productId);
	}

}
