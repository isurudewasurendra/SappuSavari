package com.isd.sappu.savari.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.isd.sappu.savari.domains.District;
import com.isd.sappu.savari.domains.PopularArea;

@Repository
@Transactional
public class DistrictDaoImpl implements DistrictDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<District> getAllDistricts() {
		try{
			Session session = sessionFactory.getCurrentSession();
            return (List<District>) session.createQuery("from District").list();
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<PopularArea> getPopularAreaByDistrictId(long districtId) {
		try{
			Session session = sessionFactory.getCurrentSession();
            return (List<PopularArea>) session.createQuery("from PopularArea where district.districtId=:districtId")
            		.setParameter("districtId", districtId).list();
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public PopularArea getPopularAreaById(long popularAreaId) {
		try{
			Session session = sessionFactory.getCurrentSession();
			return (PopularArea) session.get(PopularArea.class, popularAreaId);
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
}
