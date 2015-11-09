package com.isd.sappu.savari.dao;

import java.util.List;

import com.isd.sappu.savari.domains.District;
import com.isd.sappu.savari.domains.PopularArea;

public interface DistrictDao {

	public List<District> getAllDistricts();
	
	public PopularArea getPopularAreaById(long popularAreaId);
	
	public List<PopularArea> getPopularAreaByDistrictId(long districtId);
	
}
