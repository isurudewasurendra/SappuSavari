package com.isd.sappu.savari.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.isd.sappu.savari.domains.ProductMultimedia;

@Repository
@Transactional
public class ProductMultimediaDaoImpl implements ProductMultimediaDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<ProductMultimedia> getMultimediaList(long productId) {
		try{
			Session session = sessionFactory.getCurrentSession();
            return (List<ProductMultimedia>) session.createQuery("from ProductMultimedia where product.productId=:productId")
            		.setParameter("productId", productId).list();
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

}
