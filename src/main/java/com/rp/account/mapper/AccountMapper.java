package com.rp.account.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.rp.account.entity.Account;

/**
 * mybatis mapper
 * 
 * @author 高洪滨
 * 
 */
@Mapper
public interface AccountMapper {

	Account selectAccountByUsername(String username);

	Account selectAccountByPhone(String phone);

	int insertAccount(Account account);

}
