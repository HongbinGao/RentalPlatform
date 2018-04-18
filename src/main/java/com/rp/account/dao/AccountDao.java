package com.rp.account.dao;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rp.account.entity.Account;
import com.rp.account.mapper.AccountMapper;

@Service
public class AccountDao {

	@Autowired
	private AccountMapper mapper;

	/**
	 * 通过用户名查询账号
	 * 
	 * @param username
	 * @return
	 */
	public Account selectAccountByUsername(String username) {
		return mapper.selectAccountByUsername(username);
	}

	public Account selectAccountByPhone(String phone) {
		return mapper.selectAccountByPhone(phone);
	}

	public Account insertAccount(Account account) {
		Date date = new Date();
		account.setCreateTime(date.getTime());
		account.setUpdateTime(date.getTime());
		mapper.insertAccount(account);
		return account;
	}

}
