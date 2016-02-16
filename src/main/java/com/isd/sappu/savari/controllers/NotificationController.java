package com.isd.sappu.savari.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.isd.sappu.savari.domains.Notification;
import com.isd.sappu.savari.domains.Product;
import com.isd.sappu.savari.services.NotificationService;
import com.isd.sappu.savari.util.AppConstant;
import com.isd.sappu.savari.util.SessionUtil;

@Controller(value="notificationController")
@RequestMapping(value="/notification")
public class NotificationController {
	
	@Autowired
	NotificationService notificationService;
	
	@Autowired
	SessionUtil sessionUtil;
	
	@RequestMapping(value="/notificatoinDashBoard", method=RequestMethod.GET)
	public ModelAndView getNotificationDashboard(@RequestParam("userId") long userId, HttpServletRequest request){
		ModelMap map = new ModelMap();
		
		List<Notification> notificationList = notificationService.getNotificationsByUserId(userId);
		map.put("notificationList", notificationList);
		
		return new ModelAndView("notificationdashboard", map);
	}
	
	@RequestMapping(value="getNotifications", method=RequestMethod.POST)
	public @ResponseBody List<Notification> getNotifications(@RequestParam("userId") long userId, HttpServletRequest request){
		List<Notification> notificationList = null;
		try{
			notificationList = new ArrayList<Notification>();
			for (Notification notification : notificationService.getNewNotificationsByUserId(userId)) {
				Notification notifi = new Notification();
				notifi.setNotificationId(notification.getNotificationId());
				notifi.setDescription(notification.getDescription());
				Product product = new Product();
				product.setProductId(notification.getProduct().getProductId());
				product.setProductTitle(notification.getProduct().getProductTitle());
				notifi.setProduct(product);
				notificationList.add(notifi);
			}
			System.out.println("+++size++"+notificationList.size());
		}catch(Exception e){
			e.printStackTrace();
		}
		return notificationList;
	}
	
	@RequestMapping(value="removeNotification", method=RequestMethod.GET)
	public String removeSearchHistory(@RequestParam("notId") long notificationId, HttpServletRequest request){
		Notification notification = notificationService.getNotification(notificationId);
		notification.setSeenStatus(1);
		notificationService.saveUpdateNotification(notification);
		return "redirect:notificatoinDashBoard.htm?userId="+sessionUtil.getLoggedUserFromSession(AppConstant.LOGGED_USER, request).getUserId();
	}
	
}
