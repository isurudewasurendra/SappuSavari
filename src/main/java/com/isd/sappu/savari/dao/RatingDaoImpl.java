package com.isd.sappu.savari.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.isd.sappu.savari.domains.Rating;
import com.isd.sappu.savari.util.EnumConstant;

@Repository
@Transactional
public class RatingDaoImpl implements RatingDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public long saveUpdateRating(Rating rating) {
		try{
			sessionFactory.getCurrentSession().saveOrUpdate(rating);
			return rating.getRatingId();
		}catch(Exception e){
			e.printStackTrace();
			return -1;
		}
	}

	@Override
	@Transactional
	public Rating getRating(long ratingId) {
		try{
			Session session = sessionFactory.openSession();
            return (Rating) session.get(Rating.class, ratingId);
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Rating> getRatingsByUserId(long userId) {
		try{
			Session session = sessionFactory.openSession();
            return (List<Rating>) session.createQuery("from Rating where user.userId = :userId")
            		.setParameter("userId", userId).list();
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Rating> getRatingsByProductId(long productId) {
		try{
			Session session = sessionFactory.openSession();
            return (List<Rating>) session.createQuery("from Rating where product.productId = :productId")
            		.setParameter("productId", productId).list();
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	@Override
	@Transactional
	public String deleteRating(Rating rating) {
		try{
			sessionFactory.getCurrentSession().delete(rating);
			return EnumConstant.ReturnStatus.SUCCESS.toString();
		}catch(Exception e){
			e.printStackTrace();
			return EnumConstant.ReturnStatus.ERROR.toString();
		}
	}

	@Override
	public Rating getRating(long userId, long productId) {
		try{
			Session session = sessionFactory.openSession();
            return (Rating) session.createQuery("from Rating where user.userId = :userId and product.productId = :productId")
            		.setParameter("userId", userId)
            		.setParameter("productId", productId).uniqueResult();
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

}
