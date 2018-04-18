package com.rp.area.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rp.area.entity.City;
import com.rp.area.entity.District;
import com.rp.area.entity.Province;
import com.rp.area.service.AreaService;

@RestController
@RequestMapping("area")
public class AreaController {

	@Autowired
	private AreaService service;

	/**
	 * 省份列表
	 * 
	 * @return
	 * @return
	 */
	@GetMapping("provinceList")
	public List<Province> provinceList() {
		return service.provinceList();
	}

	/**
	 * 城市列表
	 * 
	 * @return
	 */
	@GetMapping("cityList")
	public List<City> cityList(Integer provinceId) {
		return service.cityList(provinceId);
	}

	/**
	 * 行政区列表
	 * 
	 * @return
	 */
	@GetMapping("districtList")
	public List<District> districtList(Integer districtId) {
		return service.districtList(districtId);
	}

}
