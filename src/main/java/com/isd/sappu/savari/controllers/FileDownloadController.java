package com.isd.sappu.savari.controllers;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.isd.sappu.savari.util.AppConstant;

@Controller(value="downloadController")
@RequestMapping(value="/download")
public class FileDownloadController {

	@RequestMapping(value="getProductImage", method=RequestMethod.GET)
	public void getProductImageFile(@RequestParam("fname") String fileName,HttpServletResponse response, HttpServletRequest request){
		String filePath = AppConstant.PRODUCT_UPLOADPATH+fileName;
		this.getImage(filePath, response);
	}
	
	@RequestMapping(value="getProfileImage", method=RequestMethod.GET)
	public void getProfileImageFile(@RequestParam("fname") String fileName,HttpServletResponse response, HttpServletRequest request){
		String filePath = AppConstant.PROFILE_UPLOADPATH+fileName;
		this.getImage(filePath, response);
	}
	
	public void getImage(String filePath, HttpServletResponse response){
		try {
			response.setContentType("image/jpeg");
			File f = new File(filePath);
			BufferedImage bi = ImageIO.read(f);
			OutputStream out = response.getOutputStream();
			String ext = filePath.split("\\.")[filePath.split("\\.").length-1];
			ImageIO.write(bi, ext, out);
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
