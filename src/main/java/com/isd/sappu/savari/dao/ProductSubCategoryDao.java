package com.isd.sappu.savari.dao;

import java.util.List;

import com.isd.sappu.savari.domains.ProductSubCategory;

public interface ProductSubCategoryDao {

	public long saveProductSubCategory(ProductSubCategoryDao productSubCategory);
	
	public ProductSubCategory getProductSubCategoryById(long productSubCategoryId);
	
	public List<ProductSubCategory> getAllProductSubCategories();
	
	public List<ProductSubCategory> getAllProductSubCategoriesByProductCategoryId(long productCategoryId);
	
}
