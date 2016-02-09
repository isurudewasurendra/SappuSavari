package com.isd.sappu.savari.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.isd.sappu.savari.domains.District;
import com.isd.sappu.savari.domains.PopularArea;

public interface PopularAreaDao extends CrudRepository<PopularArea, Long>{

	public PopularArea findByAreaId(long areaId);
	
	public List<PopularArea> findByDistrict(District district);
	
}
