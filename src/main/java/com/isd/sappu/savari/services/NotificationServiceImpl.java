package com.isd.sappu.savari.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isd.sappu.savari.dao.NotificationDao;
import com.isd.sappu.savari.domains.Notification;

@Service
public class NotificationServiceImpl implements NotificationService {

	@Autowired
	private NotificationDao notificationDao;
	
	@Override
	public long saveUpdateNotification(Notification notification) {
		return notificationDao.saveUpdateNotification(notification);
	}

	@Override
	public Notification getNotification(long notificationId) {
		return notificationDao.getNotification(notificationId);
	}

	@Override
	public List<Notification> getNotificationsByUserId(long userId) {
		return notificationDao.getNotificationsByUserId(userId);
	}

	@Override
	public List<Notification> getNotificationsByProductId(long productId) {
		return notificationDao.getNotificationsByProductId(productId);
	}

	@Override
	public String deleteNotification(Notification notification) {
		return notificationDao.deleteNotification(notification);
	}

	@Override
	public Notification getNotification(long userId, long productId) {
		return notificationDao.getNotification(userId, productId);
	}

}
