package com.handball.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.handball.demo.Model.User;
import com.handball.demo.service.RegistrationService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class RegistrationController {
	@Autowired
	private RegistrationService service;
	
	@PostMapping("/login")
	public User generalLogin(@RequestBody User user) throws Exception{
		User tempUser = service.fetchUserByEmail(user.getEmailId());
		return tempUser;
	}
	
	
	@PostMapping("/user/signup")
	public User registeredUser(@RequestBody User user) throws Exception {
		String tempmail = user.getEmailId();
		if(tempmail != null && !"".equals(tempmail)) {
			User userobj = service.fetchUserByEmail(tempmail);
			if(userobj != null) {
				throw new Exception("User "+ tempmail +" Already Found, Can't Register");
			}
		}
		User userObj = null;
		userObj = service.saveUser(user);
		return userObj;
	}
	@PostMapping("/admin/signup")
	public User registeredAdmin(@RequestBody User user) throws Exception {
		String tempmail = user.getEmailId();
		if(tempmail != null && !"".equals(tempmail)) {
			User userobj = service.fetchUserByEmail(tempmail);
			if(userobj != null) {
				throw new Exception("User "+ tempmail +" Already Found, Can't Register");
			}
		}
		User userObj = null;
		userObj = service.saveUser(user);
		return userObj;
	}
	
	
	@PostMapping("/user/login")
	public User loginUser(@RequestBody User user) throws Exception {
		User tempUser = null ;
		String tempEmail = user.getEmailId();
		String tempPass = user.getPassword();
		if(tempEmail != null && tempPass != null) {
			tempUser = service.fetchUserByEmailAndPassword(tempEmail, tempPass);
		}
		if(tempUser == null) {
			throw new Exception("Invalid Login");
		}
		return tempUser;
	}
	@PostMapping("/admin/login")
	public User loginAdmin(@RequestBody User user) throws Exception {
		User tempUser = null ;
		String tempEmail = user.getEmailId();
		String tempPass = user.getPassword();
		if(tempEmail != null && tempPass != null) {
			tempUser = service.fetchUserByEmailAndPassword(tempEmail, tempPass);
		}
		if(tempUser == null) {
			throw new Exception("Invalid Login");
		}
		return tempUser;
	}
	
	@DeleteMapping("/admin/deleteStudentByAdmin")
	public void deleteStudent(@RequestParam int id) {
		service.deleteUser(id);
	}
	

}
