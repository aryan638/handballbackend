package com.handball.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.handball.demo.Model.Booking;
import com.handball.demo.service.BookingService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class BookingController {
	
	@Autowired
	private BookingService service;
	
	@PostMapping("/user/addBooking")
	public Booking addAdmission(@RequestBody Booking booking) {
		return service.saveBooking(booking);
	}
	
	@GetMapping("/user/viewBooking")
	public List<Booking> findAdmission(){
		return service.showBooking();
	}
	
	@DeleteMapping("/user/deleteBooking")
	public void deleteBooking(@RequestParam int id) {
			service.deleteBooking(id);	
	}

}
