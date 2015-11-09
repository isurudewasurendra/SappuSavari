package com.isd.sappu.savari.services;

import java.util.List;

import com.isd.sappu.savari.domains.SearchRequest;

public interface SearchRequestService {

	public SearchRequest getSearchRequestById(long searchRequestId);
	
	public long saveUpdateSearchRequest(SearchRequest searchRequest);
	
	public String deleteSearchRequest(long searchRequestId);
	
	public String deleteUserSearchRequst(long userId);
	
	public List<SearchRequest> getAllSearchRequestByUserId(long userId);
	
}
