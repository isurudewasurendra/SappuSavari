package com.isd.sappu.savari.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.isd.sappu.savari.domains.Product;
import com.isd.sappu.savari.domains.SearchRequest;
import com.isd.sappu.savari.util.EnumConstant;

@Repository
@Transactional
public class ProductDaoImpl implements ProductDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public long saveUpdateProduct(Product product) {
		try{
			sessionFactory.getCurrentSession().saveOrUpdate(product);
			return product.getProductId();
		}catch(Exception e){
			e.printStackTrace();
			return -1;
		}
	}

	@Override
	@Transactional
	public Product getProduct(long productId) {
		try{
			Session session = sessionFactory.getCurrentSession();
            return (Product) session.get(Product.class, productId);
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	@Override
	@Transactional
	public String deleteProduct(Product product) {
		try{
			sessionFactory.getCurrentSession().delete(product);
			return EnumConstant.ReturnStatus.SUCCESS.toString();
		}catch(Exception e){
			e.printStackTrace();
			return EnumConstant.ReturnStatus.ERROR.toString();
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Product> getAllProducts() {
		try{
			Session session = sessionFactory.getCurrentSession();
            return (List<Product>) session.createQuery("from Product").list();
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Product> getAllProductsByUserId(long userId) {
		try{
			Session session = sessionFactory.getCurrentSession();
            return (List<Product>) session.createQuery("from Product where user.userId = :userId")
            		.setParameter("userId", userId).list();
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Product> getVehicleProductList(SearchRequest searchRequest) {
		try {
			Session session = sessionFactory.getCurrentSession();
			 return (List<Product>) session.createQuery("from Product where "
			 		+ "productSubCategory.productSubCategoryId = :productSubCategoryId and "
			 		+ "price between :minPrice and :maxPrice and "
			 		+ "productType = :productType or 1 = :productTypeBoolVal and "
			 		+ "productCondition = :productCondition or 1 = :productConditionBoolVal "
			 		+ "millege between :minMillege and :maxMillege and "
			 		+ "transmission = :transmission or 1 = :transmissionBoolVal and "
			 		+ "fuelType = :fuelType or 1 = :fuelTypeBoolVal and "
			 		+ "bodyType = :bodyType or 1 = :bodyTypeBoolVal ")
					 .setParameter("productSubCategoryId", searchRequest.getProductSubCategory().getProductSubCategoryId())
					 .setParameter("minPrice", (searchRequest.getMinPrice()==0)?Double.MIN_VALUE:searchRequest.getMinPrice())
					 .setParameter("maxPrice", (searchRequest.getMaxPrice()==0)?Double.MAX_VALUE:searchRequest.getMaxPrice())
					 .setParameter("productType", searchRequest.getProductType())
					 .setParameter("productTypeBoolVal", (searchRequest.getProductType()==null)?1:0)
					 .setParameter("productCondition", searchRequest.getProductCondition())
					 .setParameter("productConditionBoolVal", (searchRequest.getProductCondition()==null)?1:0)
					 .setParameter("minMillege", (searchRequest.getMinMillege()==0)?Double.MIN_VALUE:searchRequest.getMinMillege())
					 .setParameter("maxMillege", (searchRequest.getMaxMillege()==0)?Double.MAX_VALUE:searchRequest.getMaxMillege())
					 .setParameter("transmission", searchRequest.getTransmission())
					 .setParameter("transmissionBoolVal", (searchRequest.getTransmission()==null)?1:0)
					 .setParameter("fuelType", searchRequest.getFuelType())
					 .setParameter("fuelTypeBoolVal", (searchRequest.getFuelType()==null)?1:0)
					 .setParameter("bodyType", searchRequest.getBodyType())
					 .setParameter("bodyTypeBoolVal", (searchRequest.getBodyType()==null)?1:0)
					 .list();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Product> getPropertyProductList(SearchRequest searchRequest) {
		try {
			Session session = sessionFactory.getCurrentSession();
			 return (List<Product>) session.createQuery("from Product where "
			 		+ "productSubCategory.productSubCategoryId = :productSubCategoryId and "
			 		+ "price between :minPrice and :maxPrice and "
			 		+ "productType = :productType or 1 = :productTypeBoolVal and "
			 		+ "productCondition = :productCondition or 1 = :productConditionBoolVal "
			 		+ "noOfBathroom between :minNoOfBathroom and :maxNoOfBathroom "
			 		+ "noOfRoom between :minNoOfRoom and :maxNoOfRoom ")
					 .setParameter("productSubCategoryId", searchRequest.getProductSubCategory().getProductSubCategoryId())
					 .setParameter("minPrice", (searchRequest.getMinPrice()==0)?Double.MIN_VALUE:searchRequest.getMinPrice())
					 .setParameter("maxPrice", (searchRequest.getMaxPrice()==0)?Double.MAX_VALUE:searchRequest.getMaxPrice())
					 .setParameter("productType", searchRequest.getProductType())
					 .setParameter("productTypeBoolVal", (searchRequest.getProductType()==null)?1:0)
					 .setParameter("productCondition", searchRequest.getProductCondition())
					 .setParameter("productConditionBoolVal", (searchRequest.getProductCondition()==null)?1:0)
					 .setParameter("minNoOfBathroom", (searchRequest.getMinNoOfBathroom()==0)?Double.MIN_VALUE:searchRequest.getMinNoOfBathroom())
					 .setParameter("maxNoOfBathroom", (searchRequest.getMaxNoOfBathroom()==0)?Double.MAX_VALUE:searchRequest.getMaxNoOfBathroom())
					 .setParameter("minNoOfRoom", (searchRequest.getMinNoOfRoom()==0)?Double.MIN_VALUE:searchRequest.getMinNoOfRoom())
					 .setParameter("maxNoOfRoom", (searchRequest.getMaxNoOfRoom()==0)?Double.MAX_VALUE:searchRequest.getMaxNoOfRoom())
					 .list();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Product> getOtherProductList(SearchRequest searchRequest) {
		try{
			Session session = sessionFactory.getCurrentSession();
            return (List<Product>) session.createQuery("from Product where "
            		+ "productSubCategory.productSubCategoryId = :productSubCategoryId and "
            		+ "price between :minPrice and :maxPrice and "
            		+ "authenticity = :authenticity or 1 = :authenticityBoolVal and "
            		+ "productType = :productType or 1 = :productTypeBoolVal and "
            		+ "productBrand = :productBrand or 1 = :productBrandBoolVal and "
            		+ "productCondition = :productCondition or 1 = :productConditionBoolVal ")
            		.setParameter("productSubCategoryId", searchRequest.getProductSubCategory().getProductSubCategoryId())
            		.setParameter("minPrice", (searchRequest.getMinPrice()==0)?Double.MIN_VALUE:searchRequest.getMinPrice())
            		.setParameter("maxPrice", (searchRequest.getMaxPrice()==0)?Double.MAX_VALUE:searchRequest.getMaxPrice())
            		.setParameter("authenticity", searchRequest.getAuthenticity())
            		.setParameter("authenticityBoolVal", (searchRequest.getAuthenticity()==null)?1:0)
            		.setParameter("productType", searchRequest.getProductType())
            		.setParameter("productTypeBoolVal", (searchRequest.getProductType()==null)?1:0)
            		.setParameter("productBrand", searchRequest.getBrand())
            		.setParameter("productBrandBoolVal", (searchRequest.getBrand()==null)?1:0)
            		.setParameter("productCondition", searchRequest.getProductCondition())
            		.setParameter("productConditionBoolVal", (searchRequest.getProductCondition()==null)?1:0)
            		.list();
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

}
