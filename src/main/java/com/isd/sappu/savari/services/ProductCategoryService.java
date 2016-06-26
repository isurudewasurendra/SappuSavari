package com.isd.sappu.savari.services;

import java.util.List;
import java.util.Map;

import com.isd.sappu.savari.domains.ProductCategory;

public interface ProductCategoryService {
	
	public ProductCategory getProductCategory(long id);
	
	public ProductCategory saveOrUpdateProductCategory(ProductCategory productCategory);
	
	public List<ProductCategory> getAllProductCategory();
	
	public String getChartTitle(String chartType, long subProductCategoryId);
	
	public Map<Integer, String> getLegendDetails(long subProductCategoryId);
	
	public Map<Integer, Integer> getProductViewStat(String chartType, long subProductCategoryId);

}
