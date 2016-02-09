package com.isd.sappu.savari.controllers;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.isd.sappu.savari.domains.SystemUser;
import com.isd.sappu.savari.domains.SystemUserRole;
import com.isd.sappu.savari.domains.UserRole;
import com.isd.sappu.savari.services.SystemUserService;
import com.isd.sappu.savari.services.UserRoleService;
import com.isd.sappu.savari.util.EnumConstant;

@Controller(value="loginController")
@RequestMapping(value="/login")
public class LoginController {

	@Autowired
	SystemUserService systemUserService;
	
	@Autowired
	UserRoleService userRoleService;
	
	@RequestMapping(value="login", method=RequestMethod.GET)
	public String login(){
		return "login";
	}
	
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
	    Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    if (auth != null){    
	        new SecurityContextLogoutHandler().logout(request, response, auth);
	    }
	    return "redirect:../login/login.htm";//You can redirect wherever you want, but generally it's a good practice to show login screen again.
	}
	
	@RequestMapping(value="signup", method=RequestMethod.GET)
	public String getSignup(){
		return "signup";
	}
	
	@RequestMapping(value="signup", method=RequestMethod.POST)
	public String postSignup(HttpServletRequest request){
		String email = request.getParameter("username");
		String password = request.getParameter("password");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String mobile = request.getParameter("mobile");
		
		SystemUser user = new SystemUser();
		user.setUsername(email);
		user.setPassword(password);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setMobileNo(mobile);
		user.setActiveStatus(1);
		
		UserRole role = userRoleService.getUserRoleByRole(EnumConstant.Role.ROLE_USER.toString());
		
		SystemUserRole systemUserRole = new SystemUserRole();
		systemUserRole.setUser(user);
		systemUserRole.setUserRole(role);
		
		ArrayList<SystemUserRole> sytemUserRoles = new ArrayList<SystemUserRole>();
		sytemUserRoles.add(systemUserRole);
		
		user.setSystemUserRoleList(sytemUserRoles);
		
		systemUserService.saveUpdateSystemUser(user);
		
		return "login";
	}
	
	
	
}
