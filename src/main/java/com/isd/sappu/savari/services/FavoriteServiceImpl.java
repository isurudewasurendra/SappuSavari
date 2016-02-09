package com.isd.sappu.savari.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isd.sappu.savari.dao.FavoriteDao;
import com.isd.sappu.savari.domains.Favorite;
import com.isd.sappu.savari.domains.Product;
import com.isd.sappu.savari.domains.SystemUser;

@Service
public class FavoriteServiceImpl implements FavoriteService {

	@Autowired
	private FavoriteDao favoriteDao;
	
	@Override
	public Favorite saveUpdateFavorite(Favorite favorite) {
		return favoriteDao.save(favorite);
	}

	@Override
	public Favorite getFavorite(long favoriteId) {
		return favoriteDao.findByFavoriteId(favoriteId);
	}

	@Override
	public List<Favorite> getFavoritesByUserId(long userId) {
		SystemUser user = new SystemUser();
		user.setUserId(userId);
		return favoriteDao.findByUser(user);
	}

	@Override
	public List<Favorite> getFavoritesByProductId(long productId) {
		Product product = new Product();
		product.setProductId(productId);
		return favoriteDao.findByProduct(product);
	}
	

	@Override
	public void deleteFavorite(Favorite favorite) {
		favoriteDao.delete(favorite);
	}

	@Override
	public Favorite getFavorite(long userId, long productId) {
		SystemUser user = new SystemUser();
		user.setUserId(userId);
		Product product = new Product();
		product.setProductId(productId);
		return favoriteDao.findByUserAndProduct(user, product);
	}

}
