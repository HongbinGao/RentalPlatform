package com.rp.area.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rp.area.dao.AreaDao;
import com.rp.area.entity.City;
import com.rp.area.entity.District;
import com.rp.area.entity.Province;

@Service
public class AreaService {

	@Autowired
	private AreaDao dao;

	public List<Province> provinceList() {
		return dao.provinceList();
	}

	public List<City> cityList(Integer provinceId) {
		return dao.cityList(provinceId);
	}

	public List<District> districtList(Integer districtId) {
		return dao.districtList(districtId);
	}

}
