package com.isd.sappu.savari.controllers;

import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.isd.sappu.savari.dao.SearchSessionDao;
import com.isd.sappu.savari.domains.ProductSubCategory;
import com.isd.sappu.savari.domains.SearchSession;
import com.isd.sappu.savari.services.ProductSubCategoryService;

@Controller(value="myController")
@RequestMapping(value="/mypanel")
public class MyController {
	
	@Autowired
	private ProductSubCategoryService productSubCategoryService;
	
	@Autowired
	private SearchSessionDao searchSessionDao;

	@RequestMapping(value="searchsession", method=RequestMethod.GET)
	public ModelAndView searchSessionGet(HttpServletRequest request){
		ModelMap map = new ModelMap();
		List<ProductSubCategory> electronicCategories = productSubCategoryService.getAllProductSubCategoriesByProductCategoryId(1);
		map.put("categories", electronicCategories);
		return new ModelAndView("searchSession", map);
	}
	
	@RequestMapping(value="searchsession", method=RequestMethod.POST)
	public String searchSessionPost(HttpServletRequest request){
		long productSubCategoryId = Long.parseLong(request.getParameter("productCategory"));
		long childProductCategoryId = Long.parseLong(request.getParameter("childProductCategory"));
		long secondChildProductCategoryId = Long.parseLong(request.getParameter("secondChildProductCategory"));
		long thirdChildProductCategoryId = Long.parseLong(request.getParameter("thirdChildProductCategory"));
		long fourthChildProductCategoryId = Long.parseLong(request.getParameter("fourthChildProductCategory"));
		int count = Integer.parseInt(request.getParameter("count"));
		int childCount = Integer.parseInt(request.getParameter("childcount"));
		int secondChildCount = Integer.parseInt(request.getParameter("secondChildcount"));
		int thirdChildCount = Integer.parseInt(request.getParameter("thirdChildcount"));
		int fourthChildCount = Integer.parseInt(request.getParameter("fouthChildcount"));
		
		try{
			
			for (int i=0; i<count; i++) {
				SearchSession searchSession = new SearchSession();
				String searchSessionUUID = UUID.randomUUID().toString();
				searchSession.setSearchSession(searchSessionUUID);
				searchSession.setProductCategory(productSubCategoryId);
				searchSession.setParent(true);
				searchSessionDao.save(searchSession);
				
				for(int j=0; j<childCount; j++){
					SearchSession childSearchSession = new SearchSession();
					String childSearchSessionUUID = UUID.randomUUID().toString();
					childSearchSession.setSearchSession(childSearchSessionUUID);
					childSearchSession.setParentSearchSession(searchSessionUUID);
					childSearchSession.setProductCategory(childProductCategoryId);
					childSearchSession.setParent(false);
					searchSessionDao.save(childSearchSession);
					
					for(int k=0; k<secondChildCount; k++){
						SearchSession secondChildSearchSession = new SearchSession();
						String secondChildSearchSessionUUID = UUID.randomUUID().toString();
						secondChildSearchSession.setSearchSession(secondChildSearchSessionUUID);
						secondChildSearchSession.setParentSearchSession(childSearchSessionUUID);
						secondChildSearchSession.setProductCategory(secondChildProductCategoryId);
						secondChildSearchSession.setParent(false);
						searchSessionDao.save(secondChildSearchSession);
						
						for(int l=0; l<thirdChildCount; l++){
							SearchSession thirdChildSearchSession = new SearchSession();
							String thirdChildSearchSessionUUID = UUID.randomUUID().toString();
							thirdChildSearchSession.setSearchSession(thirdChildSearchSessionUUID);
							thirdChildSearchSession.setParentSearchSession(secondChildSearchSessionUUID);
							thirdChildSearchSession.setProductCategory(thirdChildProductCategoryId);
							thirdChildSearchSession.setParent(false);
							searchSessionDao.save(thirdChildSearchSession);
							
							for(int m=0; m<fourthChildCount; m++){
								SearchSession fourthChildSearchSession = new SearchSession();
								String fourthChildSearchSessionUUID = UUID.randomUUID().toString();
								fourthChildSearchSession.setSearchSession(fourthChildSearchSessionUUID);
								fourthChildSearchSession.setParentSearchSession(thirdChildSearchSessionUUID);
								fourthChildSearchSession.setProductCategory(fourthChildProductCategoryId);
								fourthChildSearchSession.setParent(false);
								searchSessionDao.save(fourthChildSearchSession);
							}
						}
					}
				}
				
			}
			
			return "redirect:searchsession.htm?msg=success";
		}catch(Exception e){
			e.printStackTrace();
			return "redirect:searchsession.htm?msg=error";
		}
	}
	
}
