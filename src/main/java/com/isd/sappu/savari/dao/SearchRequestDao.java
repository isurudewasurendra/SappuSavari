package com.isd.sappu.savari.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.isd.sappu.savari.domains.SearchRequest;
import com.isd.sappu.savari.domains.SystemUser;

public interface SearchRequestDao extends CrudRepository<SearchRequest, Long>{

	public SearchRequest findBySearchRequestId(long searchRequestId);
	
	public List<SearchRequest> findByUser(SystemUser user);
	
}
