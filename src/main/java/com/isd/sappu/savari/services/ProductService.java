package com.isd.sappu.savari.services;

import java.util.List;

import com.isd.sappu.savari.domains.Product;
import com.isd.sappu.savari.domains.SearchRequest;

public interface ProductService {
	
	public long saveUpdateProduct(Product product);
	
	public Product getProductById(long productId);
	
	public List<Product> getAllProducts();
	
	public List<Product> getAllProductByUserId(long userId);
	
	public List<Product> getSearchedProductList(SearchRequest searchRequest);

	public List<Product> getFavoriteProductsByUser(long userId);

	public List<Product> getCommentedProductsByUser(long userId);

}
