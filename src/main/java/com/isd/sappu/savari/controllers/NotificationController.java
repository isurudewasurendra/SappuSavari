package com.isd.sappu.savari.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.isd.sappu.savari.domains.Message;
import com.isd.sappu.savari.util.AppConstant;
import com.isd.sappu.savari.util.SessionUtil;

@Controller(value="notificationController")
@RequestMapping(value="/notification")
public class NotificationController {
	
	@Autowired
	private SessionUtil sessionUtil;

	@RequestMapping(value="/notificatoinDashBoard", method=RequestMethod.GET)
	public ModelAndView getNotificationDashboard(HttpServletRequest request){
		ModelMap map = new ModelMap();
		
		long userId = sessionUtil.getLoggedUserFromSession(AppConstant.LOGGED_USER, request).getUserId();
		
		
		
		return new ModelAndView("notificationdashboard", map);
	}
	
}
