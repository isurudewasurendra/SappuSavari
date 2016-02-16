package com.isd.sappu.savari.domains;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name="users")
public class SystemUser implements Serializable{

	private static final long serialVersionUID = 5489679679570043539L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long userId;
	
	private String username;
	
	private String password;
	
	private String firstName;
	
	private String lastName;
	
	private String address;
	
	private String profilePic;
	
	private Date dateOfBirth;
	
	private String mobileNo;
	
	private String workNo;
	
	private String homeNo;
	
	private double latitude;
	
	private double longtitude;
	
	private int accuracy;
	
	private int activeStatus;
	
	@OneToMany(mappedBy="user")
	@Cascade(CascadeType.ALL)
	private List<Favorite> favoriteList;
	
	@OneToMany(mappedBy="user")
	@Cascade(CascadeType.ALL)
	private List<Comment> commentList;
	
	@OneToMany(mappedBy="user")
	@Cascade(CascadeType.ALL)
	private List<Rating> ratingList;
	
	@OneToMany(mappedBy="sender")
	@Cascade(CascadeType.ALL)
	private List<Message> messageSentList;
	
	@OneToMany(mappedBy="receiver")
	@Cascade(CascadeType.ALL)
	private List<Message> messageRecievedList;
	
	@OneToMany(mappedBy="user")
	@Cascade(CascadeType.ALL)
	private List<Product> productList;

	@OneToMany(mappedBy="user")
	@Cascade(CascadeType.ALL)
	private List<SystemUserRole> systemUserRoleList;
	
	@OneToMany(mappedBy="user")
	@Cascade(CascadeType.ALL)
	private List<SearchRequest> searchRequestList;
	
	
	
	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getProfilePic() {
		return profilePic;
	}

	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getWorkNo() {
		return workNo;
	}

	public void setWorkNo(String workNo) {
		this.workNo = workNo;
	}

	public String getHomeNo() {
		return homeNo;
	}

	public void setHomeNo(String homeNo) {
		this.homeNo = homeNo;
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

	public List<Message> getMessageSentList() {
		return messageSentList;
	}

	public void setMessageSentList(List<Message> messageSentList) {
		this.messageSentList = messageSentList;
	}

	public List<Message> getMessageRecievedList() {
		return messageRecievedList;
	}

	public void setMessageRecievedList(List<Message> messageRecievedList) {
		this.messageRecievedList = messageRecievedList;
	}

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	public List<SystemUserRole> getSystemUserRoleList() {
		return systemUserRoleList;
	}

	public void setSystemUserRoleList(List<SystemUserRole> systemUserRoleList) {
		this.systemUserRoleList = systemUserRoleList;
	}

	public int getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(int activeStatus) {
		this.activeStatus = activeStatus;
	}

	public List<SearchRequest> getSearchRequestList() {
		return searchRequestList;
	}

	public void setSearchRequestList(List<SearchRequest> searchRequestList) {
		this.searchRequestList = searchRequestList;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongtitude() {
		return longtitude;
	}

	public void setLongtitude(double longtitude) {
		this.longtitude = longtitude;
	}

	public int getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}
	
	public Map<String, Object> toMap() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("userId", this.userId);
		map.put("username", this.username);
		map.put("firstName", this.firstName);
		map.put("address", this.address);
		map.put("mobileNo", this.mobileNo);
		map.put("latitude", this.latitude);
		map.put("longtitude", this.longtitude);
		map.put("accuracy", this.accuracy);
		map.put("activeStatus", this.activeStatus);
		return map;
	}
	
}
