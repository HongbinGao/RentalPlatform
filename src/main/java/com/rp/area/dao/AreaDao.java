package com.rp.area.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rp.area.entity.City;
import com.rp.area.entity.District;
import com.rp.area.entity.Province;
import com.rp.area.mapper.AreaMapper;

@Service
public class AreaDao {

	@Autowired
	private AreaMapper mapper;

	public List<Province> provinceList() {
		return mapper.selectProvince();
	}

	public List<City> cityList(Integer provinceId) {
		return mapper.selectCityByProvinceId(provinceId);
	}

	public List<District> districtList(Integer cityId) {
		return mapper.selectDistrictByCityId(cityId);
	}

}
