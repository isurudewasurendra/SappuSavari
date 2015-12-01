package com.isd.sappu.savari.dao;

import java.util.List;

import com.isd.sappu.savari.domains.Notification;

public interface NotificationDao {

	public long saveUpdateNotification(Notification notification);
	
	public Notification getNotification(long notificationId);
	
	public Notification getNotification(long userId, long productId);
	
	public List<Notification> getNotificationsByUserId(long userId);
	
	public List<Notification> getNotificationsByProductId(long productId);
	
	public String deleteNotification(Notification notification);
	
}
