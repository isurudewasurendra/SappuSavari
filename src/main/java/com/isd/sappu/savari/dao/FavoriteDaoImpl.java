package com.isd.sappu.savari.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.isd.sappu.savari.domains.Favorite;
import com.isd.sappu.savari.util.EnumConstant;

@Repository
@Transactional
public class FavoriteDaoImpl implements FavoriteDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public long saveUpdateFavorite(Favorite favorite) {
		try{
			sessionFactory.getCurrentSession().saveOrUpdate(favorite);
			return favorite.getFavoriteId();
		}catch(Exception e){
			e.printStackTrace();
			return -1;
		}
	}

	@Override
	@Transactional
	public Favorite getFavorite(long favoriteId) {
		try{
			Session session = sessionFactory.openSession();
            return (Favorite) session.get(Favorite.class, favoriteId);
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Favorite> getFavoritesByUserId(long userId) {
		try{
			Session session = sessionFactory.openSession();
            return (List<Favorite>) session.createQuery("from Favorite where user.userId = :userId")
            		.setParameter("userId", userId).list();
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Favorite> getFavoritesByProductId(long productId) {
		try{
			Session session = sessionFactory.openSession();
			return (List<Favorite>) session.createQuery("from Favorite where product.productId = :productId")
            		.setParameter("productId", productId).list();
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	@Override
	@Transactional
	public String deleteFavorite(Favorite favorite) {
		try{
			sessionFactory.getCurrentSession().delete(favorite);
			return EnumConstant.ReturnStatus.SUCCESS.toString();
		}catch(Exception e){
			e.printStackTrace();
			return EnumConstant.ReturnStatus.ERROR.toString();
		}
	}

	@Override
	@Transactional
	public Favorite getFavorite(long userId, long productId) {
		try{
			Session session = sessionFactory.openSession();
			return (Favorite) session.createQuery("from Favorite where product.productId = :productId and user.userId = :userId")
            		.setParameter("productId", productId)
            		.setParameter("userId", userId)
            		.uniqueResult();
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

}
