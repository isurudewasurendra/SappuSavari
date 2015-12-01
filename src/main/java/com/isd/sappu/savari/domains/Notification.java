package com.isd.sappu.savari.domains;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="notification")
public class Notification {

	private static final long serialVersionUID = 5489679679570043539L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long notificationId;
	
	private int seenStatus;
	
	private String notificationType;
	
	private String description;
	
	private int priority;
	
	private Date lastSeenTime;
	
	private Date updatedDateTime;
	
	@ManyToOne
	private SystemUser user;
	
	@ManyToOne
	private Product product;
	
	
	public Notification() {
		super();
	}

	public Notification(int seenStatus, String notificationType, String description, int priority, Date lastSeenTime, Date updatedDateTime, SystemUser user, Product product) {
		super();
		this.seenStatus = seenStatus;
		this.notificationType = notificationType;
		this.description = description;
		this.priority = priority;
		this.updatedDateTime = updatedDateTime;
		this.lastSeenTime = lastSeenTime;
		this.user = user;
		this.product = product;
	}

	public long getNotificationId() {
		return notificationId;
	}

	public void setNotificationId(long notificationId) {
		this.notificationId = notificationId;
	}

	public int getSeenStatus() {
		return seenStatus;
	}

	public void setSeenStatus(int seenStatus) {
		this.seenStatus = seenStatus;
	}

	public String getNotificationType() {
		return notificationType;
	}

	public void setNotificationType(String notificationType) {
		this.notificationType = notificationType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public Date getUpdatedDateTime() {
		return updatedDateTime;
	}

	public void setUpdatedDateTime(Date updatedDateTime) {
		this.updatedDateTime = updatedDateTime;
	}

	public SystemUser getUser() {
		return user;
	}

	public void setUser(SystemUser user) {
		this.user = user;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Date getLastSeenTime() {
		return lastSeenTime;
	}

	public void setLastSeenTime(Date lastSeenTime) {
		this.lastSeenTime = lastSeenTime;
	}
	
}
