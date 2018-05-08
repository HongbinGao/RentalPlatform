package com.rp.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.rp.house.vo.HouseListSearchVo;

@Controller
public class GotoController {

	@GetMapping("")
	public String home() {
		return "html/index";
	}

	@GetMapping("gotoHome")
	public String gotoHome() {
		return "html/index";
	}

	@GetMapping("gotoSignUp")
	public String gotoSignUp() {
		return "html/signup";
	}

	@GetMapping("gotoSignIn")
	public String gotoSignIn() {
		return "html/signin";
	}

	@GetMapping("gotoPublishHouse")
	public String gotoPublishHouse() {
		return "html/publishHouse";
	}

	@GetMapping("gotoHouseList")
	public String gotoHouse(HouseListSearchVo search, ModelMap model) {
		model.addAttribute(search);
		return "html/houselist";
	}
}
