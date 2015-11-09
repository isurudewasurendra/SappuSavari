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
import org.springframework.web.servlet.ModelAndView;

import com.isd.sappu.savari.domains.District;
import com.isd.sappu.savari.domains.PopularArea;
import com.isd.sappu.savari.domains.Product;
import com.isd.sappu.savari.domains.ProductCategory;
import com.isd.sappu.savari.domains.ProductSubCategory;
import com.isd.sappu.savari.domains.SearchRequest;
import com.isd.sappu.savari.services.DistrictService;
import com.isd.sappu.savari.services.ProductCategoryService;
import com.isd.sappu.savari.services.ProductService;
import com.isd.sappu.savari.services.ProductSubCategoryService;
import com.isd.sappu.savari.services.SearchRequestService;
import com.isd.sappu.savari.util.AppConstant;
import com.isd.sappu.savari.util.EnumConstant;
import com.isd.sappu.savari.util.EnumConstant.AuthenticityType;
import com.isd.sappu.savari.util.EnumConstant.BodyType;
import com.isd.sappu.savari.util.EnumConstant.CameraBrand;
import com.isd.sappu.savari.util.EnumConstant.CarBrand;
import com.isd.sappu.savari.util.EnumConstant.ComputerBrand;
import com.isd.sappu.savari.util.EnumConstant.FuelType;
import com.isd.sappu.savari.util.EnumConstant.MobileBrand;
import com.isd.sappu.savari.util.EnumConstant.MotorBikeBrand;
import com.isd.sappu.savari.util.EnumConstant.ProductCondition;
import com.isd.sappu.savari.util.EnumConstant.ProductType;
import com.isd.sappu.savari.util.EnumConstant.TVBrand;
import com.isd.sappu.savari.util.EnumConstant.TransmissionType;
import com.isd.sappu.savari.util.EnumConstant.VanBusBrand;
import com.isd.sappu.savari.util.FileUploadManager;
import com.isd.sappu.savari.util.SessionUtil;

@Controller(value="buyController")
@RequestMapping(value="/buy")
public class BuyController {

	@Autowired
	ProductService productService;
	
	@Autowired
	SessionUtil sessionUtil;
	
	@Autowired
	ProductCategoryService productCategoryService;
	
	@Autowired
	ProductSubCategoryService productSubCategoryService;
	
	@Autowired
	DistrictService districtService;
	
	@Autowired
	FileUploadManager fileUploadManager;
	
	@Autowired
	SearchRequestService searchRequestService;
	
	@RequestMapping(value="listProductCategory", method=RequestMethod.GET)
	public ModelAndView getProductCategory(HttpServletRequest request){
		ModelMap map = new ModelMap();
		List<ProductCategory> productCategoryList = productCategoryService.getAllProductCategory();
		map.put("productCategoryList", productCategoryList);
		return new ModelAndView("listproductcategorybuy", map);
	}
	
	@RequestMapping(value="listProductSubCategory", method=RequestMethod.GET)
	public ModelAndView getProductSubCategory(@RequestParam("pcid") long productCategoryId, HttpServletRequest request){
		ModelMap map = new ModelMap();
		List<ProductSubCategory> productSubCategoryList = productSubCategoryService.getAllProductSubCategoriesByProductCategoryId(productCategoryId);
		map.put("productSubCategoryList", productSubCategoryList);
		return new ModelAndView("listproductsubcategorybuy", map);
	}
	
	@RequestMapping(value="listDistrict", method=RequestMethod.GET)
	public ModelAndView getDistrict(@RequestParam("pscid") long productSubCategoryId, HttpServletRequest request){
		ModelMap map = new ModelMap();
		List<District> districtList = districtService.getAllDistrict();
		map.put("districtList", districtList);
		map.put("productSubCategoryId", productSubCategoryId);
		return new ModelAndView("listdistrictbuy", map);
	}
	
	@RequestMapping(value="listPopularArea", method=RequestMethod.GET)
	public ModelAndView getPopularArea(@RequestParam("pscid") long productSubCategoryId, @RequestParam("did") long districtId, HttpServletRequest request){
		ModelMap map = new ModelMap();
		List<PopularArea> popularAreaList = districtService.getAllPopularAreaByDistrictId(districtId);
		map.put("popularAreaList", popularAreaList);
		map.put("productSubCategoryId", productSubCategoryId);
		return new ModelAndView("listpopularareabuy", map);
	}
	
	@RequestMapping(value="searchProduct", method=RequestMethod.GET)
	public ModelAndView getSearchPage(@RequestParam("pscid") long productSubCategoryId, @RequestParam("paid") long popularAreaId, HttpServletRequest request){
		
		ModelMap map = new ModelMap();
		
		map.put("showVehicleDiv", 0);
		map.put("showPropertyDiv", 0);
		
		map.put("productSubCategoryId", productSubCategoryId);
		map.put("popularAreaId", popularAreaId);
		
		Map<String, AuthenticityType> authenticityTypes = EnumConstant.AuthenticityType.getMap();
		map.put("authenticityTypes", authenticityTypes);
		
		Map<String, ProductType> productTypes = EnumConstant.ProductType.getMap();
		map.put("productTypes", productTypes);
		
		//brand
		ProductSubCategory productSubCategory = productSubCategoryService.getProductSubCategoryById(productSubCategoryId);
		
		if(productSubCategory.getSubCategoryName().equals(EnumConstant.ElectronicSubCategory.MOBILEPHONE.toString())
				|| productSubCategory.getSubCategoryName().equals(EnumConstant.ElectronicSubCategory.MOBILEPHONEACCESSORIES.toString())){
			Map<String, MobileBrand> brands = EnumConstant.MobileBrand.getMap();
			map.put("brands", brands);
		}else if(productSubCategory.getSubCategoryName().equals(EnumConstant.ElectronicSubCategory.COMPUTER.toString())
				|| productSubCategory.getSubCategoryName().equals(EnumConstant.ElectronicSubCategory.COMPUTERACCESSORIES.toString())){
			Map<String, ComputerBrand> brands = EnumConstant.ComputerBrand.getMap();
			map.put("brands", brands);
		}else if(productSubCategory.getSubCategoryName().equals(EnumConstant.ElectronicSubCategory.TV.toString())){
			Map<String, TVBrand> brands = EnumConstant.TVBrand.getMap();
			map.put("brands", brands);
		}else if(productSubCategory.getSubCategoryName().equals(EnumConstant.ElectronicSubCategory.CAMERA.toString())){
			Map<String, CameraBrand> brands = EnumConstant.CameraBrand.getMap();
			map.put("brands", brands);
		}else if(productSubCategory.getSubCategoryName().equals(EnumConstant.VehicleSubCategory.CAR.toString())){
			Map<String, CarBrand> brands = EnumConstant.CarBrand.getMap();
			map.put("brands", brands);
			map.put("showVehicleDiv", 1);
		}else if(productSubCategory.getSubCategoryName().equals(EnumConstant.VehicleSubCategory.MOTORBIKE.toString())){
			Map<String, MotorBikeBrand> brands = EnumConstant.MotorBikeBrand.getMap();
			map.put("brands", brands);
			map.put("showVehicleDiv", 1);
		}else if(productSubCategory.getSubCategoryName().equals(EnumConstant.VehicleSubCategory.VANBUS.toString())){
			Map<String, VanBusBrand> brands = EnumConstant.VanBusBrand.getMap();
			map.put("brands", brands);
			map.put("showVehicleDiv", 1);
		}else if(productSubCategory.getProductCategory().getCategoryName().equals(EnumConstant.ProductCategory.OTHER.toString())){
			map.put("showVehicleDiv", 0);
			map.put("showPropertyDiv", 0);
		}else{
			map.put("showPropertyDiv", 1);
		}
		
		Map<String, ProductCondition> productConditions = EnumConstant.ProductCondition.getMap();
		map.put("productConditions", productConditions);
		
		Map<String, BodyType> bodyTypes = EnumConstant.BodyType.getMap();
		map.put("bodyTypes", bodyTypes);
		
		Map<String, TransmissionType> transmissionTypes = EnumConstant.TransmissionType.getMap();
		map.put("transmissionTypes", transmissionTypes);
		
		Map<String, FuelType> fuelTypes = EnumConstant.FuelType.getMap();
		map.put("fuelTypes", fuelTypes);
		
		return new ModelAndView("searchproduct", map);
	}
	
	@RequestMapping(value="searchProduct", method=RequestMethod.POST)
	public ModelAndView getSearchPage(HttpServletRequest request){
		ModelMap map = new ModelMap();
		
		long productSubCategoryId = Long.parseLong(request.getParameter("productSubCategoryId"));
		long popularAreaId = Long.parseLong(request.getParameter("popularAreaId"));
		
		ProductSubCategory productSubCategory = productSubCategoryService.getProductSubCategoryById(productSubCategoryId);
		PopularArea popularArea = districtService.getPopularArea(popularAreaId);
		
		String title = request.getParameter("inputProductTitle");
		String description = request.getParameter("inputLastName");
		String address = request.getParameter("inputProductAddress");
		
		String minPrice = request.getParameter("inputMinPrice");
		String maxPrice = request.getParameter("inputMaxPrice");
		
		String authenticity = request.getParameter("inputAuthenticity");
		String productType = request.getParameter("inputType");
		String brand = request.getParameter("inputBrand");
		String model = request.getParameter("inputModel");
		String condition = request.getParameter("inputCondition");
		String bodyType = request.getParameter("inputBodyType");
		
		String minMileage = (request.getParameter("inputMinMileage") == null)?"0":request.getParameter("inputMinMileage");
		String maxMileage = (request.getParameter("inputMaxMileage") == null)?"0":request.getParameter("inputMaxMileage");
		
		String modelYear = request.getParameter("inputModelYear");
		String transmission = request.getParameter("inputTransmission");
		String fuelType = request.getParameter("inputFuel");
		
		String minNoOfBathrooms = (request.getParameter("inputMinNoOfBathroom") == null)?"0":request.getParameter("inputMinNoOfBathroom");
		String maxNoOfBathrooms = (request.getParameter("inputMaxNoOfBathroom") == null)?"0":request.getParameter("inputMaxNoOfBathroom");
		
		String minNoOfRooms = (request.getParameter("inputMinNoOfRoom") == null)?"0":request.getParameter("inputMinNoOfRoom");
		String maxNoOfRooms = (request.getParameter("inputMaxNoOfRoom") == null)?"0":request.getParameter("inputMaxNoOfRoom");
		
		SearchRequest searchRequest = new SearchRequest();
		searchRequest.setTitle(title);
		searchRequest.setDescription(description);
		searchRequest.setAddress(address);
		searchRequest.setMinPrice(Integer.parseInt(minPrice));
		searchRequest.setMaxPrice(Integer.parseInt(maxPrice));
		searchRequest.setAuthenticity(authenticity);
		searchRequest.setProductType(productType);
		searchRequest.setBrand(brand);
		searchRequest.setProductCondition(condition);
		searchRequest.setModelYear(modelYear);
		searchRequest.setMinMillege(Integer.parseInt(minMileage));
		searchRequest.setMaxMillege(Integer.parseInt(maxMileage));
		searchRequest.setTransmission(transmission);
		searchRequest.setFuelType(fuelType);
		searchRequest.setBodyType(bodyType);
		searchRequest.setMinNoOfBathroom(Integer.parseInt(minNoOfBathrooms));
		searchRequest.setMaxNoOfBathroom(Integer.parseInt(maxNoOfBathrooms));
		searchRequest.setMinNoOfRoom(Integer.parseInt(minNoOfRooms));
		searchRequest.setMaxNoOfRoom(Integer.parseInt(maxNoOfRooms));
		searchRequest.setModel(model);
		
		searchRequest.setProductSubCategory(productSubCategory);
		searchRequest.setPopularArea(popularArea);
		searchRequest.setUser(sessionUtil.getLoggedUserFromSession(AppConstant.LOGGED_USER, request));
		searchRequest.setCreatedDateTime(new Date());
		
		searchRequestService.saveUpdateSearchRequest(searchRequest);
		
		//search Products
		List<Product> productList = productService.getSearchedProductList(searchRequest);
		map.put("productList", productList);
		
		return new ModelAndView("listsearchresult", map);
	}
	
}
