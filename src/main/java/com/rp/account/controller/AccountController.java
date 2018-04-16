package com.rp.account.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rp.account.service.AccountService;

/**
 * 用户控制器
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
	@RequestMapping("verifyUsername")
	public boolean verifyUsername(String username) {
		return service.verifyUsername();
	}

	/**
	 * 验证手机号是否存在
	 * 
	 * @param phoneNumber
	 */
	public void verifyPhone(Integer phoneNumber) {

	}

	/**
	 * 注册
	 */
	public void signUp() {

	}

}
