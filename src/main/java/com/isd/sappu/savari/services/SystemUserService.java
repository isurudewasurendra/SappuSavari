package com.isd.sappu.savari.services;

import java.util.List;

import com.isd.sappu.savari.domains.SystemUser;

public interface SystemUserService {

	public SystemUser saveUpdateSystemUser(SystemUser user);
	
	public SystemUser getSystemUserByUsername(String username);
	
	public SystemUser getSystemUser(long userId);
	
	public void deleteSystemUser(SystemUser user);
	
	public List<SystemUser> getAllSystemUsers();
	
}
