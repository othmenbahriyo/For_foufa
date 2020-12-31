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
import com.e4s.corporate.model.User;
import com.e4s.corporate.service.BasketService;
import com.e4s.corporate.service.UserService;

@RestController
@RequestMapping("/basket")
public class BasketController {
	@Autowired
	private BasketService basketService;

	@GetMapping
	public List<Basket> getAllUser() {
		return basketService.findAll();
	}

	@GetMapping("/{id}")
	public Basket getUser(@PathVariable Long id) {
		return basketService.findById(id);
	}

	@PostMapping
	public Basket createUser(@RequestBody Basket basket) {
		return basketService.create(basket);
	}

	@PutMapping()
	public Basket updateUser(@RequestBody Basket basket) {
		return basketService.update(basket);
	}

	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable Long id) {
		basketService.delete(id);
	}

}