package com.rp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 页面跳转
 * 
 * @since 开发
 * @author 高洪滨
 *
 */
@Controller
public class GotoController {

	/**
	 * 跳转到首页
	 * 
	 * @return
	 */
	@GetMapping("gotoIndex")
	public String gotoIndex() {
		return "html/index";
	}

	/**
	 * 跳转到注册页
	 * 
	 * @return
	 */
	@GetMapping("gotoSignUp")
	public String gotoSignUp() {
		return "";
	}

}
