package com.isd.sappu.savari.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isd.sappu.savari.dao.SearchRequestDao;
import com.isd.sappu.savari.domains.SearchRequest;
import com.isd.sappu.savari.util.EnumConstant;

@Service
public class SearchRequestServiceImpl implements SearchRequestService{

	@Autowired
	SearchRequestDao searchRequestDao;
	
	@Override
	public SearchRequest getSearchRequestById(long searchRequestId) {
		return searchRequestDao.getSearchRequestById(searchRequestId);
	}

	@Override
	public long saveUpdateSearchRequest(SearchRequest searchRequest) {
		return searchRequestDao.saveUpdateSearchRequest(searchRequest);
	}

	@Override
	public List<SearchRequest> getAllSearchRequestByUserId(long userId) {
		return searchRequestDao.getAllSearchRequestByUserId(userId);
	}

	@Override
	public String deleteSearchRequest(long searchRequestId) {
		return searchRequestDao.deleteSearchRequest(searchRequestId);
	}

	@Override
	public String deleteUserSearchRequst(long userId) {
		List<SearchRequest> searchRequestList = this.getAllSearchRequestByUserId(userId);
		for (SearchRequest searchRequest : searchRequestList) {
			this.deleteSearchRequest(searchRequest.getSearchRequestId());
		}
		return EnumConstant.ReturnStatus.SUCCESS.toString();
	}

}
