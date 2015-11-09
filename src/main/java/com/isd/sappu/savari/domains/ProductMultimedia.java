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
@Table(name="product_multimedia")
public class ProductMultimedia implements Serializable{
	
	private static final long serialVersionUID = 5489679679570043539L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long productMultimediaId;
	
	private String multimediaType;
	
	private String media;
	
	private Date updatedDateTime;
	
	@ManyToOne
	private Product product;
	
	
	

	public long getProductMultimediaId() {
		return productMultimediaId;
	}

	public void setProductMultimediaId(long productMultimediaId) {
		this.productMultimediaId = productMultimediaId;
	}

	public String getMultimediaType() {
		return multimediaType;
	}

	public void setMultimediaType(String multimediaType) {
		this.multimediaType = multimediaType;
	}

	public String getMedia() {
		return media;
	}

	public void setMedia(String media) {
		this.media = media;
	}

	public Date getUpdatedDateTime() {
		return updatedDateTime;
	}

	public void setUpdatedDateTime(Date updatedDateTime) {
		this.updatedDateTime = updatedDateTime;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
}
