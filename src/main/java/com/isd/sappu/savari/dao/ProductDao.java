package com.isd.sappu.savari.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.isd.sappu.savari.domains.Product;
import com.isd.sappu.savari.domains.SystemUser;

public interface ProductDao extends CrudRepository<Product, Long>{

	public Product findByProductId(long productId);
	
	public List<Product> findAll();
	
	public List<Product> findProductByUser(SystemUser user);

	@Query(value = "select * from products where "
			+ "productSubCategory_productSubCategoryId=:productSubCategoryId and "
			+ "price between :minPrice and :maxPrice and "
			+ "authenticity=:authenticity or 1=:authenticityBoolVal and "
			+ "productType=:productType or 1=:productTypeBoolVal and "
			+ "productBrand=:productBrand or 1=:productBrandBoolVal and "
			+ "productCondition=:productCondition or 1=:productConditionBoolVal"
			, nativeQuery=true)
	public List<Product> getOtherProductList(
			@Param("productSubCategoryId") long productCategoryId,
			@Param("minPrice") double minPrice,
			@Param("maxPrice") double maxPrice,
			@Param("authenticity") String authenticity,
			@Param("authenticityBoolVal") int authenticityBoolVal,
			@Param("productType") String productType,
			@Param("productTypeBoolVal") int productTypeBoolVal,
			@Param("productBrand") String productBrand,
			@Param("productBrandBoolVal") int productBrandBoolVal,
			@Param("productCondition") String productCondition,
			@Param("productConditionBoolVal") int productConditionBoolVal);

	@Query(value = "select * from products where "
			+ "productSubCategory_productSubCategoryId=:productSubCategoryId and "
			+ "price between :minPrice and :maxPrice and "
			+ "productType=:productType or 1=:productTypeBoolVal and "
			+ "productCondition=:productCondition or 1=:productConditionBoolVal and "
			+ "millege between :minMillege and :maxMillege and "
			+ "transmission = :transmission or 1 = :transmissionBoolVal and "
			+ "fuelType = :fuelType or 1 = :fuelTypeBoolVal and "
			+ "bodyType = :bodyType or 1 = :bodyTypeBoolVal"
			, nativeQuery=true)
	public List<Product> getVehicleProductList(
			@Param("productSubCategoryId") long productCategoryId,
			@Param("minPrice") double minPrice,
			@Param("maxPrice") double maxPrice,
			@Param("productType") String productType,
			@Param("productTypeBoolVal") int productTypeBoolVal,
			@Param("productCondition") String productCondition,
			@Param("productConditionBoolVal") int productConditionBoolVal,
			@Param("minMillege") int minMillege,
			@Param("maxMillege") int maxMillege,
			@Param("transmission") String transmission,
			@Param("transmissionBoolVal") int transmissionBoolVal,
			@Param("fuelType") String fuelType,
			@Param("fuelTypeBoolVal") int fuelTypeBoolVal,
			@Param("bodyType") String bodyType,
			@Param("bodyTypeBoolVal") int bodyTypeBoolVal
			);
	

	@Query(value = "select * from products where "
			+ "productSubCategory_productSubCategoryId=:productSubCategoryId and "
			+ "price between :minPrice and :maxPrice and "
			+ "productType=:productType or 1=:productTypeBoolVal and "
			+ "productCondition=:productCondition or 1=:productConditionBoolVal and "
			+ "noOfBathroom between :minNoOfBathroom and :maxNoOfBathroom and "
			+ "noOfRoom between :minNoOfRoom and :maxNoOfRoom"
			, nativeQuery=true)
	public List<Product> getPropertyProductList(
			@Param("productSubCategoryId") long productCategoryId,
			@Param("minPrice") double minPrice,
			@Param("maxPrice") double maxPrice,
			@Param("productType") String productType,
			@Param("productTypeBoolVal") int productTypeBoolVal,
			@Param("productCondition") String productCondition,
			@Param("productConditionBoolVal") int productConditionBoolVal,
			@Param("minNoOfBathroom") int minNoOfBathroom,
			@Param("maxNoOfBathroom") int maxNoOfBathroom,
			@Param("minNoOfRoom") int minNoOfRoom,
			@Param("maxNoOfRoom") int maxNoOfRoom
			);
	
}
