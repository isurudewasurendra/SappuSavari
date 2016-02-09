package com.isd.sappu.savari.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.isd.sappu.savari.domains.District;

public interface DistrictDao extends CrudRepository<District, Long>{

	public List<District> findAll();
	
}
