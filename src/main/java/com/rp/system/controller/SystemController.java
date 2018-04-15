package com.rp.system.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rp.system.entity.LoginEntity;

@RestController
public class SystemController {

	@PostMapping(value = "logon")
	public void logon(LoginEntity result) {
		System.out.println(result);
		// mapper.logon(result);
	}

}
