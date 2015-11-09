package com.isd.sappu.savari.dao;

import java.util.List;

import com.isd.sappu.savari.domains.ProductCategory;

public interface ProductCategoryDao {

	public long saveOrUpdateProductCategory(ProductCategory productCategory);
	
	public List<ProductCategory> getAllProductCategory();
	
}
