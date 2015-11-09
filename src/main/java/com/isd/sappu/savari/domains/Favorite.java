package com.isd.sappu.savari.domains;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="favorite")
public class Favorite implements Serializable{

	private static final long serialVersionUID = 5489679679570043539L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long favoriteId;
	
	private String status;
	
	private Date updatedDateTime;
	
	@ManyToOne
	private SystemUser user;
	
	@ManyToOne
	private Product product;
	
	
	

	public long getFavoriteId() {
		return favoriteId;
	}

	public void setFavoriteId(long favoriteId) {
		this.favoriteId = favoriteId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	
}
