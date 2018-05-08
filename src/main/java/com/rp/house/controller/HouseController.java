package com.rp.house.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rp.house.service.HouseService;
import com.rp.house.vo.HouseListSearchVo;
import com.rp.house.vo.HouseVo;

@RestController
@RequestMapping(value = "house", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class HouseController {

	@Autowired
	private HouseService houseService;

	@PostMapping(value = "publishHouse")
	public void publishHouse(HouseVo house) {

	}

	@GetMapping(value = "list")
	public List<HouseVo> houseList(HouseListSearchVo searchVo) {
		return houseService.houseList(searchVo);
	}

	@GetMapping(value = "houseInfo/{id}")
	public void houseInfo(@PathVariable("id") Integer id) {

	}

	@PostMapping(value = "editHouse")
	public void editHouse(HouseVo house) {

	}

}
