package com.handball.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.handball.demo.Model.User;
import com.handball.demo.repository.RegistrationRepository;

@Service
public class RegistrationService {
	@Autowired
	private RegistrationRepository repository;
	
	public User saveUser(User user) {
		return repository.save(user);
	}
	
	public User fetchUserByEmail(String email) {
		return repository.findByEmailId(email);
	}
	
	public User fetchUserByEmailAndPassword(String email, String password) {
		return repository.findByEmailIdAndPassword(email,password);
	}
	
	public void deleteUser(int id) {
		repository.deleteById(id);
	}
}
