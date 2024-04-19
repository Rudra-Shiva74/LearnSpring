package com.classwork.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.classwork.entity.UserInfo;

@Repository
public interface MyRepo extends JpaRepository<UserInfo, Integer> {
	public Optional<UserInfo> findByName(String username);
}
