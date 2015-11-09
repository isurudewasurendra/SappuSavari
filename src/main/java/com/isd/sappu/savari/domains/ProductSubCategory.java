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
@Table(name="product_sub_categories")
public class ProductSubCategory implements Serializable{

	private static final long serialVersionUID = 5489679679570043539L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long productSubCategoryId;
	
	private String subCategoryName;
	
	@OneToMany(mappedBy="productSubCategory")
	@Cascade(CascadeType.ALL)
	private List<Product> productList;
	
	@OneToMany(mappedBy="productSubCategory")
	@Cascade(CascadeType.ALL)
	private List<SearchRequest> searchRequestList;
	
	@ManyToOne
	private ProductCategory productCategory;

	
	
	
	public long getProductSubCategoryId() {
		return productSubCategoryId;
	}

	public void setProductSubCategoryId(long productSubCategoryId) {
		this.productSubCategoryId = productSubCategoryId;
	}

	public String getSubCategoryName() {
		return subCategoryName;
	}

	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
	}

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	public ProductCategory getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(ProductCategory productCategory) {
		this.productCategory = productCategory;
	}

	public List<SearchRequest> getSearchRequestList() {
		return searchRequestList;
	}

	public void setSearchRequestList(List<SearchRequest> searchRequestList) {
		this.searchRequestList = searchRequestList;
	}
	
}
