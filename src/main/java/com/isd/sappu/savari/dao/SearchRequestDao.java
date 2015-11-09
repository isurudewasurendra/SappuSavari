package com.isd.sappu.savari.dao;

import java.util.List;

import com.isd.sappu.savari.domains.SearchRequest;

public interface SearchRequestDao {

	public SearchRequest getSearchRequestById(long searchRequestId);
	
	public long saveUpdateSearchRequest(SearchRequest searchRequest);
	
	public String deleteSearchRequest(long searchRequestId);
	
	public List<SearchRequest> getAllSearchRequestByUserId(long userId);
	
}
