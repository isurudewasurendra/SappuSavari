package com.isd.sappu.savari.services;

import java.util.List;

import com.isd.sappu.savari.domains.Notification;

public interface NotificationService {

	public Notification saveUpdateNotification(Notification notification);
	
	public Notification getNotification(long notificationId);
	
	public List<Notification> getNotification(long userId, long productId);
	
	public List<Notification> getNotificationsByUserId(long userId);
	
	public List<Notification> getNewNotificationsByUserId(long userId);
	
	public List<Notification> getNotificationsByProductId(long productId);
	
	public void deleteNotification(Notification notification);
	
}
