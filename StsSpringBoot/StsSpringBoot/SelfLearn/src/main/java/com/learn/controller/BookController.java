package com.learn.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learn.model.Books;
import com.learn.repo.BookRepo;

@RestController
public class BookController {
	@Autowired
	private BookRepo bookRepo;

	@PostMapping("/book")
	public Books savaBook(@RequestBody Books books) {
		return this.bookRepo.save(books);
	}

	@GetMapping("/book/{id}")
	public Books getBook(@PathVariable("id") int id) {
		Optional<Books> b = this.bookRepo.findById(id);
		return b.get();
	}

	@GetMapping("/book")
	public ResponseEntity<List<Books>> getAllBooks() {
		List<Books> ls = this.bookRepo.findAll();
		if (ls.size() != 0) {
			return ResponseEntity.of(Optional.of(ls));
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}

//	@GetMapping("/users")
//	public List<Books> getAllUser() {
//		return this.bookRepo.getAllUsers();
//	}

//	@GetMapping("/userss")
//	public List<Books> getAll() {
//		return this.bookRepo.getAllaa();
//	}

//	@GetMapping("/lsname/{lname}")
//	public List<Books> getbylname(@PathVariable("lname") String name) {
//		return this.bookRepo.getbyLastname(name);
//	}

	@DeleteMapping("/book/{lname}")
	public String deleString(@PathVariable("lname") int name) {
		this.bookRepo.deleteById(name);
		return "delete" + name;
	}

//	@GetMapping("/user/{fname}")
//	public List<Books> getbyuserName(@PathVariable("fname") String name) {
//		return this.bookRepo.findByFname(name);
//	}

//	@GetMapping("/user/{fname}/{password}")
//	public Books Login(@PathVariable("fname") String name, @PathVariable("password") String password) {
//		return this.bookRepo.findByFnameAndPassword(name, password);
//	}
}
