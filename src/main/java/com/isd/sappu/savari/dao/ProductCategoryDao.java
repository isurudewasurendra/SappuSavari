package com.isd.sappu.savari.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.isd.sappu.savari.domains.ProductCategory;

public interface ProductCategoryDao extends CrudRepository<ProductCategory, Long>{

	public List<ProductCategory> findAll();
	
}
