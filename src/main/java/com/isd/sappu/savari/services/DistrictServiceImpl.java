package com.isd.sappu.savari.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isd.sappu.savari.dao.DistrictDao;
import com.isd.sappu.savari.dao.PopularAreaDao;
import com.isd.sappu.savari.domains.District;
import com.isd.sappu.savari.domains.PopularArea;

@Service
public class DistrictServiceImpl implements DistrictService {
	
	@Autowired
	DistrictDao districtDao;
	
	@Autowired
	PopularAreaDao popularAreaDao;
	
	@Override
	public List<District> getAllDistrict() {
		return districtDao.findAll();
	}

	@Override
	public List<PopularArea> getAllPopularAreaByDistrictId(long districtId) {
		District district = new District();
		district.setDistrictId(districtId);
		return popularAreaDao.findByDistrict(district);
	}

	@Override
	public PopularArea getPopularArea(long popularAreaId) {
		return popularAreaDao.findByAreaId(popularAreaId);
	}
	

}
