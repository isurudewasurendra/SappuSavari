package com.isd.sappu.savari.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isd.sappu.savari.dao.UserRoleDao;
import com.isd.sappu.savari.domains.UserRole;

@Service
public class UserRoleServiceImpl implements UserRoleService {
	
	@Autowired
	UserRoleDao userRoleDao;

	@Override
	public UserRole getUserRoleByRole(String role) {
		return userRoleDao.findByAuthority(role);
	}

}
