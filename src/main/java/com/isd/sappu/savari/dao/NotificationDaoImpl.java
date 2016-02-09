package com.isd.sappu.savari.dao;

import java.util.List;

import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.isd.sappu.savari.domains.Notification;
import com.isd.sappu.savari.util.EnumConstant;

@Repository
@Transactional
public class NotificationDaoImpl implements NotificationDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public long saveUpdateNotification(Notification notification) {
		try{
			sessionFactory.getCurrentSession().saveOrUpdate(notification);
			return notification.getNotificationId();
		}catch(Exception e){
			e.printStackTrace();
			return -1;
		}
	}

	@Override
	@Transactional
	public Notification getNotification(long notificationId) {
		try{
			Session session = sessionFactory.openSession();
            return (Notification) session.get(Notification.class, notificationId);
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Notification> getNotificationsByUserId(long userId) {
		try{
			Session session = sessionFactory.openSession();
            return (List<Notification>) session.createQuery("from Notification where user.userId = :userId")
            		.setParameter("userId", userId).list();
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Notification> getNotificationsByProductId(long productId) {
		try{
			Session session = sessionFactory.openSession();
			return (List<Notification>) session.createQuery("from Notification where product.productId = :productId")
            		.setParameter("productId", productId).list();
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	@Override
	@Transactional
	public String deleteNotification(Notification notification) {
		try{
			sessionFactory.getCurrentSession().delete(notification);
			return EnumConstant.ReturnStatus.SUCCESS.toString();
		}catch(Exception e){
			e.printStackTrace();
			return EnumConstant.ReturnStatus.ERROR.toString();
		}
	}

	@Override
	@Transactional
	public Notification getNotification(long userId, long productId) {
		try{
			Session session = sessionFactory.openSession();
			return (Notification) session.createQuery("from Notification where product.productId = :productId and user.userId = :userId")
            		.setParameter("productId", productId)
            		.setParameter("userId", userId)
            		.uniqueResult();
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	@Override
	@Transactional
	public Notification getNotification(long userId, long productId, String notificationType) {
		try{
			Session session = sessionFactory.openSession();
			return (Notification) session.createQuery("from Notification where product.productId = :productId and user.userId = :userId and notificationType=:notificationType")
            		.setParameter("productId", productId)
            		.setParameter("userId", userId)
            		.setParameter("notificationType", notificationType)
            		.uniqueResult();
		}catch(NoResultException e){
			e.printStackTrace();
			return null;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

}
