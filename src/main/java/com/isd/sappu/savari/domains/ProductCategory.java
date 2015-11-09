package com.isd.sappu.savari.domains;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;


@Entity
@Table(name="product_categories")
public class ProductCategory implements Serializable{
	
	private static final long serialVersionUID = 5489679679570043539L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long productCategoryId;
	
	private String categoryName;
	
	@OneToMany(mappedBy="productCategory")
	@Cascade(CascadeType.ALL)
	private List<ProductSubCategory> productSubCategoryList;

	
	
	
	public long getProductCategoryId() {
		return productCategoryId;
	}

	public void setProductCategoryId(long productCategoryId) {
		this.productCategoryId = productCategoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

}
