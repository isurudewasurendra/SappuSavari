package com.isd.sappu.savari.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.isd.sappu.savari.data.UserDetailsDTO;
import com.isd.sappu.savari.domains.SystemUser;

@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	SystemUserService systemUserService;
	
	@Override
	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		try {
    		SystemUser user = systemUserService.getSystemUserByUsername(username);
    		System.out.println("====logged user===="+user.getUsername());
    		System.out.println("====logged user roles===="+user.getSystemUserRoleList().get(0).getUserRole().getAuthority());
    		throwExceptionIfNotFound(user, username);
    		return new UserDetailsDTO(user);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	private void throwExceptionIfNotFound(SystemUser user, String login) {
        if (user == null) {
            throw new UsernameNotFoundException("User with login " + login + "  has not been found.");
        }
    }

}
