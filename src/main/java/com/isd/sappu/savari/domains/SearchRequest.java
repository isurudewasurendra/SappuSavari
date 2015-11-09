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
@Table(name="search_request")
public class SearchRequest implements Serializable{

	private static final long serialVersionUID = 5489679679570043539L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long searchRequestId;
	
	private String title;
	
	private String description;
	
	private String address;
	
	private double minPrice;
	
	private double maxPrice;
	
	private String authenticity;
	
	private String productType;
	
	private String brand;
	
	private String model;
	
	private String productCondition;
	
	private String modelYear;
	
	private int minMillege;
	
	private int maxMillege;
	
	private String transmission;
	
	private String fuelType;
	
	private String bodyType;
	
	private int minNoOfBathroom;
	
	private int maxNoOfBathroom;
	
	private int minNoOfRoom;
	
	private int maxNoOfRoom;
	
	@ManyToOne
	private PopularArea popularArea;
	
	@ManyToOne
	private ProductSubCategory productSubCategory;
	
	@ManyToOne
	private SystemUser user;
	
	private Date createdDateTime;

	
	
	public long getSearchRequestId() {
		return searchRequestId;
	}

	public void setSearchRequestId(long searchRequestId) {
		this.searchRequestId = searchRequestId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(double minPrice) {
		this.minPrice = minPrice;
	}

	public double getMaxPrice() {
		return maxPrice;
	}

	public void setMaxPrice(double maxPrice) {
		this.maxPrice = maxPrice;
	}

	public String getAuthenticity() {
		return authenticity;
	}

	public void setAuthenticity(String authenticity) {
		this.authenticity = authenticity;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getProductCondition() {
		return productCondition;
	}

	public void setProductCondition(String productCondition) {
		this.productCondition = productCondition;
	}

	public SystemUser getUser() {
		return user;
	}

	public void setUser(SystemUser user) {
		this.user = user;
	}

	public Date getCreatedDateTime() {
		return createdDateTime;
	}

	public void setCreatedDateTime(Date createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public String getModelYear() {
		return modelYear;
	}

	public void setModelYear(String modelYear) {
		this.modelYear = modelYear;
	}

	public int getMinMillege() {
		return minMillege;
	}

	public void setMinMillege(int minMillege) {
		this.minMillege = minMillege;
	}

	public int getMaxMillege() {
		return maxMillege;
	}

	public void setMaxMillege(int maxMillege) {
		this.maxMillege = maxMillege;
	}

	public PopularArea getPopularArea() {
		return popularArea;
	}

	public void setPopularArea(PopularArea popularArea) {
		this.popularArea = popularArea;
	}

	public ProductSubCategory getProductSubCategory() {
		return productSubCategory;
	}

	public void setProductSubCategory(ProductSubCategory productSubCategory) {
		this.productSubCategory = productSubCategory;
	}

	public String getTransmission() {
		return transmission;
	}

	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String getBodyType() {
		return bodyType;
	}

	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}

	public int getMinNoOfBathroom() {
		return minNoOfBathroom;
	}

	public void setMinNoOfBathroom(int minNoOfBathroom) {
		this.minNoOfBathroom = minNoOfBathroom;
	}

	public int getMaxNoOfBathroom() {
		return maxNoOfBathroom;
	}

	public void setMaxNoOfBathroom(int maxNoOfBathroom) {
		this.maxNoOfBathroom = maxNoOfBathroom;
	}

	public int getMinNoOfRoom() {
		return minNoOfRoom;
	}

	public void setMinNoOfRoom(int minNoOfRoom) {
		this.minNoOfRoom = minNoOfRoom;
	}

	public int getMaxNoOfRoom() {
		return maxNoOfRoom;
	}

	public void setMaxNoOfRoom(int maxNoOfRoom) {
		this.maxNoOfRoom = maxNoOfRoom;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
}
