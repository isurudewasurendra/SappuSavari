package com.isd.sappu.savari.services;

import java.util.List;

import com.isd.sappu.savari.domains.District;
import com.isd.sappu.savari.domains.PopularArea;

public interface DistrictService {

	public List<District> getAllDistrict();
	
	public PopularArea getPopularArea(long popularAreaId);
	
	public List<PopularArea> getAllPopularAreaByDistrictId(long districtId);
	
}
