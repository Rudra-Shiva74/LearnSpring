package com.app.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.Model.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Integer> {

}
