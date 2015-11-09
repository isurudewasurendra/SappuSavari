package com.isd.sappu.savari.services;

import java.util.List;

import com.isd.sappu.savari.domains.ProductMultimedia;

public interface ProductMultimediaService {

	public List<ProductMultimedia> getMultimediaList(long productId);
	
}
