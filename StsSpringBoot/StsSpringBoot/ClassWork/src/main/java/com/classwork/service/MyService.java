package com.classwork.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.classwork.entity.UserInfo;
import com.classwork.repo.MyRepo;

@Service
public class MyService {
	@Autowired
	private MyRepo myRepo;
	@Autowired
	private PasswordEncoder passwordEncoder;

	public String addUser(UserInfo userInfo) {
		userInfo.setPassword(passwordEncoder.encode(userInfo.getPassword()));
		this.myRepo.save(userInfo);
		return "User Info add in database";
	}

	public Optional<UserInfo> findyname(String name) {
		return this.myRepo.findByName(name);
	}
}
