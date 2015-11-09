package com.isd.sappu.savari.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.isd.sappu.savari.domains.SearchRequest;
import com.isd.sappu.savari.util.EnumConstant;

@Repository
@Transactional
public class SearchRequestDaoImpl implements SearchRequestDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public SearchRequest getSearchRequestById(long searchRequestId) {
		try{
			Session session = sessionFactory.getCurrentSession();
            return (SearchRequest) session.get(SearchRequest.class, searchRequestId);
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	@Override
	@Transactional
	public long saveUpdateSearchRequest(SearchRequest searchRequest) {
		try{
			sessionFactory.getCurrentSession().saveOrUpdate(searchRequest);
			return searchRequest.getSearchRequestId();
		}catch(Exception e){
			e.printStackTrace();
			return -1;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<SearchRequest> getAllSearchRequestByUserId(long userId) {
		try{
			Session session = sessionFactory.getCurrentSession();
            return (List<SearchRequest>) session.createQuery("from SearchRequest where user.userId=:userId")
            		.setParameter("userId", userId).list();
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	@Override
	@Transactional
	public String deleteSearchRequest(long searchRequestId) {
		try{
			SearchRequest searchRequest = this.getSearchRequestById(searchRequestId);
			sessionFactory.getCurrentSession().delete(searchRequest);
			return EnumConstant.ReturnStatus.SUCCESS.toString();
		}catch(Exception e){
			e.printStackTrace();
			return EnumConstant.ReturnStatus.SUCCESS.toString();
		}
	}

}
