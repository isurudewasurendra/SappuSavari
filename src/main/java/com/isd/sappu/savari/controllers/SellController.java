package com.isd.sappu.savari.controllers;

import java.util.ArrayList;
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
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.isd.sappu.savari.domains.District;
import com.isd.sappu.savari.domains.PopularArea;
import com.isd.sappu.savari.domains.Product;
import com.isd.sappu.savari.domains.ProductCategory;
import com.isd.sappu.savari.domains.ProductMultimedia;
import com.isd.sappu.savari.domains.ProductSubCategory;
import com.isd.sappu.savari.services.DistrictService;
import com.isd.sappu.savari.services.ProductCategoryService;
import com.isd.sappu.savari.services.ProductService;
import com.isd.sappu.savari.services.ProductSubCategoryService;
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

@Controller(value="sellController")
@RequestMapping(value="/sell")
public class SellController {

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
	
	@RequestMapping(value="listProduct", method=RequestMethod.GET)
	public ModelAndView getUserProductView(HttpServletRequest request){
		ModelMap map = new ModelMap();
		List<Product> productList = productService.getAllProductByUserId(sessionUtil.getLoggedUserFromSession(AppConstant.LOGGED_USER, request).getUserId());
		map.put("productList", productList);
		return new ModelAndView("listproduct", map);
	}
	
	@RequestMapping(value="listProductCategory", method=RequestMethod.GET)
	public ModelAndView getProductCategory(HttpServletRequest request){
		ModelMap map = new ModelMap();
		List<ProductCategory> productCategoryList = productCategoryService.getAllProductCategory();
		map.put("productCategoryList", productCategoryList);
		return new ModelAndView("listproductcategory", map);
	}
	
	@RequestMapping(value="listProductSubCategory", method=RequestMethod.GET)
	public ModelAndView getProductSubCategory(@RequestParam("pcid") long productCategoryId, HttpServletRequest request){
		ModelMap map = new ModelMap();
		List<ProductSubCategory> productSubCategoryList = productSubCategoryService.getAllProductSubCategoriesByProductCategoryId(productCategoryId);
		map.put("productSubCategoryList", productSubCategoryList);
		return new ModelAndView("listproductsubcategory", map);
	}
	
	@RequestMapping(value="listDistrict", method=RequestMethod.GET)
	public ModelAndView getDistrict(@RequestParam("pscid") long productSubCategoryId, HttpServletRequest request){
		ModelMap map = new ModelMap();
		List<District> districtList = districtService.getAllDistrict();
		map.put("districtList", districtList);
		map.put("productSubCategoryId", productSubCategoryId);
		return new ModelAndView("listdistrict", map);
	}
	
	@RequestMapping(value="listPopularArea", method=RequestMethod.GET)
	public ModelAndView getPopularArea(@RequestParam("pscid") long productSubCategoryId, @RequestParam("did") long districtId, HttpServletRequest request){
		ModelMap map = new ModelMap();
		List<PopularArea> popularAreaList = districtService.getAllPopularAreaByDistrictId(districtId);
		map.put("popularAreaList", popularAreaList);
		map.put("productSubCategoryId", productSubCategoryId);
		return new ModelAndView("listpopulararea", map);
	}
	
	@RequestMapping(value="addproduct", method=RequestMethod.GET)
	public ModelAndView getAddProduct(@RequestParam("pscid") long productSubCategoryId, @RequestParam("paid") long popularAreaId, HttpServletRequest request){
		ModelMap map = new ModelMap();
		
		map.put("showVehicleDiv", 0);
		map.put("showPropertyDiv", 0);
		
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
		
		map.put("productSubCategoryId", productSubCategoryId);
		map.put("popularAreaId", popularAreaId);
		return new ModelAndView("addproduct", map);
	}
	
	@RequestMapping(value="addproduct", method=RequestMethod.POST)
	public String postAddProduct(@RequestParam("inputProductPic") CommonsMultipartFile[] productImages, HttpServletRequest request){
	
		long productSubCategoryId = Long.parseLong(request.getParameter("productSubCategoryId"));
		long popularAreaId = Long.parseLong(request.getParameter("popularAreaId"));
		
		ProductSubCategory productSubCategory = productSubCategoryService.getProductSubCategoryById(productSubCategoryId);
		PopularArea popularArea = districtService.getPopularArea(popularAreaId);
		
		String title = request.getParameter("inputProductTitle");
		String description = request.getParameter("inputLastName");
		String address = request.getParameter("inputProductAddress");
		String mobile = request.getParameter("inputMobile");
		String telephone = request.getParameter("inputTelephone");
		String fax = request.getParameter("inputFax");
		String email = request.getParameter("inputEmailAddress");
		String price = request.getParameter("inputPrice");
		String authenticity = request.getParameter("inputAuthenticity");
		String productType = request.getParameter("inputType");
		String brand = request.getParameter("inputBrand");
		String model = request.getParameter("inputModel");
		String condition = request.getParameter("inputCondition");
		
		String bodyType = request.getParameter("inputBodyType");
		String mileage = request.getParameter("inputMileage");
		String modelYear = request.getParameter("inputModelYear");
		String transmission = request.getParameter("inputTransmission");
		String fuelType = request.getParameter("inputFuel");
		
		String noOfBathrooms = (request.getParameter("inputNoOfBathroom") == null)?"0":request.getParameter("inputNoOfBathroom");
		String noOfRooms = (request.getParameter("inputNoOfRoom") == null)?"0":request.getParameter("inputNoOfRoom");
		String propertySize = request.getParameter("inputSize");
		
		Product product = new Product();
		
		try {
			List<ProductMultimedia> productMultimediaList = new ArrayList<ProductMultimedia>();
			for(int i=0; i<5; i++){
				Map<String, Object> resultMap = fileUploadManager.uploadImages(productImages[i], EnumConstant.UploadImageType.PRODUCT.toString());
				String productImage = (String) resultMap.get("fileName");
				
				ProductMultimedia productMultimedia = new ProductMultimedia();
				productMultimedia.setMultimediaType(EnumConstant.MultimediaType.IMAGE.toString());
				productMultimedia.setMedia(productImage);
				productMultimedia.setUpdatedDateTime(new Date());
				productMultimedia.setProduct(product);
				
				productMultimediaList.add(productMultimedia);
			}
			
			product.setMultiMediaList(productMultimediaList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		product.setProductTitle(title);
		product.setDescription(description);
		product.setAddress(address);
		product.setMobile(mobile);
		product.setLandPhone(telephone);
		product.setFax(fax);
		product.setEmail(email);
		product.setPrice(Double.parseDouble(price));
		product.setAuthenticity(authenticity);
		product.setProductType(productType);
		product.setProductBrand(brand);
		product.setProductModel(model);
		product.setProductCondition(condition);
		
		product.setBodyType(bodyType);
		product.setMillege(mileage);
		product.setModelYear(modelYear);
		product.setTransmission(transmission);
		product.setFuelType(fuelType);
		
		product.setNoOfBathroom(Integer.parseInt(noOfBathrooms));
		product.setNoOfRoom(Integer.parseInt(noOfRooms));
		product.setProductSize(propertySize);
		
		product.setProductStatus(EnumConstant.ProductStatus.PUBLISH.toString());
		product.setCreatedDateTime((product.getCreatedDateTime()==null)?new Date():product.getCreatedDateTime());
		product.setUpdatedDateTime(new Date());
		product.setUser(sessionUtil.getLoggedUserFromSession(AppConstant.LOGGED_USER, request));
		product.setProductSubCategory(productSubCategory);
		product.setPopularArea(popularArea);
		
		productService.saveUpdateProduct(product);
		
		return "redirect:listProduct.htm?msg=suc";
	}
	
}
