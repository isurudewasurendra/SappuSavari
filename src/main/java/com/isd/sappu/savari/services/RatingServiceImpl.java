package com.isd.sappu.savari.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isd.sappu.savari.dao.RatingDao;
import com.isd.sappu.savari.domains.Product;
import com.isd.sappu.savari.domains.Rating;
import com.isd.sappu.savari.domains.SystemUser;

@Service
public class RatingServiceImpl implements RatingService {

	@Autowired
	private RatingDao ratingDao;
	
	@Override
	public Rating saveUpdateRating(Rating rating) {
		return ratingDao.save(rating);
	}

	@Override
	public Rating getRating(long ratingId) {
		return ratingDao.findByRatingId(ratingId);
	}

	@Override
	public List<Rating> getRatingsByUserId(long userId) {
		SystemUser user = new SystemUser();
		user.setUserId(userId);
		return ratingDao.findByUser(user);
	}

	@Override
	public List<Rating> getRatingsByProductId(long productId) {
		Product product = new Product();
		product.setProductId(productId);
		return ratingDao.findByProduct(product);
	}

	@Override
	public void deleteRating(Rating rating) {
		ratingDao.delete(rating);
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
		
		if(ratingCount>0 && ratingSum>0){
			return ratingSum/ratingCount;
		}else{
			return 0;
		}
	}

	@Override
	public Rating getRating(long userId, long productId) {
		SystemUser user = new SystemUser();
		user.setUserId(userId);
		Product product = new Product();
		product.setProductId(productId);
		return ratingDao.findByUserAndProduct(user, product);
	}

}
