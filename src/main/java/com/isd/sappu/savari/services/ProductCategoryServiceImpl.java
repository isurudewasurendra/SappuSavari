package com.isd.sappu.savari.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isd.sappu.savari.dao.ProductCategoryDao;
import com.isd.sappu.savari.dao.SearchSessionDao;
import com.isd.sappu.savari.domains.ProductCategory;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService{

	@Autowired
	ProductCategoryDao productCategoryDao;
	
	@Autowired
	SearchSessionDao searchSessionDao;

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
				int mobile = searchSessionDao.getParentSessionList(1).size();
				viewStatMap.put(1, mobile);
				int mobileAccessories = searchSessionDao.getRelatedSearchSessionList(2, 1).size();
				viewStatMap.put(2, mobileAccessories);
				int computer = searchSessionDao.getRelatedSearchSessionList(3, 1).size();
				viewStatMap.put(3, computer);
				int computerAccessories = searchSessionDao.getRelatedSearchSessionList(4, 1).size();
				viewStatMap.put(4, computerAccessories);
				int camera = searchSessionDao.getRelatedSearchSessionList(6, 1).size();
				viewStatMap.put(5, camera);
				int cameraAccessories = searchSessionDao.getRelatedSearchSessionList(20, 1).size();
				viewStatMap.put(6, cameraAccessories);
				int tv = searchSessionDao.getRelatedSearchSessionList(5, 1).size();
				viewStatMap.put(7, tv);
				int audio = searchSessionDao.getRelatedSearchSessionList(7, 1).size();
				viewStatMap.put(8, audio);
				int fridge = searchSessionDao.getRelatedSearchSessionList(21, 1).size();
				viewStatMap.put(9, fridge);
			}else if(subProductCategoryId == 2){
				int mobile = searchSessionDao.getRelatedSearchSessionList(1, 2).size();
				viewStatMap.put(1, mobile);
				int mobileAccessories = searchSessionDao.getParentSessionList(2).size();
				viewStatMap.put(2, mobileAccessories);
				int computer = searchSessionDao.getRelatedSearchSessionList(3, 2).size();
				viewStatMap.put(3, computer);
				int computerAccessories = searchSessionDao.getRelatedSearchSessionList(4, 2).size();
				viewStatMap.put(4, computerAccessories);
				int camera = searchSessionDao.getRelatedSearchSessionList(6, 2).size();
				viewStatMap.put(5, camera);
				int cameraAccessories = searchSessionDao.getRelatedSearchSessionList(20, 2).size();
				viewStatMap.put(6, cameraAccessories);
				int tv = searchSessionDao.getRelatedSearchSessionList(5, 2).size();
				viewStatMap.put(7, tv);
				int audio = searchSessionDao.getRelatedSearchSessionList(7, 2).size();
				viewStatMap.put(8, audio);
				int fridge = searchSessionDao.getRelatedSearchSessionList(21, 2).size();
				viewStatMap.put(9, fridge);
			}else if(subProductCategoryId == 3){
				int mobile = searchSessionDao.getRelatedSearchSessionList(1, 3).size();
				viewStatMap.put(1, mobile);
				int mobileAccessories = searchSessionDao.getRelatedSearchSessionList(2, 3).size();
				viewStatMap.put(2, mobileAccessories);
				int computer = searchSessionDao.getParentSessionList(3).size();
				viewStatMap.put(3, computer);
				int computerAccessories = searchSessionDao.getRelatedSearchSessionList(4, 3).size();
				viewStatMap.put(4, computerAccessories);
				int camera = searchSessionDao.getRelatedSearchSessionList(6, 3).size();
				viewStatMap.put(5, camera);
				int cameraAccessories = searchSessionDao.getRelatedSearchSessionList(20, 3).size();
				viewStatMap.put(6, cameraAccessories);
				int tv = searchSessionDao.getRelatedSearchSessionList(5, 3).size();
				viewStatMap.put(7, tv);
				int audio = searchSessionDao.getRelatedSearchSessionList(7, 3).size();
				viewStatMap.put(8, audio);
				int fridge = searchSessionDao.getRelatedSearchSessionList(21, 3).size();
				viewStatMap.put(9, fridge);
			}else if(subProductCategoryId == 4){
				int mobile = searchSessionDao.getRelatedSearchSessionList(1, 4).size();
				viewStatMap.put(1, mobile);
				int mobileAccessories = searchSessionDao.getRelatedSearchSessionList(2, 4).size();
				viewStatMap.put(2, mobileAccessories);
				int computer = searchSessionDao.getRelatedSearchSessionList(3, 4).size();
				viewStatMap.put(3, computer);
				int computerAccessories = searchSessionDao.getParentSessionList(4).size();
				viewStatMap.put(4, computerAccessories);
				int camera = searchSessionDao.getRelatedSearchSessionList(6, 4).size();
				viewStatMap.put(5, camera);
				int cameraAccessories = searchSessionDao.getRelatedSearchSessionList(20, 4).size();
				viewStatMap.put(6, cameraAccessories);
				int tv = searchSessionDao.getRelatedSearchSessionList(5, 4).size();
				viewStatMap.put(7, tv);
				int audio = searchSessionDao.getRelatedSearchSessionList(7, 4).size();
				viewStatMap.put(8, audio);
				int fridge = searchSessionDao.getRelatedSearchSessionList(21, 4).size();
				viewStatMap.put(9, fridge);
			}else if(subProductCategoryId == 6){
				int mobile = searchSessionDao.getRelatedSearchSessionList(1, 6).size();
				viewStatMap.put(1, mobile);
				int mobileAccessories = searchSessionDao.getRelatedSearchSessionList(2, 6).size();
				viewStatMap.put(2, mobileAccessories);
				int computer = searchSessionDao.getRelatedSearchSessionList(3, 6).size();
				viewStatMap.put(3, computer);
				int computerAccessories = searchSessionDao.getRelatedSearchSessionList(4, 6).size();
				viewStatMap.put(4, computerAccessories);
				int camera = searchSessionDao.getParentSessionList(6).size();
				viewStatMap.put(5, camera);
				int cameraAccessories = searchSessionDao.getRelatedSearchSessionList(20, 6).size();
				viewStatMap.put(6, cameraAccessories);
				int tv = searchSessionDao.getRelatedSearchSessionList(5, 6).size();
				viewStatMap.put(7, tv);
				int audio = searchSessionDao.getRelatedSearchSessionList(7, 6).size();
				viewStatMap.put(8, audio);
				int fridge = searchSessionDao.getRelatedSearchSessionList(21, 6).size();
				viewStatMap.put(9, fridge);
			}else if(subProductCategoryId == 20){
				int mobile = searchSessionDao.getRelatedSearchSessionList(1, 20).size();
				viewStatMap.put(1, mobile);
				int mobileAccessories = searchSessionDao.getRelatedSearchSessionList(2, 20).size();
				viewStatMap.put(2, mobileAccessories);
				int computer = searchSessionDao.getRelatedSearchSessionList(3, 20).size();
				viewStatMap.put(3, computer);
				int computerAccessories = searchSessionDao.getRelatedSearchSessionList(4, 20).size();
				viewStatMap.put(4, computerAccessories);
				int camera = searchSessionDao.getRelatedSearchSessionList(6, 20).size();
				viewStatMap.put(5, camera);
				int cameraAccessories = searchSessionDao.getParentSessionList(20).size();
				viewStatMap.put(6, cameraAccessories);
				int tv = searchSessionDao.getRelatedSearchSessionList(5, 20).size();
				viewStatMap.put(7, tv);
				int audio = searchSessionDao.getRelatedSearchSessionList(7, 20).size();
				viewStatMap.put(8, audio);
				int fridge = searchSessionDao.getRelatedSearchSessionList(21, 20).size();
				viewStatMap.put(9, fridge);
			}else if(subProductCategoryId == 5){
				int mobile = searchSessionDao.getRelatedSearchSessionList(1, 5).size();
				viewStatMap.put(1, mobile);
				int mobileAccessories = searchSessionDao.getRelatedSearchSessionList(2, 5).size();
				viewStatMap.put(2, mobileAccessories);
				int computer = searchSessionDao.getRelatedSearchSessionList(3, 5).size();
				viewStatMap.put(3, computer);
				int computerAccessories = searchSessionDao.getRelatedSearchSessionList(4, 5).size();
				viewStatMap.put(4, computerAccessories);
				int camera = searchSessionDao.getRelatedSearchSessionList(6, 5).size();
				viewStatMap.put(5, camera);
				int cameraAccessories = searchSessionDao.getRelatedSearchSessionList(20, 5).size();
				viewStatMap.put(6, cameraAccessories);
				int tv = searchSessionDao.getParentSessionList(5).size();
				viewStatMap.put(7, tv);
				int audio = searchSessionDao.getRelatedSearchSessionList(7, 5).size();
				viewStatMap.put(8, audio);
				int fridge = searchSessionDao.getRelatedSearchSessionList(21, 5).size();
				viewStatMap.put(9, fridge);
			}else if(subProductCategoryId == 7){
				int mobile = searchSessionDao.getRelatedSearchSessionList(1, 7).size();
				viewStatMap.put(1, mobile);
				int mobileAccessories = searchSessionDao.getRelatedSearchSessionList(2, 7).size();
				viewStatMap.put(2, mobileAccessories);
				int computer = searchSessionDao.getRelatedSearchSessionList(3, 7).size();
				viewStatMap.put(3, computer);
				int computerAccessories = searchSessionDao.getRelatedSearchSessionList(4, 7).size();
				viewStatMap.put(4, computerAccessories);
				int camera = searchSessionDao.getRelatedSearchSessionList(6, 7).size();
				viewStatMap.put(5, camera);
				int cameraAccessories = searchSessionDao.getRelatedSearchSessionList(20, 7).size();
				viewStatMap.put(6, cameraAccessories);
				int tv = searchSessionDao.getRelatedSearchSessionList(5, 7).size();
				viewStatMap.put(7, tv);
				int audio = searchSessionDao.getParentSessionList(7).size();
				viewStatMap.put(8, audio);
				int fridge = searchSessionDao.getRelatedSearchSessionList(21, 7).size();
				viewStatMap.put(9, fridge);
			}else if(subProductCategoryId == 21){
				int mobile = searchSessionDao.getRelatedSearchSessionList(1, 21).size();
				viewStatMap.put(1, mobile);
				int mobileAccessories = searchSessionDao.getRelatedSearchSessionList(2, 21).size();
				viewStatMap.put(2, mobileAccessories);
				int computer = searchSessionDao.getRelatedSearchSessionList(3, 21).size();
				viewStatMap.put(3, computer);
				int computerAccessories = searchSessionDao.getRelatedSearchSessionList(4, 21).size();
				viewStatMap.put(4, computerAccessories);
				int camera = searchSessionDao.getRelatedSearchSessionList(6, 21).size();
				viewStatMap.put(5, camera);
				int cameraAccessories = searchSessionDao.getRelatedSearchSessionList(20, 21).size();
				viewStatMap.put(6, cameraAccessories);
				int tv = searchSessionDao.getRelatedSearchSessionList(5, 21).size();
				viewStatMap.put(7, tv);
				int audio = searchSessionDao.getRelatedSearchSessionList(7, 21).size();
				viewStatMap.put(8, audio);
				int fridge = searchSessionDao.getParentSessionList(21).size();
				viewStatMap.put(9, fridge);
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

	@Override
	public double getConfidentLevel(long subProductCategoryId, long parentSubProductCategoryId) {
		if(parentSubProductCategoryId == 1){
			int mobile = searchSessionDao.getParentSessionList(1).size();
			if(subProductCategoryId == 1){
				return ((double)mobile/(double)mobile)*100;
			}else if(subProductCategoryId == 2){
				int mobileAccessories = searchSessionDao.getRelatedSearchSessionList(2, 1).size();
				return ((double)mobileAccessories/(double)mobile)*100;
			}else if(subProductCategoryId == 3){
				int computer = searchSessionDao.getRelatedSearchSessionList(3, 1).size();
				return ((double)computer/(double)mobile)*100;
			}else if(subProductCategoryId == 4){
				int computerAccessories = searchSessionDao.getRelatedSearchSessionList(4, 1).size();
				return ((double)computerAccessories/(double)mobile)*100;
			}else if(subProductCategoryId == 6){
				int camera = searchSessionDao.getRelatedSearchSessionList(6, 1).size();
				return ((double)camera/(double)mobile)*100;
			}else if(subProductCategoryId == 20){
				int cameraAccessories = searchSessionDao.getRelatedSearchSessionList(20, 1).size();
				return ((double)cameraAccessories/(double)mobile)*100;
			}else if(subProductCategoryId == 5){
				int tv = searchSessionDao.getRelatedSearchSessionList(5, 1).size();
				return ((double)tv/(double)mobile)*100;
			}else if(subProductCategoryId == 7){
				int audio = searchSessionDao.getRelatedSearchSessionList(7, 1).size();
				return ((double)audio/(double)mobile)*100;
			}else if(subProductCategoryId == 21){
				int fridge = searchSessionDao.getRelatedSearchSessionList(21, 1).size();
				return ((double)fridge/(double)mobile)*100;
			}
		}else if(parentSubProductCategoryId == 2){
			int mobileAccessories = searchSessionDao.getParentSessionList(2).size();
			if(subProductCategoryId == 1){
				int mobile = searchSessionDao.getRelatedSearchSessionList(1, 2).size();
				return ((double)mobile/(double)mobileAccessories)*100;
			}else if(subProductCategoryId == 2){
				return ((double)mobileAccessories/(double)mobileAccessories)*100;
			}else if(subProductCategoryId == 3){
				int computer = searchSessionDao.getRelatedSearchSessionList(3, 1).size();
				return ((double)computer/(double)mobileAccessories)*100;
			}else if(subProductCategoryId == 4){
				int computerAccessories = searchSessionDao.getRelatedSearchSessionList(4, 1).size();
				return ((double)computerAccessories/(double)mobileAccessories)*100;
			}else if(subProductCategoryId == 6){
				int camera = searchSessionDao.getRelatedSearchSessionList(6, 1).size();
				return ((double)camera/(double)mobileAccessories)*100;
			}else if(subProductCategoryId == 20){
				int cameraAccessories = searchSessionDao.getRelatedSearchSessionList(20, 1).size();
				return ((double)cameraAccessories/(double)mobileAccessories)*100;
			}else if(subProductCategoryId == 5){
				int tv = searchSessionDao.getRelatedSearchSessionList(5, 1).size();
				return ((double)tv/(double)mobileAccessories)*100;
			}else if(subProductCategoryId == 7){
				int audio = searchSessionDao.getRelatedSearchSessionList(7, 1).size();
				return ((double)audio/(double)mobileAccessories)*100;
			}else if(subProductCategoryId == 21){
				int fridge = searchSessionDao.getRelatedSearchSessionList(21, 1).size();
				return ((double)fridge/(double)mobileAccessories)*100;
			}
		}else if(parentSubProductCategoryId == 3){
			int computer = searchSessionDao.getParentSessionList(3).size();
			if(subProductCategoryId == 1){
				int mobile = searchSessionDao.getRelatedSearchSessionList(1, 2).size();
				return ((double)mobile/(double)computer)*100;
			}else if(subProductCategoryId == 2){
				int mobileAccessories = searchSessionDao.getRelatedSearchSessionList(2, 3).size();
				return ((double)mobileAccessories/(double)computer)*100;
			}else if(subProductCategoryId == 3){
				return ((double)computer/(double)computer)*100;
			}else if(subProductCategoryId == 4){
				int computerAccessories = searchSessionDao.getRelatedSearchSessionList(4, 1).size();
				return ((double)computerAccessories/(double)computer)*100;
			}else if(subProductCategoryId == 6){
				int camera = searchSessionDao.getRelatedSearchSessionList(6, 1).size();
				return ((double)camera/(double)computer)*100;
			}else if(subProductCategoryId == 20){
				int cameraAccessories = searchSessionDao.getRelatedSearchSessionList(20, 1).size();
				return ((double)cameraAccessories/(double)computer)*100;
			}else if(subProductCategoryId == 5){
				int tv = searchSessionDao.getRelatedSearchSessionList(5, 1).size();
				return ((double)tv/(double)computer)*100;
			}else if(subProductCategoryId == 7){
				int audio = searchSessionDao.getRelatedSearchSessionList(7, 1).size();
				return ((double)audio/(double)computer)*100;
			}else if(subProductCategoryId == 21){
				int fridge = searchSessionDao.getRelatedSearchSessionList(21, 1).size();
				return ((double)fridge/(double)computer)*100;
			}
		}else if(parentSubProductCategoryId == 4){
			int computerAccessories = searchSessionDao.getParentSessionList(4).size();
			if(subProductCategoryId == 1){
				int mobile = searchSessionDao.getRelatedSearchSessionList(1, 2).size();
				return ((double)mobile/(double)computerAccessories)*100;
			}else if(subProductCategoryId == 2){
				int mobileAccessories = searchSessionDao.getRelatedSearchSessionList(2, 3).size();
				return ((double)mobileAccessories/(double)computerAccessories)*100;
			}else if(subProductCategoryId == 3){
				int computer = searchSessionDao.getRelatedSearchSessionList(3, 4).size();
				return ((double)computer/(double)computerAccessories)*100;
			}else if(subProductCategoryId == 4){
				return ((double)computerAccessories/(double)computerAccessories)*100;
			}else if(subProductCategoryId == 6){
				int camera = searchSessionDao.getRelatedSearchSessionList(6, 1).size();
				return ((double)camera/(double)computerAccessories)*100;
			}else if(subProductCategoryId == 20){
				int cameraAccessories = searchSessionDao.getRelatedSearchSessionList(20, 1).size();
				return ((double)cameraAccessories/(double)computerAccessories)*100;
			}else if(subProductCategoryId == 5){
				int tv = searchSessionDao.getRelatedSearchSessionList(5, 1).size();
				return ((double)tv/(double)computerAccessories)*100;
			}else if(subProductCategoryId == 7){
				int audio = searchSessionDao.getRelatedSearchSessionList(7, 1).size();
				return ((double)audio/(double)computerAccessories)*100;
			}else if(subProductCategoryId == 21){
				int fridge = searchSessionDao.getRelatedSearchSessionList(21, 1).size();
				return ((double)fridge/(double)computerAccessories)*100;
			}
		}else if(parentSubProductCategoryId == 6){
			int camera = searchSessionDao.getParentSessionList(6).size();
			if(subProductCategoryId == 1){
				int mobile = searchSessionDao.getRelatedSearchSessionList(1, 2).size();
				return ((double)mobile/(double)camera)*100;
			}else if(subProductCategoryId == 2){
				int mobileAccessories = searchSessionDao.getRelatedSearchSessionList(2, 3).size();
				return ((double)mobileAccessories/(double)camera)*100;
			}else if(subProductCategoryId == 3){
				int computer = searchSessionDao.getRelatedSearchSessionList(3, 4).size();
				return ((double)computer/(double)camera)*100;
			}else if(subProductCategoryId == 4){
				int computerAccessories = searchSessionDao.getRelatedSearchSessionList(4, 6).size();
				return ((double)computerAccessories/(double)camera)*100;
			}else if(subProductCategoryId == 6){
				return ((double)camera/(double)camera)*100;
			}else if(subProductCategoryId == 20){
				int cameraAccessories = searchSessionDao.getRelatedSearchSessionList(20, 1).size();
				return ((double)cameraAccessories/(double)camera)*100;
			}else if(subProductCategoryId == 5){
				int tv = searchSessionDao.getRelatedSearchSessionList(5, 1).size();
				return ((double)tv/(double)camera)*100;
			}else if(subProductCategoryId == 7){
				int audio = searchSessionDao.getRelatedSearchSessionList(7, 1).size();
				return ((double)audio/(double)camera)*100;
			}else if(subProductCategoryId == 21){
				int fridge = searchSessionDao.getRelatedSearchSessionList(21, 1).size();
				return ((double)fridge/(double)camera)*100;
			}
		}else if(parentSubProductCategoryId == 20){
			int cameraAccessories = searchSessionDao.getParentSessionList(20).size();
			if(subProductCategoryId == 1){
				int mobile = searchSessionDao.getRelatedSearchSessionList(1, 2).size();
				return ((double)mobile/(double)cameraAccessories)*100;
			}else if(subProductCategoryId == 2){
				int mobileAccessories = searchSessionDao.getRelatedSearchSessionList(2, 3).size();
				return ((double)mobileAccessories/(double)cameraAccessories)*100;
			}else if(subProductCategoryId == 3){
				int computer = searchSessionDao.getRelatedSearchSessionList(3, 4).size();
				return ((double)computer/(double)cameraAccessories)*100;
			}else if(subProductCategoryId == 4){
				int computerAccessories = searchSessionDao.getRelatedSearchSessionList(4, 6).size();
				return ((double)computerAccessories/(double)cameraAccessories)*100;
			}else if(subProductCategoryId == 6){
				int camera = searchSessionDao.getRelatedSearchSessionList(6, 20).size();
				return ((double)camera/(double)cameraAccessories)*100;
			}else if(subProductCategoryId == 20){
				return ((double)cameraAccessories/(double)cameraAccessories)*100;
			}else if(subProductCategoryId == 5){
				int tv = searchSessionDao.getRelatedSearchSessionList(5, 1).size();
				return ((double)tv/(double)cameraAccessories)*100;
			}else if(subProductCategoryId == 7){
				int audio = searchSessionDao.getRelatedSearchSessionList(7, 1).size();
				return ((double)audio/(double)cameraAccessories)*100;
			}else if(subProductCategoryId == 21){
				int fridge = searchSessionDao.getRelatedSearchSessionList(21, 1).size();
				return ((double)fridge/(double)cameraAccessories)*100;
			}
		}else if(parentSubProductCategoryId == 5){
			int tv = searchSessionDao.getParentSessionList(5).size();
			if(subProductCategoryId == 1){
				int mobile = searchSessionDao.getRelatedSearchSessionList(1, 2).size();
				return ((double)mobile/(double)tv)*100;
			}else if(subProductCategoryId == 2){
				int mobileAccessories = searchSessionDao.getRelatedSearchSessionList(2, 3).size();
				return ((double)mobileAccessories/(double)tv)*100;
			}else if(subProductCategoryId == 3){
				int computer = searchSessionDao.getRelatedSearchSessionList(3, 4).size();
				return ((double)computer/(double)tv)*100;
			}else if(subProductCategoryId == 4){
				int computerAccessories = searchSessionDao.getRelatedSearchSessionList(4, 6).size();
				return ((double)computerAccessories/(double)tv)*100;
			}else if(subProductCategoryId == 6){
				int camera = searchSessionDao.getRelatedSearchSessionList(6, 20).size();
				return ((double)camera/(double)tv)*100;
			}else if(subProductCategoryId == 20){
				int cameraAccessories = searchSessionDao.getRelatedSearchSessionList(20, 5).size();
				return ((double)cameraAccessories/(double)tv)*100;
			}else if(subProductCategoryId == 5){
				return ((double)tv/(double)tv)*100;
			}else if(subProductCategoryId == 7){
				int audio = searchSessionDao.getRelatedSearchSessionList(7, 1).size();
				return ((double)audio/(double)tv)*100;
			}else if(subProductCategoryId == 21){
				int fridge = searchSessionDao.getRelatedSearchSessionList(21, 1).size();
				return ((double)fridge/(double)tv)*100;
			}
		}else if(parentSubProductCategoryId == 7){
			int audio = searchSessionDao.getParentSessionList(7).size();
			if(subProductCategoryId == 1){
				int mobile = searchSessionDao.getRelatedSearchSessionList(1, 2).size();
				return ((double)mobile/(double)audio)*100;
			}else if(subProductCategoryId == 2){
				int mobileAccessories = searchSessionDao.getRelatedSearchSessionList(2, 3).size();
				return ((double)mobileAccessories/(double)audio)*100;
			}else if(subProductCategoryId == 3){
				int computer = searchSessionDao.getRelatedSearchSessionList(3, 4).size();
				return ((double)computer/(double)audio)*100;
			}else if(subProductCategoryId == 4){
				int computerAccessories = searchSessionDao.getRelatedSearchSessionList(4, 6).size();
				return ((double)computerAccessories/(double)audio)*100;
			}else if(subProductCategoryId == 6){
				int camera = searchSessionDao.getRelatedSearchSessionList(6, 20).size();
				return ((double)camera/(double)audio)*100;
			}else if(subProductCategoryId == 20){
				int cameraAccessories = searchSessionDao.getRelatedSearchSessionList(20, 5).size();
				return ((double)cameraAccessories/(double)audio)*100;
			}else if(subProductCategoryId == 5){
				int tv = searchSessionDao.getRelatedSearchSessionList(5, 7).size();
				return ((double)tv/(double)audio)*100;
			}else if(subProductCategoryId == 7){
				return ((double)audio/(double)audio)*100;
			}else if(subProductCategoryId == 21){
				int fridge = searchSessionDao.getRelatedSearchSessionList(21, 1).size();
				return ((double)fridge/(double)audio)*100;
			}
		}else if(parentSubProductCategoryId == 21){
			int fridge = searchSessionDao.getParentSessionList(21).size();
			if(subProductCategoryId == 1){
				int mobile = searchSessionDao.getRelatedSearchSessionList(1, 2).size();
				return ((double)mobile/(double)fridge)*100;
			}else if(subProductCategoryId == 2){
				int mobileAccessories = searchSessionDao.getRelatedSearchSessionList(2, 3).size();
				return ((double)mobileAccessories/(double)fridge)*100;
			}else if(subProductCategoryId == 3){
				int computer = searchSessionDao.getRelatedSearchSessionList(3, 4).size();
				return ((double)computer/(double)fridge)*100;
			}else if(subProductCategoryId == 4){
				int computerAccessories = searchSessionDao.getRelatedSearchSessionList(4, 6).size();
				return ((double)computerAccessories/(double)fridge)*100;
			}else if(subProductCategoryId == 6){
				int camera = searchSessionDao.getRelatedSearchSessionList(6, 20).size();
				return ((double)camera/(double)fridge)*100;
			}else if(subProductCategoryId == 20){
				int cameraAccessories = searchSessionDao.getRelatedSearchSessionList(20, 5).size();
				return ((double)cameraAccessories/(double)fridge)*100;
			}else if(subProductCategoryId == 5){
				int tv = searchSessionDao.getRelatedSearchSessionList(5, 7).size();
				return ((double)tv/(double)fridge)*100;
			}else if(subProductCategoryId == 7){
				int audio = searchSessionDao.getRelatedSearchSessionList(7, 21).size();
				return ((double)audio/(double)fridge)*100;
			}else if(subProductCategoryId == 21){
				return ((double)fridge/(double)fridge)*100;
			}
		}
		return 0;
	}
	
	
	
}
