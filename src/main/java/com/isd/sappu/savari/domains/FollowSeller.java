package com.isd.sappu.savari.domains;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="follow_seller")
public class FollowSeller implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long followId;
	
	private long buyerId;
	
	private long sellerId;
	
	private String sellerName;
	
	private double sellerLongtitude;
	
	private double sellerLatitude;
	
	private long productId;
	
	private String productTitle;
	
	private Date createdDateTime;
	

	public long getFollowId() {
		return followId;
	}

	public void setFollowId(long followId) {
		this.followId = followId;
	}

	public long getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(long buyerId) {
		this.buyerId = buyerId;
	}

	public long getSellerId() {
		return sellerId;
	}

	public void setSellerId(long sellerId) {
		this.sellerId = sellerId;
	}

	public Date getCreatedDateTime() {
		return createdDateTime;
	}

	public void setCreatedDateTime(Date createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public String getProductTitle() {
		return productTitle;
	}

	public void setProductTitle(String productTitle) {
		this.productTitle = productTitle;
	}

	public double getSellerLongtitude() {
		return sellerLongtitude;
	}

	public void setSellerLongtitude(double sellerLongtitude) {
		this.sellerLongtitude = sellerLongtitude;
	}

	public double getSellerLatitude() {
		return sellerLatitude;
	}

	public void setSellerLatitude(double sellerLatitude) {
		this.sellerLatitude = sellerLatitude;
	}
	
	
	
}
