package com.e4s.corporate.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.e4s.corporate.model.Book;
import com.e4s.corporate.model.User;
import com.e4s.corporate.repository.BookRepository;
import com.e4s.corporate.repository.UserRepository;
import com.e4s.corporate.service.BookService;
import com.e4s.corporate.service.UserService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;

	

	@Override
	public List<Book> findAll() {
		return bookRepository.findAll();
	}

	@Override
	public Book findById(Long id) {
		return bookRepository.findById(id).get();
	}

	@Override
	public Book create(Book book) {

		return bookRepository.save(book);
	}

	@Override
	public Book update(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public void delete(Long id) {
		Book book = bookRepository.findById(id).get();
		bookRepository.delete(book);
	}



}
