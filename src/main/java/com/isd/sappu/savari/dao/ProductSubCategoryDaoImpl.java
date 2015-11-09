package com.isd.sappu.savari.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.isd.sappu.savari.domains.ProductSubCategory;

@Repository
@Transactional
public class ProductSubCategoryDaoImpl implements ProductSubCategoryDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public long saveProductSubCategory(ProductSubCategoryDao productSubCategory) {
		// TODO Auto-generated method stub
		return 0;
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<ProductSubCategory> getAllProductSubCategories() {
		try{
			Session session = sessionFactory.getCurrentSession();
            return (List<ProductSubCategory>) session.createQuery("from ProductSubCategory").list();
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<ProductSubCategory> getAllProductSubCategoriesByProductCategoryId(long productCategoryId) {
		try{
			Session session = sessionFactory.getCurrentSession();
            return (List<ProductSubCategory>) session.createQuery("from ProductSubCategory where productCategory.productCategoryId=:productCategoryId")
            		.setParameter("productCategoryId", productCategoryId).list();
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	@Override
	@Transactional
	public ProductSubCategory getProductSubCategoryById(long productSubCategoryId) {
		try{
			Session session = sessionFactory.getCurrentSession();
            return (ProductSubCategory) session.get(ProductSubCategory.class, productSubCategoryId);
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	};


	
}
