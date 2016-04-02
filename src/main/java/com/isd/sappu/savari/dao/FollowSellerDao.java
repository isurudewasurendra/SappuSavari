package com.isd.sappu.savari.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.isd.sappu.savari.domains.FollowSeller;

public interface FollowSellerDao extends CrudRepository<FollowSeller, Long>{
	
	public List<FollowSeller> findByBuyerId(long buyerId);
	
	public FollowSeller findByBuyerIdAndSellerId(long buyerId, long sellerId);

}
