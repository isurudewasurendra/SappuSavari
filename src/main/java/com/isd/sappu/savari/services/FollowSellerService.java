package com.isd.sappu.savari.services;

import java.util.List;

import com.isd.sappu.savari.domains.FollowSeller;

public interface FollowSellerService {
	
	public List<FollowSeller> findFollowSellers(long userId);
	
	public FollowSeller saveUpdateFollowSeller(FollowSeller followSeller);
}