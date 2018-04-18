package com.rp.account.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rp.account.entity.Account;
import com.rp.account.service.AccountService;

/**
 * 账号控制器
 * 
 * @author 高洪滨
 *
 */
@RestController()
@RequestMapping("account")
public class AccountController {

	@Autowired
	private AccountService service;

	/**
	 * 验证用户名是否存在
	 * 
	 * @param username
	 */
	@PostMapping("verifyUsername")
	public boolean verifyUsername(String username) {
		return service.verifyUsername(username);
	}

	/**
	 * 验证手机号是否存在
	 * 
	 * @param phoneNumber
	 */
	@PostMapping("verifyPhone")
	public boolean verifyPhone(String phone) {
		return service.verifyPhone(phone);
	}

	/**
	 * 注册
	 */
	@PostMapping("signUp")
	public void signUp(Account account) {
		service.signUp(account);
	}

}
