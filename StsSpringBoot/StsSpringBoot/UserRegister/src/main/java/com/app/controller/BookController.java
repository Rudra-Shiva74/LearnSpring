package com.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.app.Model.Book;
import com.app.Repo.BookRepo;

@Controller
public class BookController {
	@Autowired
	private BookRepo bookRepo;

	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}

	@PostMapping("/book")
	public Book saveBook(@RequestBody Book book) {
		return this.bookRepo.save(book);
	}

	@GetMapping("/book")
	public List<Book> getAllBooks() {
		return this.bookRepo.findAll();
	}

	@GetMapping("/book/{id}")
	public Optional<Book> getBook(@PathVariable("id") int id) {
		return this.bookRepo.findById(id);
	}

	@DeleteMapping("/book{id}")
	public String deleteBook(@PathVariable("id") int id) {
		this.bookRepo.deleteById(id);
		return "Book id " + id + " is deleted";
	}
}
