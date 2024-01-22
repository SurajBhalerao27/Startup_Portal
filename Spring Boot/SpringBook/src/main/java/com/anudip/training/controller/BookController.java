package com.anudip.training.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anudip.training.entity.Book;
import com.anudip.training.repository.BookRepository;

@RestController
@RequestMapping("/book")
public class BookController {
	@Autowired
	BookRepository bookRepository;

	// http://localhost:8080/saveBook
	@PostMapping("/save")
	public String insertBook(@RequestBody Book book) {
		bookRepository.save(book);
		System.out.println(book);
		return "Book Details Saved Successfully !!! ";
	}

	@GetMapping("/get")
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<Optional<Book>> getByIdBook(@PathVariable int id) {
		Optional<Book> book1 = bookRepository.findById(id);
		return ResponseEntity.ok(book1);
	}

//	update
	@PutMapping("edit/{id}")
	public ResponseEntity<Book> editBook(@RequestBody Book book, @PathVariable int id) {
		Book book1 = bookRepository.findById(id).orElse(null);
		book1.setBookName(book.getBookName());
		book1.setBookAuthour(book.getBookAuthour());
		Book updateBook = bookRepository.save(book1);
		return ResponseEntity.ok(updateBook);
	}

//	delete
	@DeleteMapping("/delete/{id}")
	public String deleteBook(@PathVariable int id) {
		bookRepository.deleteById(id);
		return "Book Deleted";
	}
}
