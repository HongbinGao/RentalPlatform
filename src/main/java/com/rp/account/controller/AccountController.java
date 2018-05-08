package com.rp.account.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rp.account.entity.Account;
import com.rp.account.service.AccountService;
import com.rp.account.vo.AccountVo;
import com.rp.common.constant.Constant;

/**
 * 账号控制器
 * 
 * @author 高洪滨
 *
 */
@RestController
@RequestMapping(value = "account")
public class AccountController {

	@Autowired
	private AccountService service;

	/**
	 * 验证用户名是否存在
	 * 
	 * @param username
	 */
	@PostMapping(value = "verifyUsernameIsHave")
	public boolean verifyUsernameIsHave(String username) {
		return service.verifyUsernameIsHave(username);
	}

	/**
	 * 验证手机号是否存在
	 * 
	 * @param phoneNumber
	 */
	@PostMapping(value = "verifyPhoneIsHave")
	public boolean verifyPhoneIsHave(String phone) {
		return service.verifyPhoneIsHave(phone);
	}

	/**
	 * 注册
	 */
	@PostMapping(value = "signUp")
	public void signUp(Account account) {
		service.signUp(account);
	}

	/**
	 * 登录
	 * 
	 * @param map
	 */
	@PostMapping(value = "signIn")
	public String signIn(AccountVo account, HttpSession session, HttpServletRequest request,
			HttpServletResponse response) {
		service.signIn(account, session);
		return "redirect:" + Constant.BACK_URL;
	}

}
