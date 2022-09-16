package com.handball.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.handball.demo.Model.Booking;
import com.handball.demo.repository.BookingRepository;


@Service
public class BookingService {
	@Autowired
	private BookingRepository repository;
	
	public Booking saveBooking(Booking booking) {
		return repository.save(booking);
	}
	
	public List<Booking> showBooking() {
		return repository.findAll();
	}
	
	public void deleteBooking(int id) {
		repository.deleteById(id);
	}
}
