package com.e4s.corporate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.e4s.corporate.model.Basket;
import com.e4s.corporate.model.Book;
import com.e4s.corporate.model.User;
import com.e4s.corporate.service.BasketService;
import com.e4s.corporate.service.BookService;
import com.e4s.corporate.service.UserService;

@RestController
@RequestMapping("/book")
public class BookController {
	@Autowired
	private BookService bookService;

	@GetMapping
	public List<Book> getAllUser() {
		return bookService.findAll();
	}

	@GetMapping("/{id}")
	public Book getUser(@PathVariable Long id) {
		return bookService.findById(id);
	}

	@PostMapping
	public Book createUser(@RequestBody Book book) {
		return bookService.create(book);
	}

	@PutMapping()
	public Book updateUser(@RequestBody Book book) {
		return bookService.update(book);
	}

	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable Long id) {
		bookService.delete(id);
	}

}