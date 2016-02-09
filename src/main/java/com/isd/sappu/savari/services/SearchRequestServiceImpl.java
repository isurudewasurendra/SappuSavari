package com.isd.sappu.savari.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isd.sappu.savari.dao.SearchRequestDao;
import com.isd.sappu.savari.domains.SearchRequest;
import com.isd.sappu.savari.domains.SystemUser;
import com.isd.sappu.savari.util.EnumConstant;

@Service
public class SearchRequestServiceImpl implements SearchRequestService{

	@Autowired
	SearchRequestDao searchRequestDao;
	
	@Override
	public SearchRequest getSearchRequestById(long searchRequestId) {
		return searchRequestDao.findOne(searchRequestId);
	}

	@Override
	public SearchRequest saveUpdateSearchRequest(SearchRequest searchRequest) {
		return searchRequestDao.save(searchRequest);
	}

	@Override
	public List<SearchRequest> getAllSearchRequestByUserId(long userId) {
		SystemUser user = new SystemUser();
		user.setUserId(userId);
		return searchRequestDao.findByUser(user);
	}

	@Override
	public void deleteSearchRequest(long searchRequestId) {
		searchRequestDao.delete(searchRequestId);
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
