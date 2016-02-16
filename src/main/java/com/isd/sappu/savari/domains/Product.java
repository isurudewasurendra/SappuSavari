package com.isd.sappu.savari.domains;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;


@Entity
@Table(name="products")
public class Product implements Serializable{

	private static final long serialVersionUID = 5489679679570043539L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long productId;
	
	private String productTitle;
	
	private String description;
	
	private String address;
	
	private String mobile;
	
	private String landPhone;
	
	private String fax;
	
	private String email;
	
	private double price;
	
	private String productType;
	
	private String productBrand;
	
	private String productModel;
	
	private String authenticity;
	
	private String modelYear;
	
	private String productCondition;
	
	private String millege;
	
	private String transmission;
	
	private String fuelType;
	
	private String bodyType;
	
	private String productSize;
	
	private int noOfBathroom;
	
	private int noOfRoom;
	
	private String productStatus;
	
	private Date createdDateTime;
	
	private Date updatedDateTime;
	
	@ManyToOne
	private SystemUser user;
	
	@ManyToOne
	private PopularArea popularArea;
	
	@OneToMany(mappedBy="product")
	@Cascade(CascadeType.ALL)
	private List<Favorite> favoriteList;
	
	@OneToMany(mappedBy="product")
	@Cascade(CascadeType.ALL)
	private List<Comment> commentList;
	
	@OneToMany(mappedBy="product")
	@Cascade(CascadeType.ALL)
	private List<Rating> ratingList;
	
	@ManyToOne
	private ProductSubCategory productSubCategory;
	
	@OneToMany(mappedBy="product" ,fetch = FetchType.EAGER)
	@Cascade(CascadeType.ALL)
	private List<ProductMultimedia> multiMediaList;
	
	
	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public PopularArea getPopularArea() {
		return popularArea;
	}

	public void setPopularArea(PopularArea popularArea) {
		this.popularArea = popularArea;
	}

	public List<Favorite> getFavoriteList() {
		return favoriteList;
	}

	public void setFavoriteList(List<Favorite> favoriteList) {
		this.favoriteList = favoriteList;
	}

	public List<Comment> getCommentList() {
		return commentList;
	}

	public void setCommentList(List<Comment> commentList) {
		this.commentList = commentList;
	}

	public List<Rating> getRatingList() {
		return ratingList;
	}

	public void setRatingList(List<Rating> ratingList) {
		this.ratingList = ratingList;
	}

	public String getProductTitle() {
		return productTitle;
	}

	public void setProductTitle(String productTitle) {
		this.productTitle = productTitle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getProductBrand() {
		return productBrand;
	}

	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}

	public String getProductModel() {
		return productModel;
	}

	public void setProductModel(String productModel) {
		this.productModel = productModel;
	}

	public String getAuthenticity() {
		return authenticity;
	}

	public void setAuthenticity(String authenticity) {
		this.authenticity = authenticity;
	}

	public String getModelYear() {
		return modelYear;
	}

	public void setModelYear(String modelYear) {
		this.modelYear = modelYear;
	}

	public String getProductCondition() {
		return productCondition;
	}

	public void setProductCondition(String productCondition) {
		this.productCondition = productCondition;
	}

	public String getMillege() {
		return millege;
	}

	public void setMillege(String millege) {
		this.millege = millege;
	}

	public String getTransmission() {
		return transmission;
	}

	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	public String getBodyType() {
		return bodyType;
	}

	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}

	public String getProductSize() {
		return productSize;
	}

	public void setProductSize(String productSize) {
		this.productSize = productSize;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNoOfBathroom() {
		return noOfBathroom;
	}

	public void setNoOfBathroom(int noOfBathroom) {
		this.noOfBathroom = noOfBathroom;
	}

	public int getNoOfRoom() {
		return noOfRoom;
	}

	public void setNoOfRoom(int noOfRoom) {
		this.noOfRoom = noOfRoom;
	}

	public ProductSubCategory getProductSubCategory() {
		return productSubCategory;
	}

	public void setProductSubCategory(ProductSubCategory productSubCategory) {
		this.productSubCategory = productSubCategory;
	}

	public List<ProductMultimedia> getMultiMediaList() {
		return multiMediaList;
	}

	public void setMultiMediaList(List<ProductMultimedia> multiMediaList) {
		this.multiMediaList = multiMediaList;
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

	public String getProductStatus() {
		return productStatus;
	}

	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}

	public Date getCreatedDateTime() {
		return createdDateTime;
	}

	public void setCreatedDateTime(Date createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getLandPhone() {
		return landPhone;
	}

	public void setLandPhone(String landPhone) {
		this.landPhone = landPhone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
