package com.isd.sappu.savari.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.isd.sappu.savari.domains.Product;
import com.isd.sappu.savari.domains.ProductMultimedia;

public interface ProductMultimediaDao extends CrudRepository<ProductMultimedia, Long>{

	public List<ProductMultimedia> findByProduct(Product product);
	
}
