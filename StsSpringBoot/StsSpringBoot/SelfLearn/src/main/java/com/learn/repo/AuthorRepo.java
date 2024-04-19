package com.learn.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.model.Author;

public interface AuthorRepo extends JpaRepository<Author, Integer> {

}
