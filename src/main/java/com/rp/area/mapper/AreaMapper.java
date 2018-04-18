package com.rp.area.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.rp.area.entity.City;
import com.rp.area.entity.District;
import com.rp.area.entity.Province;

@Mapper
public interface AreaMapper {

	List<Province> selectProvince();

	List<City> selectCityByProvinceId(Integer provinceId);

	List<District> selectDistrictByCityId(Integer cityId);

}
