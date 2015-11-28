package com.isd.sappu.savari.dao;

import java.util.List;

import com.isd.sappu.savari.domains.Product;
import com.isd.sappu.savari.domains.SearchRequest;

public interface ProductDao {

	public long saveUpdateProduct(Product product);
	
	public Product getProduct(long productId);
	
	public String deleteProduct(Product product);
	
	public List<Product> getAllProducts();
	
	public List<Product> getAllProductsByUserId(long userId);
	
	public List<Product> getVehicleProductList(SearchRequest searchRequest);
	
	public List<Product> getPropertyProductList(SearchRequest searchRequest);
	
	public List<Product> getOtherProductList(SearchRequest searchRequest);

}
