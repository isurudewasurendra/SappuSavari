package com.isd.sappu.savari.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.isd.sappu.savari.domains.SystemUser;

public interface SystemUserDao extends CrudRepository<SystemUser, Long>{

	public SystemUser findByUsername(String username);
	
	public SystemUser findByUserId(long userId);
	
	public List<SystemUser> findAll();
	
}
