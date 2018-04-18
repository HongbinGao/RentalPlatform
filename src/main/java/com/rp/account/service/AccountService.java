package com.rp.account.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rp.account.dao.AccountDao;
import com.rp.account.entity.Account;

@Service
public class AccountService {

	@Autowired
	private AccountDao dao;

	public boolean verifyUsername(String username) {
		Account account = dao.selectAccountByUsername(username);
		return false;
	}

	public boolean verifyPhone(String phone) {
		Account account = dao.selectAccountByPhone(phone);
		return false;
	}

	public void signUp(Account account) {
		dao.insertAccount(account);
		if (account.getId() != null) {
			System.out.println("注册成功" + account.getId());
		}
	}

}
