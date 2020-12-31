package com.e4s.corporate.service;

import java.util.List;

import com.e4s.corporate.model.Book;
import com.e4s.corporate.model.User;

public interface BookService {
	List<Book> findAll();

	Book findById(Long id);

	Book create(Book book);

	Book update(Book book);

	void delete(Long id);
}
