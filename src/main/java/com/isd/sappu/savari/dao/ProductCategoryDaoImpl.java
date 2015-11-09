package com.isd.sappu.savari.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.isd.sappu.savari.domains.ProductCategory;

@Repository
@Transactional
public class ProductCategoryDaoImpl implements ProductCategoryDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Transactional
	public long saveOrUpdateProductCategory(ProductCategory productCategory){
		try{
			sessionFactory.getCurrentSession().saveOrUpdate(productCategory);
			return productCategory.getProductCategoryId();
		}catch(Exception e){
			e.printStackTrace();
			return -1;
		}
	}


	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<ProductCategory> getAllProductCategory() {
		try{
			Session session = sessionFactory.getCurrentSession();
            return (List<ProductCategory>) session.createQuery("from ProductCategory").list();
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	};
	
}
