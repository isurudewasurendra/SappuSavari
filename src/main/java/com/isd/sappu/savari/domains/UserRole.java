package com.isd.sappu.savari.domains;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.springframework.security.core.GrantedAuthority;

@Entity
@Table(name="user_role")
public class UserRole implements GrantedAuthority {

	private static final long serialVersionUID = 648258389880086882L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userRoleId;
	
	@OneToMany(mappedBy="userRole")
	@Cascade(CascadeType.ALL)
	private List<SystemUserRole> systemUserRoles;
	 
	private String authority;

	
	
	public int getUserRoleId() {
		return userRoleId;
	}

	public void setUserRoleId(int userRoleId) {
		this.userRoleId = userRoleId;
	}

	public List<SystemUserRole> getSystemUserRoles() {
		return systemUserRoles;
	}

	public void setSystemUserRoles(List<SystemUserRole> systemUserRoles) {
		this.systemUserRoles = systemUserRoles;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}
	
}
