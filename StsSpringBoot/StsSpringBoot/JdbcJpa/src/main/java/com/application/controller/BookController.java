//package com.application.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.application.model.Books;
//import com.application.service.Bookinferface;
//
//@RestController
//public class BookController {
//
//	@Autowired
//	private Bookinferface bookService;
//
//	@PostMapping("/book")
//	public Books saveBook(@RequestBody Books book) {
//		return this.bookService.saveBook(book);
//	}
//
//	@GetMapping("/book/{id}")
//	public Books getBookbyId(@PathVariable("id") int id) {
//		return this.bookService.getBook(id);
//	}
//
//	@GetMapping("/book")
//	public List<Books> getAllBooks() {
//		return this.bookService.getAllBooks();
//	}
//
//	@PutMapping("/updatebook")
//	public Books updateBook(@RequestBody Books book) {
//		return this.bookService.updateBook(book);
//	}
//
//	@DeleteMapping("/deletebook")
//	public String deleteBook(@PathVariable("id") int id) {
//		return "Book Deleted with id : " + id;
//	}
//}
