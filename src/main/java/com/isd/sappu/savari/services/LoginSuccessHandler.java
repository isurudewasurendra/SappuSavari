package com.isd.sappu.savari.services;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;

import com.isd.sappu.savari.domains.SystemUser;
import com.isd.sappu.savari.util.AppConstant;
import com.isd.sappu.savari.util.SessionUtil;

public class LoginSuccessHandler implements AuthenticationSuccessHandler {

	@Autowired
	SessionUtil sessionUtil;
	
	@Autowired
	SystemUserService systemUserService;
	
	private AuthenticationSuccessHandler target = new SavedRequestAwareAuthenticationSuccessHandler();
	
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request,
			HttpServletResponse response, Authentication authentication) throws IOException,
			ServletException {
		System.out.println("CAME HERE onAuthenticationSuccess");
		
		if(authentication != null){
			Object principal = authentication.getPrincipal();
			UserDetails userDetails = (UserDetails) (principal instanceof UserDetails ? principal : null);
			
			SystemUser user = systemUserService.getSystemUserByUsername(userDetails.getUsername());
			sessionUtil.addLoggedUserToSession(AppConstant.LOGGED_USER, user, request);
			
			if(userDetails != null){
				try {
					target.onAuthenticationSuccess(request, response, authentication);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

	}

}
