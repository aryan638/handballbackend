package com.handball.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.handball.demo.Model.User;

public interface RegistrationRepository extends JpaRepository<User, Integer>{
	public User findByEmailId(String email);
	public User findByEmailIdAndPassword(String email, String password);
}
