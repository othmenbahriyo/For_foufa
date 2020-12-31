package com.e4s.corporate.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.e4s.corporate.model.User;
import com.e4s.corporate.repository.UserRepository;
import com.e4s.corporate.service.UserService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@Override
	public User findById(Long id) {
		return userRepository.findById(id).get();
	}

	@Override
	public User create(User user) {

		return userRepository.save(user);
	}

	@Override
	public User update(User user) {
		return userRepository.save(user);
	}

	@Override
	public void delete(Long id) {
		User user = userRepository.findById(id).get();
		userRepository.delete(user);
	}



}
