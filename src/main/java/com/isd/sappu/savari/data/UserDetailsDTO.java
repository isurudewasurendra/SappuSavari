package com.isd.sappu.savari.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.isd.sappu.savari.domains.SystemUser;
import com.isd.sappu.savari.domains.SystemUserRole;
import com.isd.sappu.savari.domains.UserRole;

public class UserDetailsDTO implements UserDetails {

	private static final long serialVersionUID = 7167248715261536044L;
	
	private final long userID;
    private final String login;
    private final String passwordHash;
    private final boolean enabled;
    private final String screenDisplayName;
    
    private HashSet<GrantedAuthority> grantedAuthorities = new HashSet<GrantedAuthority>();
	
    public UserDetailsDTO(int userID, String userName, String userPassword, String screenDisplayName, boolean enabled, List<UserRole> roles  ) {
        this.userID = userID;
    	this.login = userName;
        this.passwordHash = userPassword;
    	this.screenDisplayName = screenDisplayName;
        this.enabled = enabled;
       	this.grantedAuthorities.addAll(roles);
    }
    
    public UserDetailsDTO(SystemUser user) {
        this.userID = user.getUserId();
    	this.login = user.getUsername();
    	this.screenDisplayName = user.getFirstName();
        this.passwordHash = user.getPassword();
        this.enabled = user.getActiveStatus() == 1;
        
        List<UserRole> userRoleList = new ArrayList<UserRole>();
        if(user.getSystemUserRoleList() != null){
        	for (SystemUserRole systemUserRole : user.getSystemUserRoleList()) {
        		userRoleList.add(systemUserRole.getUserRole());
        	}
        }
        
       	this.grantedAuthorities.addAll(userRoleList);

    }
    
	public HashSet<GrantedAuthority> getGrantedAuthorities() {
		return grantedAuthorities;
	}

	public void setGrantedAuthorities(HashSet<GrantedAuthority> grantedAuthorities) {
		this.grantedAuthorities = grantedAuthorities;
	}

	public long getUserID() {
		return userID;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public String getLogin() {
		return login;
	}

	public String getPasswordHash() {
		return passwordHash;
	}

	public String getScreenDisplayName() {
		return screenDisplayName;
	}

	@Override
	public Collection<GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return grantedAuthorities;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return passwordHash;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return login;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

}
