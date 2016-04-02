package com.isd.sappu.savari.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isd.sappu.savari.dao.FollowSellerDao;
import com.isd.sappu.savari.domains.FollowSeller;

@Service
public class FollowSellerServiceImpl implements FollowSellerService{

	@Autowired
	FollowSellerDao followSellerDao;
	
	@Override
	public List<FollowSeller> findFollowSellers(long userId) {
		return followSellerDao.findByBuyerId(userId);
	}

	@Override
	public FollowSeller saveUpdateFollowSeller(FollowSeller followSeller) {
		return followSellerDao.save(followSeller);
	}

	@Override
	public FollowSeller findFollowSeller(long buyerId, long sellerId) {
		return followSellerDao.findByBuyerIdAndSellerId(buyerId, sellerId);
	}

}