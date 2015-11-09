package com.isd.sappu.savari.domains;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="system_user_role")
public class SystemUserRole implements Serializable{
	
	private static final long serialVersionUID = 648258389880086882L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int systemUserRoleId;
	
	@ManyToOne
	private SystemUser user;
	
	@ManyToOne
	private UserRole userRole;

	
	
	
	public int getSystemUserRoleId() {
		return systemUserRoleId;
	}

	public void setSystemUserRoleId(int systemUserRoleId) {
		this.systemUserRoleId = systemUserRoleId;
	}

	public SystemUser getUser() {
		return user;
	}

	public void setUser(SystemUser user) {
		this.user = user;
	}

	public UserRole getUserRole() {
		return userRole;
	}

	public void setUserRole(UserRole userRole) {
		this.userRole = userRole;
	}
}
