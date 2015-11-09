package com.isd.sappu.savari.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.isd.sappu.savari.domains.ProductSubCategory;

@Service
public interface ProductSubCategoryService {
	
	public ProductSubCategory getProductSubCategoryById(long productSubCategoryId);

	public List<ProductSubCategory> getAllProductSubCategories();
	
	public List<ProductSubCategory> getAllProductSubCategoriesByProductCategoryId(long productCategoryId);
	
}
