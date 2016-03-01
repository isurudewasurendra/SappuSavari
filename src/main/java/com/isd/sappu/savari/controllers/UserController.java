package com.isd.sappu.savari.controllers;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.isd.sappu.savari.domains.FollowSeller;
import com.isd.sappu.savari.domains.Product;
import com.isd.sappu.savari.domains.SearchRequest;
import com.isd.sappu.savari.domains.SystemUser;
import com.isd.sappu.savari.services.FollowSellerService;
import com.isd.sappu.savari.services.ProductService;
import com.isd.sappu.savari.services.SearchRequestService;
import com.isd.sappu.savari.services.SystemUserService;
import com.isd.sappu.savari.util.AppConstant;
import com.isd.sappu.savari.util.DateTimeUtil;
import com.isd.sappu.savari.util.EnumConstant;
import com.isd.sappu.savari.util.FileUploadManager;
import com.isd.sappu.savari.util.SessionUtil;

@Controller(value="userController")
@RequestMapping(value="/user")
public class UserController {
	
	@Autowired
	SystemUserService systemUserService;
	
	@Autowired
	DateTimeUtil dateTimeUtil;
	
	@Autowired
	FileUploadManager fileUploadManager;
	
	@Autowired
	SearchRequestService searchRequestService;
	
	@Autowired
	SessionUtil sessionUtil;
	
	@Autowired
	ProductService productService;
	
	@Autowired
	FollowSellerService followSellerService;

	@RequestMapping(value="userprofile", method=RequestMethod.GET)
	public ModelAndView getUserProfile(@RequestParam("username") String username){
		ModelMap map = new ModelMap();
		SystemUser systemUser = systemUserService.getSystemUserByUsername(username);
		map.put("systemUser", systemUser);
		return new ModelAndView("profile", map);
	}
	
	@RequestMapping(value="userprofile", method=RequestMethod.POST)
	public String getUserProfile(@RequestParam("inputProfilePic") CommonsMultipartFile profilePicture, HttpServletRequest request){
		long userId = Long.parseLong(request.getParameter("UserId"));
		String firstName = request.getParameter("inputFirstName");
		String lastName = request.getParameter("inputLastName");
		String address = request.getParameter("inputAddress");
		String dateOfBirth = request.getParameter("inputDateOfBirth");
		String mobileNo = request.getParameter("inputMobileNo");
		String workNo = request.getParameter("inputWorkNo");
		String homeNo = request.getParameter("inputHomeNo");
		
		SystemUser systemUser = systemUserService.getSystemUser(userId);
		systemUser.setFirstName(firstName);
		systemUser.setLastName(lastName);
		systemUser.setAddress(address);
		systemUser.setDateOfBirth(dateTimeUtil.getDate(dateOfBirth));
		systemUser.setMobileNo(mobileNo);
		systemUser.setWorkNo(workNo);
		systemUser.setHomeNo(homeNo);
		
		try {
			Map<String, Object> resultMap = fileUploadManager.uploadImages(profilePicture, EnumConstant.UploadImageType.PROFILE.toString());
			String profilePic = (String) resultMap.get("fileName");
			systemUser.setProfilePic(profilePic);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		systemUserService.saveUpdateSystemUser(systemUser);
		
		return "redirect:userprofile.htm?username="+systemUser.getUsername();
	}
	
	@RequestMapping(value="viewSearchHistory", method=RequestMethod.GET)
	public ModelAndView getSearchHistory(@RequestParam("userId") long userId){
		ModelMap map = new ModelMap();
		List<SearchRequest> searchRequestList = searchRequestService.getAllSearchRequestByUserId(userId);
		map.put("searchRequestList", searchRequestList);
 		return new ModelAndView("usersearchhistory", map);
	}
	
	@RequestMapping(value="removeearchHistory", method=RequestMethod.GET)
	public String removeSearchHistory(@RequestParam("shId") long searchRequestId, HttpServletRequest request){
		searchRequestService.deleteSearchRequest(searchRequestId);
		return "redirect:viewSearchHistory.htm?userId="+sessionUtil.getLoggedUserFromSession(AppConstant.LOGGED_USER, request).getUserId();
	}
	
	@RequestMapping(value="removeAllearchHistory", method=RequestMethod.GET)
	public String removeAllSearchHistory(@RequestParam("userId") long userId, HttpServletRequest request){
		searchRequestService.deleteUserSearchRequst(userId);
		return "redirect:viewSearchHistory.htm?userId="+sessionUtil.getLoggedUserFromSession(AppConstant.LOGGED_USER, request).getUserId();
	}
	
	@RequestMapping(value="userSearchHistory", method=RequestMethod.GET)
	public ModelAndView getSearchPage(@RequestParam("shId") long searchRequestId, HttpServletRequest request){
		ModelMap map = new ModelMap();
		SearchRequest searchRequest = searchRequestService.getSearchRequestById(searchRequestId);
		//search Products
		List<Product> productList = productService.getSearchedProductList(searchRequest);
		map.put("productList", productList);
		
		return new ModelAndView("listsearchresult", map);
	}
	
	@RequestMapping(value="updateUserLocation", method=RequestMethod.POST)
	public @ResponseBody String updateLocation(@RequestParam("userId") long userId, @RequestParam("latt") double latitude, @RequestParam("longt") double longtitude, @RequestParam("acc") int accuracy, HttpServletRequest request){
		SystemUser systemUser = systemUserService.getSystemUser(userId);
		
		System.out.println("------"+latitude);
		System.out.println("------"+longtitude);
		System.out.println("------"+accuracy);
		
		if(systemUser.getLatitude() != latitude || systemUser.getLongtitude() != longtitude){
			systemUser.setLatitude(latitude);
			systemUser.setLongtitude(longtitude);
			systemUser.setAccuracy(accuracy);
			
			systemUserService.saveUpdateSystemUser(systemUser);
		}
		
		
		return EnumConstant.ReturnStatus.SUCCESS.toString();
	}
	
	
	@RequestMapping(value="getSystemUser", method=RequestMethod.GET)
	public @ResponseBody Map<String, Object> getSystemUser(@RequestParam("userId") long userId, HttpServletRequest request){
		SystemUser systemUser = systemUserService.getSystemUser(userId);
		System.out.println(systemUser.toMap().toString());
		return systemUser.toMap();
	}
	
	
	@RequestMapping(value="followSeller", method=RequestMethod.GET)
	public String getFollowUser(@RequestParam("userId") long userId, @RequestParam("proId") long productId, HttpServletRequest request){
		SystemUser seller = systemUserService.getSystemUser(userId);
		SystemUser buyer = systemUserService.getSystemUser(sessionUtil.getLoggedUserFromSession(AppConstant.LOGGED_USER, request).getUserId());
		Product product = productService.getProductById(productId);
		
		FollowSeller followSeller = new FollowSeller();
		followSeller.setCreatedDateTime(new Date());
		followSeller.setBuyerId(buyer.getUserId());
		followSeller.setProductId(product.getProductId());
		followSeller.setProductTitle(product.getProductTitle());
		followSeller.setSellerId(seller.getUserId());
		followSeller.setSellerLatitude(seller.getLatitude());
		followSeller.setSellerLongtitude(seller.getLongtitude());
		followSeller.setSellerName(seller.getFirstName());
		
		followSellerService.saveUpdateFollowSeller(followSeller);
		
		return "redirect:/product/showProduct.htm?productId="+product.getProductId();
	}
	
	
	@RequestMapping(value="findSeller", method=RequestMethod.GET)
	public ModelAndView getFindSeller(@RequestParam("sUserId") long sUserId, HttpServletRequest request){
		ModelMap map = new ModelMap();
		SystemUser seller = systemUserService.getSystemUser(sUserId);
		SystemUser buyer = systemUserService.getSystemUser(sessionUtil.getLoggedUserFromSession(AppConstant.LOGGED_USER, request).getUserId());
		
		map.put("seller", seller);
		map.put("buyer", buyer);
		
		return new ModelAndView("findSeller", map);
	}
}
