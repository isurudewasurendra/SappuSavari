package com.isd.sappu.savari.services;

import java.util.List;

import com.isd.sappu.savari.domains.SystemUser;
import com.isd.sappu.savari.domains.Product;
import com.isd.sappu.savari.domains.SearchRequest;

public interface ProductService {
	
	public Product saveUpdateProduct(Product product);
	
	public Product getProductById(long productId);
	
	public List<Product> getSuggestedProductsById(long productId);
	
	public List<Product> getAllProducts();
	
	public List<Product> getAllProductByUserId(long userId);
	
	public List<Product> getSearchedProductList(SearchRequest searchRequest);

	public List<Product> getFavoriteProductsByUser(long userId);

	public List<Product> getCommentedProductsByUser(long userId);

	public List<Product> getRelatedProducts(long productId);

	public List<Product> getAssociatedProducts(long productId);

	public List<SystemUser> getBestProductSellers(long productId);

}
