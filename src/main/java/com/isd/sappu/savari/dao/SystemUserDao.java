package com.isd.sappu.savari.dao;

import com.isd.sappu.savari.domains.SystemUser;

public interface SystemUserDao {

	public long saveUpdateSystemUser(SystemUser user);
	
	public SystemUser getSystemUserByUsername(String username);
	
	public SystemUser getSystemUser(long userId);
	
	public String deleteSystemUser(SystemUser user);
	
}
