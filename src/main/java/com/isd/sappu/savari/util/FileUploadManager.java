package com.isd.sappu.savari.util;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.apache.commons.fileupload.FileItem;

@Component(value="fileUploadManager")
public class FileUploadManager {

	public Map<String,Object> uploadImages(CommonsMultipartFile uploadedFile, String imageType) throws Exception{
		
		File destinationDir = null;
		String generatedAssetName = null;
		
		if(imageType == EnumConstant.UploadImageType.PROFILE.toString()){
			this.generatePath(AppConstant.PROFILE_UPLOADPATH);
			destinationDir = new File(AppConstant.PROFILE_UPLOADPATH);
			generatedAssetName = this.generateUniqueName("profile_");
		}else if(imageType == EnumConstant.UploadImageType.PRODUCT.toString()){
			this.generatePath(AppConstant.PRODUCT_UPLOADPATH);
			destinationDir = new File(AppConstant.PRODUCT_UPLOADPATH);
			generatedAssetName = this.generateUniqueName("product_");
		}
		
		FileItem item = uploadedFile.getFileItem();
		String extension = item.getName().substring(item.getName().lastIndexOf("."),item.getName().length());
		
		File file = new File(destinationDir,(generatedAssetName + extension));
		
		item.write(file);
		
		Map<String,Object> uploadedDataMap = new HashMap<String, Object>();
		
		uploadedDataMap.put("fileDestination", file.getPath());
		uploadedDataMap.put("fileName", generatedAssetName+extension);
					
		return uploadedDataMap;
		
	}
	
	public String generateUniqueName(String prefix){
		String uniqueFolderName = prefix + System.currentTimeMillis();
		return uniqueFolderName;
	}
	
	public void generatePath(String filePath){
		File destination = new File(filePath);
		if(!destination.exists()){
			if(destination.mkdirs()){
				System.out.println("created "+filePath);
			}else{
				System.out.println("cannot create "+filePath);
			}
		}else{
			System.out.println(filePath + "file path exist");
		}
	}
	
}
