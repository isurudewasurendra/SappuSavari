package com.isd.sappu.savari.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isd.sappu.savari.dao.ProductDao;
import com.isd.sappu.savari.domains.Product;
import com.isd.sappu.savari.domains.ProductCategory;
import com.isd.sappu.savari.domains.ProductSubCategory;
import com.isd.sappu.savari.domains.SearchRequest;
import com.isd.sappu.savari.util.EnumConstant;

@Service
public class ProductServicesImpl implements ProductService{

	@Autowired
	ProductDao productDao;
	
	@Override
	public List<Product> getAllProducts() {
		return productDao.getAllProducts();
	}

	@Override
	public List<Product> getAllProductByUserId(long userId) {
		return productDao.getAllProductsByUserId(userId);
	}

	@Override
	public long saveUpdateProduct(Product product) {
		return productDao.saveUpdateProduct(product);
	}

	@Override
	public List<Product> getSearchedProductList(SearchRequest searchRequest) {

		ProductSubCategory productSubCategory = searchRequest.getProductSubCategory();
		ProductCategory productCategory = productSubCategory.getProductCategory();
		
		List<Product> productList = new ArrayList<Product>();
		
		if(productCategory.getCategoryName().equals(EnumConstant.ProductCategory.OTHER.toString())){
			productList = productDao.getOtherProductList(searchRequest);
		}else if(productCategory.getCategoryName().equals(EnumConstant.ProductCategory.ELECTRONICS.toString())){
			productList = productDao.getOtherProductList(searchRequest);
		}else if(productCategory.getCategoryName().equals(EnumConstant.ProductCategory.VEHICLE.toString())){
			productList = productDao.getVehicleProductList(searchRequest);
		}else if(productCategory.getCategoryName().equals(EnumConstant.ProductCategory.PROPERTY.toString())){
			productList = productDao.getPropertyProductList(searchRequest);
		}
		
		return productList;
	}

	@Override
	public Product getProductById(long productId) {
		return productDao.getProduct(productId);
	}

}
