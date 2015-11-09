package com.isd.sappu.savari.domains;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name="popular_areas")
public class PopularArea implements Serializable{
	
	private static final long serialVersionUID = 5489679679570043539L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long areaId;
	
	private String areaName;
	
	@ManyToOne
	private District district;

	@OneToMany(mappedBy="popularArea")
	@Cascade(CascadeType.ALL)
	private List<Product> productList;
	
	@OneToMany(mappedBy="popularArea")
	@Cascade(CascadeType.ALL)
	private List<SearchRequest> searchReqeustList;
	
	
	
	public long getAreaId() {
		return areaId;
	}

	public void setAreaId(long areaId) {
		this.areaId = areaId;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public District getDistrict() {
		return district;
	}

	public void setDistrict(District district) {
		this.district = district;
	}

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	public List<SearchRequest> getSearchReqeustList() {
		return searchReqeustList;
	}

	public void setSearchReqeustList(List<SearchRequest> searchReqeustList) {
		this.searchReqeustList = searchReqeustList;
	}
	
}
