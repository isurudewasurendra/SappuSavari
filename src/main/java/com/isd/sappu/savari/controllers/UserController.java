package com.isd.sappu.savari.controllers;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.constraints.Null;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.isd.sappu.savari.domains.SearchRequest;
import com.isd.sappu.savari.domains.SystemUser;
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

	@RequestMapping(value="userprofile", method=RequestMethod.GET)
	public ModelAndView getUserProfile(@RequestParam("username") String username){
		ModelMap map = new ModelMap();
		SystemUser systemUser = systemUserService.getSystemUserByUsername(username);
		map.put("systemUser", systemUser);
		return new ModelAndView("profile", map);
	}
	
	@RequestMapping(value="userprofile", method=RequestMethod.POST)
	public String getUserProfile(@RequestParam("inputProfilePic") @Null CommonsMultipartFile profilePicture, HttpServletRequest request){
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
		return systemUser.toMap();
	}
	
	
	@RequestMapping(value="followUser", method=RequestMethod.GET)
	public ModelAndView getFollowUser(@RequestParam("fromUserId") long fromUserId, @RequestParam("toUserId") long toUserId ,
			@RequestParam("travelMode") String travelMode, HttpServletRequest request){
		ModelMap map = new ModelMap();
		
		SystemUser fromUser = systemUserService.getSystemUser(fromUserId);
		SystemUser toUser = systemUserService.getSystemUser(toUserId);
		
		map.put("fromUser", fromUser);
		map.put("toUser", toUser);
		if(travelMode.equals("walking")){
			map.put("travelMode", "WALKING");
		}else{
			map.put("travelMode", "DRIVING");
		}
		
		return new ModelAndView("userfollow", map);
	}
}
