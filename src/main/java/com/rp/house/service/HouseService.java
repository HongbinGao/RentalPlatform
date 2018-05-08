package com.rp.house.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rp.house.mapper.HouseMapper;
import com.rp.house.vo.HouseListSearchVo;
import com.rp.house.vo.HouseVo;

@Service
public class HouseService {

	@Autowired
	private HouseMapper houseMapper;

	public List<HouseVo> houseList(HouseListSearchVo searchVo) {
		return houseMapper.selectHouseBySearch(searchVo);
	}

}
