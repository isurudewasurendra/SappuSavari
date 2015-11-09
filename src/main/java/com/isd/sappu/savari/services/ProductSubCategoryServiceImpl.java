package com.isd.sappu.savari.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isd.sappu.savari.dao.ProductSubCategoryDao;
import com.isd.sappu.savari.domains.ProductSubCategory;

@Service
public class ProductSubCategoryServiceImpl implements ProductSubCategoryService {

	@Autowired
	ProductSubCategoryDao productSubCategoryDao;
	
	@Override
	public List<ProductSubCategory> getAllProductSubCategories() {
		return productSubCategoryDao.getAllProductSubCategories();
	}

	@Override
	public List<ProductSubCategory> getAllProductSubCategoriesByProductCategoryId(long productCategoryId) {
		return productSubCategoryDao.getAllProductSubCategoriesByProductCategoryId(productCategoryId);
	}

	@Override
	public ProductSubCategory getProductSubCategoryById(long productSubCategoryId) {
		return productSubCategoryDao.getProductSubCategoryById(productSubCategoryId);
	}

}