package com.rp.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GotoController {

	@GetMapping("gotoTest")
	public String gotoTest() {
		return "html/test";
	}
	
	@GetMapping("gotoHome")
	public String gotoHome() {
		return "html/index";
	}

	@GetMapping("gotoSignUp")
	public String gotoSignUp() {
		return "html/system/signup";
	}

	public String gotoSignIn() {
		return "html/system/signin";
	}
	
	
	@GetMapping("goto")
	public String area() {
		return "html/area";
	}
}
