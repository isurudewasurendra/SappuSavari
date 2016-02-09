package com.isd.sappu.savari.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.isd.sappu.savari.domains.Product;
import com.isd.sappu.savari.domains.Rating;
import com.isd.sappu.savari.domains.SystemUser;

public interface RatingDao extends CrudRepository<Rating, Long>{

	public Rating findByRatingId(long ratingId);
	
	public Rating findByUserAndProduct(SystemUser user, Product product);
	
	public List<Rating> findByUser(SystemUser user);
	
	public List<Rating> findByProduct(Product product);
	
}
