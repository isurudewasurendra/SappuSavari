package com.isd.sappu.savari.services;

import com.isd.sappu.savari.domains.SystemUser;

public interface SystemUserService {

	public long saveUpdateSystemUser(SystemUser user);
	
	public SystemUser getSystemUserByUsername(String username);
	
	public SystemUser getSystemUser(long userId);
	
	public String deleteSystemUser(SystemUser user);
	
}