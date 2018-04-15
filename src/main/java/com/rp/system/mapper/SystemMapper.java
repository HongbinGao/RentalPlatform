package com.rp.system.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.rp.system.entity.LoginEntity;

@Mapper
public interface SystemMapper {

	int logon(LoginEntity result);

}
