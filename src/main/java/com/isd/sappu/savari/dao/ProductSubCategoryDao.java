package com.isd.sappu.savari.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.isd.sappu.savari.domains.ProductCategory;
import com.isd.sappu.savari.domains.ProductSubCategory;

public interface ProductSubCategoryDao extends CrudRepository<ProductSubCategory, Long>{

	public ProductSubCategory findByProductSubCategoryId(long productSubCategoryId);
	
	public List<ProductSubCategory> findAll();
	
	public List<ProductSubCategory> findByProductCategory(ProductCategory productCategory);
	
}
