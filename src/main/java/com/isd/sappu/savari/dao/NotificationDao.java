package com.isd.sappu.savari.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.isd.sappu.savari.domains.Notification;
import com.isd.sappu.savari.domains.Product;
import com.isd.sappu.savari.domains.SystemUser;

public interface NotificationDao extends CrudRepository<Notification, Long>{

	public Notification findByNotificationId(long notificationId);
	
	public List<Notification> findByUserAndProduct(SystemUser user, Product product);
	
	public List<Notification> findByUser(SystemUser user);
	
	public List<Notification> findByUserAndSeenStatus(SystemUser user, int seenStatus);
	
	public List<Notification> findByProduct(Product product);
	
}
