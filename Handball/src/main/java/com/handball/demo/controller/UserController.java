package com.handball.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.handball.demo.Model.Customer;
import com.handball.demo.service.CustomerService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class UserController {
	
	@Autowired
	private CustomerService service;
	@PostMapping("/admin/addCustomer")
	public Customer addCustomer(@RequestBody Customer customer) {
		return service.saveCustomer(customer);
	}
	

	@PutMapping("/admin/updateCustomer")
	public Customer updateStudent(@RequestBody Customer customer){
		return service.updateStudent(customer);
	}
	
	@DeleteMapping("/admin/deleteCustomer")
	public void deleteCourse(@RequestParam int id) {
			service.deleteCustomer(id);	
	}
	
	@GetMapping("/admin/viewCustomer")
	public List<Customer> viewCustomer(){
		return service.viewCustomer();
	}
	
	@GetMapping("/admin/getCustomer")
	public Customer getCustomerId(@RequestParam int id) {
		return service.getCustomerId(id);
	}
	
}
