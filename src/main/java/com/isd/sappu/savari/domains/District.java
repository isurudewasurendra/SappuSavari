package com.isd.sappu.savari.domains;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name="districts")
public class District implements Serializable{

	private static final long serialVersionUID = 5489679679570043539L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long districtId;
	
	private String districtName;
	
	private String districtTelCode;
	
	@OneToMany(mappedBy="district")
	@Cascade(CascadeType.ALL)
	private List<PopularArea> areaList;
	
	
	
	
	public long getDistrictId() {
		return districtId;
	}

	public void setDistrictId(long districtId) {
		this.districtId = districtId;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getDistrictTelCode() {
		return districtTelCode;
	}

	public void setDistrictTelCode(String districtTelCode) {
		this.districtTelCode = districtTelCode;
	}

	public List<PopularArea> getAreaList() {
		return areaList;
	}

	public void setAreaList(List<PopularArea> areaList) {
		this.areaList = areaList;
	}

}
