package com.rp.account.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rp.account.entity.Account;
import com.rp.account.mapper.AccountMapper;
import com.rp.account.vo.AccountVo;

@Service
public class AccountService {

	@Autowired
	private AccountMapper mapper;

	/**
	 * 检查用户名是否重复<br>
	 * true用户名重复<br>
	 * false用户名不重复
	 * 
	 * @param username
	 * @return
	 */
	public Boolean verifyUsernameIsHave(String username) {
		Account account = mapper.selectAccountByUsername(username);
		;
		if (account.getId() != null)
			return true;
		else
			return false;
	}

	/**
	 * 检查手机号是否重复<br>
	 * true手机号重复<br>
	 * false手机号不重复
	 * 
	 * @param phone
	 * @return
	 */
	public Boolean verifyPhoneIsHave(String phone) {
		Account account = mapper.selectAccountByPhone(phone);
		if (account.getId() != null)
			return true;
		else
			return false;
	}

	/**
	 * 注册
	 * 
	 * @param account
	 */
	public Boolean signUp(Account account) {
		mapper.insertAccount(account);
		if (account.getId() == null)
			return false;
		return true;
	}

	/**
	 * 登录验证
	 * 
	 * @param account
	 * @param session
	 */
	public Boolean signIn(AccountVo vo, HttpSession session) {
		Account account = mapper.selectAccountByExample(vo);
		if (account.getId() == null)
			return false;
		session.setAttribute("account", account);
		return true;
	}

}
