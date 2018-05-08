package com.rp.account.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 中介控制器
 * 
 * @author 高洪滨
 *
 */
@RestController
@RequestMapping(value = "agency")
public class AgencyController {

	@PostMapping(value = "signUp")
	public void signUp() {

	}

}
