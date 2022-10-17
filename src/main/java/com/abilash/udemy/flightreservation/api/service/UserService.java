package com.abilash.udemy.flightreservation.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abilash.udemy.flightreservation.api.entity.User;
import com.abilash.udemy.flightreservation.api.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;

	public User addUser(User user) {
		return userRepository.save(user);
	}
	
}
