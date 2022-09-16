package com.handball.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.handball.demo.Model.Customer;


public interface UserRepository extends JpaRepository<Customer,Integer> {
	public Customer findBycustomerId(int id);

}
