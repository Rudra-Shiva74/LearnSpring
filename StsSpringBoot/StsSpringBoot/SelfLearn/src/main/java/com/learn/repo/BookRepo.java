package com.learn.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.learn.model.Books;

public interface BookRepo extends JpaRepository<Books, Integer> {

//	public List<Books> findByFname(String fname);
//
//	public Books findByFnameAndPassword(String fname, String password);
//
//	@Query("select u from User u")
//	public List<Books> getAllUsers();
//
//	@Query("select u from User u where u.lname =:n")
//	public List<Books> getbyLastname(@Param("n") String name);
//
//	@Query(value = "select * from user", nativeQuery = true)
//	public List<Books> getAllaa();
}
