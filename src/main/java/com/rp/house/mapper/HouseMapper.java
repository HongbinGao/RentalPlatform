package com.rp.house.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.rp.house.vo.HouseListSearchVo;
import com.rp.house.vo.HouseVo;

@Mapper
public interface HouseMapper {

	List<HouseVo> selectHouseBySearch(HouseListSearchVo searchVo);

}
