package com.isd.sappu.savari.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.isd.sappu.savari.services.CommentService;
import com.isd.sappu.savari.services.ProductCategoryService;

@Controller(value="homeController")
@RequestMapping(value="/home")
public class HomeController {
	
	@Autowired
	ProductCategoryService productCategoryService;
	
	@Autowired
	CommentService commentService;
	
	@RequestMapping(value="home", method=RequestMethod.GET)
	public ModelAndView firstMethode(){
		ModelMap map = new ModelMap();
		
		map.put("message", "isuru");
		return new ModelAndView("home", map);
	}
	
}
