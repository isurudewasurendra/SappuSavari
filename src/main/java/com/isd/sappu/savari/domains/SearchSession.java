package com.isd.sappu.savari.domains;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="search_session")
public class SearchSession {

	private static final long serialVersionUID = 5489679679570043539L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String searchSession;
	
	private long productCategory;
	
	private String parentSearchSession;
	
	private boolean isParent;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(long productCategory) {
		this.productCategory = productCategory;
	}

	public boolean isParent() {
		return isParent;
	}

	public void setParent(boolean isParent) {
		this.isParent = isParent;
	}

	public String getSearchSession() {
		return searchSession;
	}

	public void setSearchSession(String searchSession) {
		this.searchSession = searchSession;
	}

	public String getParentSearchSession() {
		return parentSearchSession;
	}

	public void setParentSearchSession(String parentSearchSession) {
		this.parentSearchSession = parentSearchSession;
	}
	
	
	
}
