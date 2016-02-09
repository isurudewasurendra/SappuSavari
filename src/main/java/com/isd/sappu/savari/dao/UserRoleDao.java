package com.isd.sappu.savari.dao;

import org.springframework.data.repository.CrudRepository;

import com.isd.sappu.savari.domains.UserRole;

public interface UserRoleDao extends CrudRepository<UserRole, Long>{

	UserRole findByAuthority(String authority);
}
