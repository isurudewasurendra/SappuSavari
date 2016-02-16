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
	public SystemUser saveUpdateSystemUser(SystemUser user) {
		return systemUserDao.save(user);
	}

	@Override
	public SystemUser getSystemUser(long userId) {
		return systemUserDao.findOne(userId);
	}

	@Override
	public void deleteSystemUser(SystemUser user) {
		systemUserDao.delete(user);
	}

	@Override
	public SystemUser getSystemUserByUsername(String username) {
		return systemUserDao.findByUsername(username);
	}

	@Override
	public List<SystemUser> getAllSystemUsers() {
		return systemUserDao.findAll();
	}

}
