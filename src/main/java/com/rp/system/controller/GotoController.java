package com.rp.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GotoController {

	@GetMapping("gotoLogon")
	public String gotoLogon() {
		return "system/logon";
	}

}
