package com.e4s.corporate.service;

import java.util.List;

import com.e4s.corporate.model.Category;
import com.e4s.corporate.model.User;

public interface CategoryService {
	List<Category> findAll();

	Category findById(Long id);

	Category create(Category category);

	Category update(Category category);

	void delete(Long id);
}
