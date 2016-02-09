package com.isd.sappu.savari.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isd.sappu.savari.dao.ProductMultimediaDao;
import com.isd.sappu.savari.domains.Product;
import com.isd.sappu.savari.domains.ProductMultimedia;

@Service
public class ProductMultimediaServiceImpl implements ProductMultimediaService{

	@Autowired
	private ProductMultimediaDao productMultimediaDao;
	
	@Override
	public List<ProductMultimedia> getMultimediaList(long productId) {
		Product product = new Product();
		product.setProductId(productId);
		return productMultimediaDao.findByProduct(product);
	}

}
