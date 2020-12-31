package com.e4s.corporate.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.e4s.corporate.model.Category;
import com.e4s.corporate.model.User;
import com.e4s.corporate.repository.CategoryRepository;
import com.e4s.corporate.repository.UserRepository;
import com.e4s.corporate.service.CategoryService;
import com.e4s.corporate.service.UserService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	

	@Override
	public List<Category> findAll() {
		return categoryRepository.findAll();
	}

	@Override
	public Category findById(Long id) {
		return categoryRepository.findById(id).get();
	}

	@Override
	public Category create(Category category) {

		return categoryRepository.save(category);
	}

	@Override
	public Category update(Category category) {
		return categoryRepository.save(category);
	}

	@Override
	public void delete(Long id) {
		Category category = categoryRepository.findById(id).get();
		categoryRepository.delete(category);
	}



}
