package com.isd.sappu.savari.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.isd.sappu.savari.domains.Favorite;
import com.isd.sappu.savari.domains.Product;
import com.isd.sappu.savari.domains.SystemUser;

public interface FavoriteDao extends CrudRepository<Favorite, Long>{

	public Favorite findByFavoriteId(long favoriteId);
	
	public Favorite findByUserAndProduct(SystemUser user, Product product);
	
	public List<Favorite> findByUser(SystemUser user);
	
	public List<Favorite> findByProduct(Product product);
	
}
