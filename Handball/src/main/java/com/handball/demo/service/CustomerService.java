package com.handball.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.handball.demo.Model.Customer;
import com.handball.demo.repository.UserRepository;

@Service

public class CustomerService {
	@Autowired
	private UserRepository repository;
	
	public List<Customer> viewCustomer() {
		return repository.findAll();
	}
	
	public Customer saveCustomer(Customer customer) {
		return repository.save(customer);
	}
	
	public void deleteCustomer(int id) {
		repository.deleteById(id);
	}
	
	public Customer updateStudent(Customer customer) {
		Customer existingCustomer = repository.findBycustomerId(customer.getCustomerId());
		existingCustomer.setCustomerId(customer.getCustomerId());
		existingCustomer.setCustomerName(customer.getCustomerName());
		existingCustomer.setMobileNumber(customer.getMobileNumber());
		existingCustomer.setCity(customer.getCity());
		existingCustomer.setAge(customer.getAge());
		return repository.save(existingCustomer);
	}
	
	public Customer getCustomerId(int id) {
		return repository.findBycustomerId(id);
	}
}
