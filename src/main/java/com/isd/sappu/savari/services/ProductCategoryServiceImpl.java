package com.isd.sappu.savari.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isd.sappu.savari.dao.ProductCategoryDao;
import com.isd.sappu.savari.domains.ProductCategory;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService{

	@Autowired
	ProductCategoryDao productCategoryDao;

	@Override
	public ProductCategory saveOrUpdateProductCategory(ProductCategory productCategory) {
		return productCategoryDao.save(productCategory);
	}

	@Override
	public List<ProductCategory> getAllProductCategory() {
		return productCategoryDao.findAll();
	}

	@Override
	public ProductCategory getProductCategory(long id) {
		return productCategoryDao.findOne(id);
	}

	@Override
	public Map<Integer, Integer> getProductViewStat(String chartType, long subProductCategoryId) {
		Map<Integer, Integer> viewStatMap = new HashMap<Integer, Integer>();
		
		if(chartType.contains("VIEW")){
			if(subProductCategoryId == 1){
				viewStatMap.put(1, 33);
				viewStatMap.put(2, 23);
				viewStatMap.put(3, 13);
				viewStatMap.put(4, 19);
				viewStatMap.put(5, 8);
				viewStatMap.put(6, 1);
				viewStatMap.put(7, 0);
				viewStatMap.put(8, 0);
				viewStatMap.put(9, 0);
			}else if(subProductCategoryId == 2){
				viewStatMap.put(1, 19);
				viewStatMap.put(2, 30);
				viewStatMap.put(3, 9);
				viewStatMap.put(4, 13);
				viewStatMap.put(5, 2);
				viewStatMap.put(6, 1);
				viewStatMap.put(7, 0);
				viewStatMap.put(8, 0);
				viewStatMap.put(9, 0);
			}else if(subProductCategoryId == 3){
				viewStatMap.put(1, 8);
				viewStatMap.put(2, 16);
				viewStatMap.put(3, 33);
				viewStatMap.put(4, 22);
				viewStatMap.put(5, 7);
				viewStatMap.put(6, 1);
				viewStatMap.put(7, 0);
				viewStatMap.put(8, 0);
				viewStatMap.put(9, 0);
			}else if(subProductCategoryId == 4){
				viewStatMap.put(1, 4);
				viewStatMap.put(2, 14);
				viewStatMap.put(3, 24);
				viewStatMap.put(4, 33);
				viewStatMap.put(5, 5);
				viewStatMap.put(6, 0);
				viewStatMap.put(7, 0);
				viewStatMap.put(8, 0);
				viewStatMap.put(9, 0);
			}else if(subProductCategoryId == 6){
				viewStatMap.put(1, 4);
				viewStatMap.put(2, 3);
				viewStatMap.put(3, 12);
				viewStatMap.put(4, 6);
				viewStatMap.put(5, 34);
				viewStatMap.put(6, 26);
				viewStatMap.put(7, 1);
				viewStatMap.put(8, 2);
				viewStatMap.put(9, 0);
			}else if(subProductCategoryId == 20){
				viewStatMap.put(1, 2);
				viewStatMap.put(2, 0);
				viewStatMap.put(3, 8);
				viewStatMap.put(4, 2);
				viewStatMap.put(5, 27);
				viewStatMap.put(6, 32);
				viewStatMap.put(7, 4);
				viewStatMap.put(8, 2);
				viewStatMap.put(9, 3);
			}else if(subProductCategoryId == 5){
				viewStatMap.put(1, 2);
				viewStatMap.put(2, 0);
				viewStatMap.put(3, 4);
				viewStatMap.put(4, 0);
				viewStatMap.put(5, 2);
				viewStatMap.put(6, 0);
				viewStatMap.put(7, 26);
				viewStatMap.put(8, 12);
				viewStatMap.put(9, 8);
			}else if(subProductCategoryId == 7){
				viewStatMap.put(1, 2);
				viewStatMap.put(2, 0);
				viewStatMap.put(3, 5);
				viewStatMap.put(4, 0);
				viewStatMap.put(5, 3);
				viewStatMap.put(6, 0);
				viewStatMap.put(7, 18);
				viewStatMap.put(8, 24);
				viewStatMap.put(9, 15);
			}else if(subProductCategoryId == 21){
				viewStatMap.put(1, 1);
				viewStatMap.put(2, 0);
				viewStatMap.put(3, 1);
				viewStatMap.put(4, 0);
				viewStatMap.put(5, 3);
				viewStatMap.put(6, 0);
				viewStatMap.put(7, 10);
				viewStatMap.put(8, 12);
				viewStatMap.put(9, 17);
			}
		}else if(chartType.contains("COMMENT")){
			if(subProductCategoryId == 1){
				viewStatMap.put(1, 18);
				viewStatMap.put(2, 15);
				viewStatMap.put(3, 5);
				viewStatMap.put(4, 8);
				viewStatMap.put(5, 0);
				viewStatMap.put(6, 0);
				viewStatMap.put(7, 0);
				viewStatMap.put(8, 0);
				viewStatMap.put(9, 0);
			}else if(subProductCategoryId == 2){
				viewStatMap.put(1, 12);
				viewStatMap.put(2, 26);
				viewStatMap.put(3, 2);
				viewStatMap.put(4, 8);
				viewStatMap.put(5, 0);
				viewStatMap.put(6, 0);
				viewStatMap.put(7, 0);
				viewStatMap.put(8, 0);
				viewStatMap.put(9, 0);
			}else if(subProductCategoryId == 3){
				viewStatMap.put(1, 1);
				viewStatMap.put(2, 8);
				viewStatMap.put(3, 28);
				viewStatMap.put(4, 12);
				viewStatMap.put(5, 1);
				viewStatMap.put(6, 0);
				viewStatMap.put(7, 0);
				viewStatMap.put(8, 0);
				viewStatMap.put(9, 0);
			}else if(subProductCategoryId == 4){
				viewStatMap.put(1, 2);
				viewStatMap.put(2, 18);
				viewStatMap.put(3, 12);
				viewStatMap.put(4, 24);
				viewStatMap.put(5, 0);
				viewStatMap.put(6, 0);
				viewStatMap.put(7, 0);
				viewStatMap.put(8, 0);
				viewStatMap.put(9, 0);
			}else if(subProductCategoryId == 6){
				viewStatMap.put(1, 1);
				viewStatMap.put(2, 0);
				viewStatMap.put(3, 12);
				viewStatMap.put(4, 2);
				viewStatMap.put(5, 28);
				viewStatMap.put(6, 14);
				viewStatMap.put(7, 0);
				viewStatMap.put(8, 1);
				viewStatMap.put(9, 0);
			}else if(subProductCategoryId == 20){
				viewStatMap.put(1, 1);
				viewStatMap.put(2, 0);
				viewStatMap.put(3, 8);
				viewStatMap.put(4, 0);
				viewStatMap.put(5, 16);
				viewStatMap.put(6, 18);
				viewStatMap.put(7, 3);
				viewStatMap.put(8, 0);
				viewStatMap.put(9, 0);
			}else if(subProductCategoryId == 5){
				viewStatMap.put(1, 1);
				viewStatMap.put(2, 0);
				viewStatMap.put(3, 5);
				viewStatMap.put(4, 3);
				viewStatMap.put(5, 0);
				viewStatMap.put(6, 0);
				viewStatMap.put(7, 24);
				viewStatMap.put(8, 16);
				viewStatMap.put(9, 9);
			}else if(subProductCategoryId == 7){
				viewStatMap.put(1, 1);
				viewStatMap.put(2, 0);
				viewStatMap.put(3, 5);
				viewStatMap.put(4, 3);
				viewStatMap.put(5, 0);
				viewStatMap.put(6, 0);
				viewStatMap.put(7, 15);
				viewStatMap.put(8, 27);
				viewStatMap.put(9, 9);
			}else if(subProductCategoryId == 21){
				viewStatMap.put(1, 1);
				viewStatMap.put(2, 0);
				viewStatMap.put(3, 0);
				viewStatMap.put(4, 0);
				viewStatMap.put(5, 1);
				viewStatMap.put(6, 0);
				viewStatMap.put(7, 9);
				viewStatMap.put(8, 7);
				viewStatMap.put(9, 17);
			}
		}else if(chartType.contains("CONTACT")){
			if(subProductCategoryId == 1){
				viewStatMap.put(1, 12);
				viewStatMap.put(2, 34);
				viewStatMap.put(3, 56);
				viewStatMap.put(4, 12);
				viewStatMap.put(5, 78);
				viewStatMap.put(6, 45);
				viewStatMap.put(7, 67);
				viewStatMap.put(8, 78);
				viewStatMap.put(9, 89);
			}else if(subProductCategoryId == 2){
				viewStatMap.put(1, 12);
				viewStatMap.put(2, 34);
				viewStatMap.put(3, 56);
				viewStatMap.put(4, 12);
				viewStatMap.put(5, 78);
				viewStatMap.put(6, 45);
				viewStatMap.put(7, 67);
				viewStatMap.put(8, 78);
				viewStatMap.put(9, 89);
			}else if(subProductCategoryId == 3){
				viewStatMap.put(1, 12);
				viewStatMap.put(2, 34);
				viewStatMap.put(3, 56);
				viewStatMap.put(4, 12);
				viewStatMap.put(5, 78);
				viewStatMap.put(6, 45);
				viewStatMap.put(7, 67);
				viewStatMap.put(8, 78);
				viewStatMap.put(9, 89);
			}else if(subProductCategoryId == 4){
				viewStatMap.put(1, 12);
				viewStatMap.put(2, 34);
				viewStatMap.put(3, 56);
				viewStatMap.put(4, 12);
				viewStatMap.put(5, 78);
				viewStatMap.put(6, 45);
				viewStatMap.put(7, 67);
				viewStatMap.put(8, 78);
				viewStatMap.put(9, 89);
			}else if(subProductCategoryId == 6){
				viewStatMap.put(1, 12);
				viewStatMap.put(2, 34);
				viewStatMap.put(3, 56);
				viewStatMap.put(4, 12);
				viewStatMap.put(5, 78);
				viewStatMap.put(6, 45);
				viewStatMap.put(7, 67);
				viewStatMap.put(8, 78);
				viewStatMap.put(9, 89);
			}else if(subProductCategoryId == 20){
				viewStatMap.put(1, 12);
				viewStatMap.put(2, 34);
				viewStatMap.put(3, 56);
				viewStatMap.put(4, 12);
				viewStatMap.put(5, 78);
				viewStatMap.put(6, 45);
				viewStatMap.put(7, 67);
				viewStatMap.put(8, 78);
				viewStatMap.put(9, 89);
			}else if(subProductCategoryId == 5){
				viewStatMap.put(1, 12);
				viewStatMap.put(2, 34);
				viewStatMap.put(3, 56);
				viewStatMap.put(4, 12);
				viewStatMap.put(5, 78);
				viewStatMap.put(6, 45);
				viewStatMap.put(7, 67);
				viewStatMap.put(8, 78);
				viewStatMap.put(9, 89);
			}else if(subProductCategoryId == 7){
				viewStatMap.put(1, 12);
				viewStatMap.put(2, 34);
				viewStatMap.put(3, 56);
				viewStatMap.put(4, 12);
				viewStatMap.put(5, 78);
				viewStatMap.put(6, 45);
				viewStatMap.put(7, 67);
				viewStatMap.put(8, 78);
				viewStatMap.put(9, 89);
			}else if(subProductCategoryId == 21){
				viewStatMap.put(1, 12);
				viewStatMap.put(2, 34);
				viewStatMap.put(3, 56);
				viewStatMap.put(4, 12);
				viewStatMap.put(5, 78);
				viewStatMap.put(6, 45);
				viewStatMap.put(7, 67);
				viewStatMap.put(8, 78);
				viewStatMap.put(9, 89);
			}
		}
		
		return viewStatMap;
	}

	@Override
	public Map<Integer, String> getLegendDetails(long subProductCategoryId) {
		Map<Integer, String> legenddatamap = new HashMap<Integer, String>();
		
		legenddatamap.put(1, "Mobile");
		legenddatamap.put(2, "Mobile Accessories");
		legenddatamap.put(3, "Computer");
		legenddatamap.put(4, "Computer Accessories");
		legenddatamap.put(5, "Camera");
		legenddatamap.put(6, "Camera Accessories");
		legenddatamap.put(7, "TV");
		legenddatamap.put(8, "Audio");
		legenddatamap.put(9, "Refrigerator");
		
		return legenddatamap;
	}

	@Override
	public String getChartTitle(String chartType, long subProductCategoryId) {
		String title = "";
		if(chartType.contains("VIEW")){
			if(subProductCategoryId == 1){
				title = "Product View Statistics for Mobile";
			}else if(subProductCategoryId == 2){
				title = "Product View Statistics for Mobile Accessories";
			}else if(subProductCategoryId == 3){
				title = "Product View Statistics for Computer";
			}else if(subProductCategoryId == 4){
				title = "Product View Statistics for Computer Accessories";
			}else if(subProductCategoryId == 6){
				title = "Product View Statistics for Camera";
			}else if(subProductCategoryId == 20){
				title = "Product View Statistics for Camera Accessories";
			}else if(subProductCategoryId == 5){
				title = "Product View Statistics for TV";
			}else if(subProductCategoryId == 7){
				title = "Product View Statistics for Audio";
			}else if(subProductCategoryId == 21){
				title = "Product View Statistics for Refrigirator";
			}
		}else if(chartType.contains("COMMENT")){
			if(subProductCategoryId == 1){
				title = "Comment Statistics for Mobile";
			}else if(subProductCategoryId == 2){
				title = "Comment Statistics for Mobile Accessories";
			}else if(subProductCategoryId == 3){
				title = "Comment Statistics for Computer";
			}else if(subProductCategoryId == 4){
				title = "Comment Statistics for Computer Accessories";
			}else if(subProductCategoryId == 6){
				title = "Comment Statistics for Camera";
			}else if(subProductCategoryId == 20){
				title = "Comment Statistics for Camera Accessories";
			}else if(subProductCategoryId == 5){
				title = "Comment Statistics for TV";
			}else if(subProductCategoryId == 7){
				title = "Comment Statistics for Audio";
			}else if(subProductCategoryId == 21){
				title = "Comment Statistics for Refrigirator";
			}
		}else if(chartType.contains("CONTACT")){
			if(subProductCategoryId == 1){
				title = "Contact Seller Statistics for Mobile";
			}else if(subProductCategoryId == 2){
				title = "Contact Seller Statistics for Mobile Accessories";
			}else if(subProductCategoryId == 3){
				title = "Contact Seller Statistics for Computer";
			}else if(subProductCategoryId == 4){
				title = "Contact Seller Statistics for Computer Accessories";
			}else if(subProductCategoryId == 6){
				title = "Contact Seller Statistics for Camera";
			}else if(subProductCategoryId == 20){
				title = "Contact Seller Statistics for Camera Accessories";
			}else if(subProductCategoryId == 5){
				title = "Contact Seller Statistics for TV";
			}else if(subProductCategoryId == 7){
				title = "Contact Seller Statistics for Audio";
			}else if(subProductCategoryId == 21){
				title = "Contact Seller Statistics for Refrigirator";
			}
		}
		
		return title;
	}
	
	
	
}
