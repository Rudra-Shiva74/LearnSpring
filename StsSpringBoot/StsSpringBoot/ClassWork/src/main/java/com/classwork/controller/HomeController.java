package com.classwork.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.classwork.config.JwtUtil;
import com.classwork.service.MyService;

@RestController
@CrossOrigin
public class HomeController {

	@Autowired
	private MyService myService;

	@GetMapping("/login")
	public String login() {
		String token = JwtUtil.generateToken("abhishek");
		return token;
	}
}
