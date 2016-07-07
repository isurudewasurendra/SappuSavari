package com.isd.sappu.savari.controllers;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.isd.sappu.savari.dao.SearchSessionDao;
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
	SearchSessionDao searchSessionDao;
	
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
	
	@RequestMapping(value="adminpanel", method=RequestMethod.GET)
	public ModelAndView adminPanel(HttpServletRequest request){
		
		return new ModelAndView("adminpanel");
	}
	
	@RequestMapping(value="viewChart", method=RequestMethod.GET)
	public ModelAndView runViewStatChart(HttpServletRequest request){
		long subProductCategoryId = Long.parseLong(request.getParameter("productCategoryId"));
		String chartType = request.getParameter("chartType");
		String confident = request.getParameter("confident");
		
		ModelMap map = new ModelMap();
		String title = productCategoryService.getChartTitle(chartType, subProductCategoryId);
		map.put("title", title);
		
		Map<Integer, String> legenddatamap = productCategoryService.getLegendDetails(subProductCategoryId);
		map.put("legenddatamap", legenddatamap);
		
		Map<Integer, Integer> datamap = productCategoryService.getProductViewStat(chartType,subProductCategoryId);
		map.put("datamap", datamap);
		
		//calculate confident levels
		double mobileConfident = productCategoryService.getConfidentLevel(1, subProductCategoryId);
		double mobileAccessoriesConfident = productCategoryService.getConfidentLevel(2, subProductCategoryId);
		double computerConfident = productCategoryService.getConfidentLevel(3, subProductCategoryId);
		double computerAccessoriesConfident = productCategoryService.getConfidentLevel(4, subProductCategoryId);
		double cameraConfident = productCategoryService.getConfidentLevel(6, subProductCategoryId);
		double cameraAccessoriesConfident = productCategoryService.getConfidentLevel(20, subProductCategoryId);
		double tvConfident = productCategoryService.getConfidentLevel(5, subProductCategoryId);
		double audioConfident = productCategoryService.getConfidentLevel(7, subProductCategoryId);
		double refrigeratorConfident = productCategoryService.getConfidentLevel(21, subProductCategoryId);
		map.put("mobileConfident", new DecimalFormat("#.###").format(mobileConfident));
		map.put("mobileAccessoriesConfident", new DecimalFormat("#.###").format(mobileAccessoriesConfident));
		map.put("computerConfident", new DecimalFormat("#.###").format(computerConfident));
		map.put("computerAccessoriesConfident", new DecimalFormat("#.###").format(computerAccessoriesConfident));
		map.put("cameraConfident", new DecimalFormat("#.###").format(cameraConfident));
		map.put("cameraAccessoriesConfident", new DecimalFormat("#.###").format(cameraAccessoriesConfident));
		map.put("tvConfident", new DecimalFormat("#.###").format(tvConfident));
		map.put("audioConfident", new DecimalFormat("#.###").format(audioConfident));
		map.put("refrigeratorConfident", new DecimalFormat("#.###").format(refrigeratorConfident));
		
		int totalCount = searchSessionDao.getParentSessionList(subProductCategoryId).size();
		double confidentLeve = (Double.parseDouble(confident)*(double)totalCount)/100;
		
		map.put("confident", confidentLeve);
		
		return new ModelAndView("charts", map);
	}
	
}
