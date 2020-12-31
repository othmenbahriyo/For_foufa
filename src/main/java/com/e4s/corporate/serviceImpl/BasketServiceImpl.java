package com.e4s.corporate.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.e4s.corporate.model.Basket;
import com.e4s.corporate.model.User;
import com.e4s.corporate.repository.BasketRepository;
import com.e4s.corporate.repository.UserRepository;
import com.e4s.corporate.service.BasketService;
import com.e4s.corporate.service.UserService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
@Service
public class BasketServiceImpl implements BasketService {

	@Autowired
	private BasketRepository basketRepository;

	

	@Override
	public List<Basket> findAll() {
		return basketRepository.findAll();
	}

	@Override
	public Basket findById(Long id) {
		return basketRepository.findById(id).get();
	}

	@Override
	public Basket create(Basket basket) {

		return basketRepository.save(basket);
	}

	@Override
	public Basket update(Basket basket) {
		return basketRepository.save(basket);
	}

	@Override
	public void delete(Long id) {
		Basket basket = basketRepository.findById(id).get();
		basketRepository.delete(basket);
	}



}
