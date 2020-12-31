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
import com.e4s.corporate.model.Category;
import com.e4s.corporate.model.User;
import com.e4s.corporate.service.BasketService;
import com.e4s.corporate.service.CategoryService;
import com.e4s.corporate.service.UserService;

@RestController
@RequestMapping("/category")
public class CategoryController {
	@Autowired
	private CategoryService categoryService;

	@GetMapping
	public List<Category> getAllUser() {
		return categoryService.findAll();
	}

	@GetMapping("/{id}")
	public Category getUser(@PathVariable Long id) {
		return categoryService.findById(id);
	}

	@PostMapping
	public Category createUser(@RequestBody Category category) {
		return categoryService.create(category);
	}

	@PutMapping()
	public Category updateUser(@RequestBody Category category) {
		return categoryService.update(category);
	}

	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable Long id) {
		categoryService.delete(id);
	}

}