package com.e4s.corporate.service;

import java.util.List;

import com.e4s.corporate.model.User;

public interface UserService {
	List<User> findAll();

	User findById(Long id);

	User create(User role);

	User update(User role);

	void delete(Long id);
}
