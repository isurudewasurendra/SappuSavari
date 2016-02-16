package com.isd.sappu.savari.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.isd.sappu.savari.domains.FollowSeller;
import com.isd.sappu.savari.services.FollowSellerService;
import com.isd.sappu.savari.services.ProductCategoryService;
import com.isd.sappu.savari.util.AppConstant;
import com.isd.sappu.savari.util.SessionUtil;

@Controller(value="homeController")
@RequestMapping(value="/home")
public class HomeController {
	
	@Autowired
	ProductCategoryService productCategoryService;
	
	@Autowired
	FollowSellerService followSellerService;
	
	@Autowired
	SessionUtil sessionUtil;
	
	@RequestMapping(value="home", method=RequestMethod.GET)
	public ModelAndView firstMethode(HttpServletRequest request){
		ModelMap map = new ModelMap();
		
		List<FollowSeller> followSellers = followSellerService.findFollowSellers(sessionUtil.getLoggedUserFromSession(AppConstant.LOGGED_USER, request).getUserId());
		map.put("followSellers", followSellers);
		
		map.put("message", "isuru");
		return new ModelAndView("home", map);
	}
	
}
