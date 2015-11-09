package com.isd.sappu.savari.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isd.sappu.savari.dao.FavoriteDao;
import com.isd.sappu.savari.domains.Favorite;

@Service
public class FavoriteServiceImpl implements FavoriteService {

	@Autowired
	private FavoriteDao favoriteDao;
	
	@Override
	public long saveUpdateFavorite(Favorite favorite) {
		return favoriteDao.saveUpdateFavorite(favorite);
	}

	@Override
	public Favorite getFavorite(long favoriteId) {
		return favoriteDao.getFavorite(favoriteId);
	}

	@Override
	public List<Favorite> getFavoritesByUserId(long userId) {
		return favoriteDao.getFavoritesByUserId(userId);
	}

	@Override
	public List<Favorite> getFavoritesByProductId(long productId) {
		return favoriteDao.getFavoritesByProductId(productId);
	}

	@Override
	public String deleteFavorite(Favorite favorite) {
		return favoriteDao.deleteFavorite(favorite);
	}

	@Override
	public Favorite getFavorite(long userId, long productId) {
		return favoriteDao.getFavorite(userId, productId);
	}

}
