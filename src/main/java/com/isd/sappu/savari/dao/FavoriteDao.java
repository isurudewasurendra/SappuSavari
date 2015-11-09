package com.isd.sappu.savari.dao;

import java.util.List;

import com.isd.sappu.savari.domains.Favorite;

public interface FavoriteDao {

	public long saveUpdateFavorite(Favorite favorite);
	
	public Favorite getFavorite(long favoriteId);
	
	public Favorite getFavorite(long userId, long productId);
	
	public List<Favorite> getFavoritesByUserId(long userId);
	
	public List<Favorite> getFavoritesByProductId(long productId);
	
	public String deleteFavorite(Favorite favorite);
	
}
