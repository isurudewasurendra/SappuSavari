package com.isd.sappu.savari.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller(value="notificationController")
@RequestMapping(value="/notification")
public class NotificationController {
	
	@RequestMapping(value="/notificatoinDashBoard", method=RequestMethod.GET)
	public ModelAndView getNotificationDashboard(HttpServletRequest request){
		ModelMap map = new ModelMap();
		
		return new ModelAndView("notificationdashboard", map);
	}
	
}
