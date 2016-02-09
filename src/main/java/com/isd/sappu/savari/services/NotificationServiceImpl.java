package com.isd.sappu.savari.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isd.sappu.savari.dao.NotificationDao;
import com.isd.sappu.savari.domains.Notification;
import com.isd.sappu.savari.domains.Product;
import com.isd.sappu.savari.domains.SystemUser;

@Service
public class NotificationServiceImpl implements NotificationService {

	@Autowired
	private NotificationDao notificationDao;
	
	@Override
	public Notification saveUpdateNotification(Notification notification) {
		return notificationDao.save(notification);
	}

	@Override
	public Notification getNotification(long notificationId) {
		return notificationDao.findOne(notificationId);
	}

	@Override
	public List<Notification> getNotificationsByUserId(long userId) {
		SystemUser user = new SystemUser();
		user.setUserId(userId);
		return notificationDao.findByUser(user);
	}

	@Override
	public List<Notification> getNotificationsByProductId(long productId) {
		Product product = new Product();
		product.setProductId(productId);
		return notificationDao.findByProduct(product);
	}

	@Override
	public void deleteNotification(Notification notification) {
		notificationDao.delete(notification);
	}

	@Override
	public Notification getNotification(long userId, long productId) {
		SystemUser user = new SystemUser();
		user.setUserId(userId);
		Product product = new Product();
		product.setProductId(productId);
		return notificationDao.findByUserAndProduct(user, product);
	}

}
