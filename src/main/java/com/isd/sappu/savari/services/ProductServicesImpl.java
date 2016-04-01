package com.isd.sappu.savari.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isd.sappu.savari.dao.ProductDao;
import com.isd.sappu.savari.domains.Comment;
import com.isd.sappu.savari.domains.Favorite;
import com.isd.sappu.savari.domains.Product;
import com.isd.sappu.savari.domains.ProductCategory;
import com.isd.sappu.savari.domains.ProductSubCategory;
import com.isd.sappu.savari.domains.SearchRequest;
import com.isd.sappu.savari.domains.SystemUser;
import com.isd.sappu.savari.util.EnumConstant;

import weka.core.Instance;
import weka.experiment.InstanceQuery;

@Service
public class ProductServicesImpl implements ProductService{

	@Autowired
	ProductDao productDao;
	
	@Autowired
	FavoriteService favoriteService;
	
	@Autowired
	CommentService commentService;
	
	@Override
	public List<Product> getAllProducts() {
		return productDao.findAll();
	}

	@Override
	public List<Product> getAllProductByUserId(long userId) {
		SystemUser user = new SystemUser();
		user.setUserId(userId);
		return productDao.findProductByUser(user);
	}

	@Override
	public Product saveUpdateProduct(Product product) {
		return productDao.save(product);
	}

	@Override
	public List<Product> getSearchedProductList(SearchRequest searchRequest) {

		ProductSubCategory productSubCategory = searchRequest.getProductSubCategory();
		ProductCategory productCategory = productSubCategory.getProductCategory();
		
		List<Product> productList = new ArrayList<Product>();
		
		if(productCategory.getCategoryName().equals(EnumConstant.ProductCategory.OTHER.toString())){
			productList = productDao.getOtherProductList(
					searchRequest.getProductSubCategory().getProductSubCategoryId(),
					(searchRequest.getMinPrice()==0)?Double.MIN_VALUE:searchRequest.getMinPrice(),
					(searchRequest.getMaxPrice()==0)?Double.MAX_VALUE:searchRequest.getMaxPrice(),
					searchRequest.getAuthenticity(), (searchRequest.getAuthenticity()==null)?1:0,
					searchRequest.getProductType(), (searchRequest.getProductType()==null)?1:0,
					searchRequest.getBrand(), (searchRequest.getBrand()==null)?1:0,
					searchRequest.getProductCondition(), (searchRequest.getProductCondition()==null)?1:0
					);
		}else if(productCategory.getCategoryName().equals(EnumConstant.ProductCategory.ELECTRONICS.toString())){
			productList = productDao.getOtherProductList(
					searchRequest.getProductSubCategory().getProductSubCategoryId(),
					(searchRequest.getMinPrice()==0)?Double.MIN_VALUE:searchRequest.getMinPrice(),
					(searchRequest.getMaxPrice()==0)?Double.MAX_VALUE:searchRequest.getMaxPrice(),
					searchRequest.getAuthenticity(), (searchRequest.getAuthenticity()==null)?1:0,
					searchRequest.getProductType(), (searchRequest.getProductType()==null)?1:0,
					searchRequest.getBrand(), (searchRequest.getBrand()==null)?1:0,
					searchRequest.getProductCondition(), (searchRequest.getProductCondition()==null)?1:0
					);
		}else if(productCategory.getCategoryName().equals(EnumConstant.ProductCategory.VEHICLE.toString())){
			productList = productDao.getVehicleProductList(
					searchRequest.getProductSubCategory().getProductSubCategoryId(),
					(searchRequest.getMinPrice()==0)?Double.MIN_VALUE:searchRequest.getMinPrice(),
					(searchRequest.getMaxPrice()==0)?Double.MAX_VALUE:searchRequest.getMaxPrice(),
					searchRequest.getProductType(), (searchRequest.getProductType()==null)?1:0,
					searchRequest.getProductCondition(), (searchRequest.getProductCondition()==null)?1:0,
					(searchRequest.getMinMillege()==0)?Integer.MIN_VALUE:searchRequest.getMinMillege(),
					(searchRequest.getMaxMillege()==0)?Integer.MAX_VALUE:searchRequest.getMaxMillege(),
					searchRequest.getTransmission(), (searchRequest.getTransmission()==null)?1:0,
					searchRequest.getFuelType(), (searchRequest.getFuelType()==null)?1:0,
					searchRequest.getBodyType(), (searchRequest.getBodyType()==null)?1:0
					);
		}else if(productCategory.getCategoryName().equals(EnumConstant.ProductCategory.PROPERTY.toString())){
			productList = productDao.getPropertyProductList(
					searchRequest.getProductSubCategory().getProductSubCategoryId(),
					(searchRequest.getMinPrice()==0)?Double.MIN_VALUE:searchRequest.getMinPrice(),
					(searchRequest.getMaxPrice()==0)?Double.MAX_VALUE:searchRequest.getMaxPrice(),
					searchRequest.getProductType(), (searchRequest.getProductType()==null)?1:0,
					searchRequest.getProductCondition(), (searchRequest.getProductCondition()==null)?1:0,
					(searchRequest.getMinNoOfBathroom()==0)?Integer.MIN_VALUE:searchRequest.getMinNoOfBathroom(),
					(searchRequest.getMaxNoOfBathroom()==0)?Integer.MAX_VALUE:searchRequest.getMaxNoOfBathroom(),
					(searchRequest.getMinNoOfRoom()==0)?Integer.MIN_VALUE:searchRequest.getMinNoOfRoom(),
					(searchRequest.getMaxNoOfRoom()==0)?Integer.MAX_VALUE:searchRequest.getMaxNoOfRoom()
					);
		}
		
		return productList;
	}

	@Override
	public Product getProductById(long productId) {
		return productDao.findOne(productId);
	}

	@Override
	public List<Product> getFavoriteProductsByUser(long userId) {
		try {
			List<Favorite> favoriteList = favoriteService.getFavoritesByUserId(userId);
			List<Product> productList = new ArrayList<Product>();
			for (Favorite favorite : favoriteList) {
				productList.add(productDao.findOne(favorite.getProduct().getProductId()));
			}
			return productList;
		} catch (Exception e) {
			System.out.println("error occured when get products for the user's favorite selection");
			e.printStackTrace();
			return null;
		}
		
	}

	@Override
	public List<Product> getCommentedProductsByUser(long userId) {
		try {
			List<Comment> commentList = commentService.getCommentListByUserId(userId);
			List<Product> productList = new ArrayList<Product>();
			for (Comment comment : commentList) {
				productList.add(productDao.findOne(comment.getProduct().getProductId()));
			}
			return productList;
		} catch (Exception e) {
			System.out.println("error occured when get products for the user's comments");
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Product> getSuggestedProductsById(long productId) {

		try {
			InstanceQuery query = new InstanceQuery();
			query.setUsername("nobody");
			query.setPassword("");
			query.setQuery("select * from whatsoever");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

}
