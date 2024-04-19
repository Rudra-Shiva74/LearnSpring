//package com.application.service;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import com.application.model.Books;
//import com.application.repo.BookRepo;
//
//@Component
//public class BookService implements Bookinferface {
//
//	@Autowired
//	private BookRepo bookRepo;
//
//	@Override
//	public Books saveBook(Books book) {
//		try {
//			return this.bookRepo.save(book);
//		} catch (Exception e) {
//			throw new RuntimeException("Book Allready Exist");
//		}
//	}
//
//	@Override
//	public Books updateBook(Books book) {
//		if (bookRepo.existsById(book.getBid())) {
//			return this.bookRepo.saveAndFlush(book);
//		}
//		throw new RuntimeException("No Book Availabe to this id : " + book.getBid());
//	}
//
//	@Override
//	public Books getBook(int bookid) {
//		if (bookRepo.existsById(bookid)) {
//			Optional<Books> book = this.bookRepo.findById(bookid);
//			return book.get();
//		}
//		throw new RuntimeException("No Book Available to this id : " + bookid);
//	}
//
//	@Override
//	public List<Books> getAllBooks() {
//		List<Books> books = this.bookRepo.findAll();
//		if (books.size() != 0) {
//			return books;
//		}
//		throw new RuntimeException("No Book Record Available");
//	}
//
//	@Override
//	public void deleteBook(int bookid) {
//		if (bookRepo.existsById(bookid)) {
//			this.bookRepo.deleteById(bookid);
//		}
//		throw new RuntimeException("No Book Available to this id : " + bookid);
//	}
//
//}
