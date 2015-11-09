package com.isd.sappu.savari.dao;

import java.util.List;

import com.isd.sappu.savari.domains.ProductMultimedia;

public interface ProductMultimediaDao {

	public List<ProductMultimedia> getMultimediaList(long productId);
	
}
