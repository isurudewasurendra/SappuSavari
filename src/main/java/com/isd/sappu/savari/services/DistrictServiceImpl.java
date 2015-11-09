package com.isd.sappu.savari.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isd.sappu.savari.dao.DistrictDao;
import com.isd.sappu.savari.domains.District;
import com.isd.sappu.savari.domains.PopularArea;

@Service
public class DistrictServiceImpl implements DistrictService {
	
	@Autowired
	DistrictDao districtDao;
	
	@Override
	public List<District> getAllDistrict() {
		return districtDao.getAllDistricts();
	}

	@Override
	public List<PopularArea> getAllPopularAreaByDistrictId(long districtId) {
		return districtDao.getPopularAreaByDistrictId(districtId);
	}

	@Override
	public PopularArea getPopularArea(long popularAreaId) {
		return districtDao.getPopularAreaById(popularAreaId);
	}
	

}
