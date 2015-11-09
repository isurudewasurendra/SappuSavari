package com.isd.sappu.savari.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isd.sappu.savari.dao.ProductCategoryDao;
import com.isd.sappu.savari.domains.ProductCategory;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService{

	@Autowired
	ProductCategoryDao productCategoryDao;

	@Override
	public long saveOrUpdateProductCategory(ProductCategory productCategory) {
		return productCategoryDao.saveOrUpdateProductCategory(productCategory);
	}

	@Override
	public List<ProductCategory> getAllProductCategory() {
		return productCategoryDao.getAllProductCategory();
	}
	
	
	
}
