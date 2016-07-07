package com.isd.sappu.savari.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.isd.sappu.savari.domains.SearchSession;

public interface SearchSessionDao extends CrudRepository<SearchSession, Long>{

	@Query(value = "select * from search_session where isParent=1 and productCategory=:productCategoryId", nativeQuery=true)
	public List<SearchSession> getParentSessionList(@Param("productCategoryId") long productCategoryId);
	
	@Query(value = 
			"select * from sappudb.search_session where productCategory=:relatedProductCategoryId and parentSearchSession in ("+
				"select searchSession from sappudb.search_session where isParent=1 and productCategory=:productCategoryId"+
			")", 
			nativeQuery=true)
	public List<SearchSession> getRelatedSearchSessionList(@Param("relatedProductCategoryId") long relatedProductCategoryId, 
			@Param("productCategoryId") long productCategoryId);
	
}
