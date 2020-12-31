package com.e4s.corporate.service;

import java.util.List;

import com.e4s.corporate.model.Basket;
import com.e4s.corporate.model.User;

public interface BasketService {
	List<Basket> findAll();

	Basket findById(Long id);

	Basket create(Basket basket);

	Basket update(Basket basket);

	void delete(Long id);
}
