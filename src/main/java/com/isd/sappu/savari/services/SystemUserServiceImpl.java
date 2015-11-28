package com.isd.sappu.savari.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isd.sappu.savari.dao.SystemUserDao;
import com.isd.sappu.savari.domains.SystemUser;

@Service
public class SystemUserServiceImpl implements SystemUserService{

	@Autowired
	private SystemUserDao systemUserDao;
	
	@Override
	public long saveUpdateSystemUser(SystemUser user) {
		return systemUserDao.saveUpdateSystemUser(user);
	}

	@Override
	public SystemUser getSystemUser(long userId) {
		return systemUserDao.getSystemUser(userId);
	}

	@Override
	public String deleteSystemUser(SystemUser user) {
		return systemUserDao.deleteSystemUser(user);
	}

	@Override
	public SystemUser getSystemUserByUsername(String username) {
		return systemUserDao.getSystemUserByUsername(username);
	}

	@Override
	public List<SystemUser> getAllSystemUsers() {
		return systemUserDao.getAllSystemUsers();
	}

}
