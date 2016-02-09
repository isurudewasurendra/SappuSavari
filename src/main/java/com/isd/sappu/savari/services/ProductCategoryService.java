package com.isd.sappu.savari.services;

import java.util.List;

import com.isd.sappu.savari.domains.ProductCategory;

public interface ProductCategoryService {
	
	public ProductCategory saveOrUpdateProductCategory(ProductCategory productCategory);
	
	public List<ProductCategory> getAllProductCategory();

}
