package com.handball.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.handball.demo.Model.Venue;
import com.handball.demo.service.VenueService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class VenueController {
	@Autowired
	private VenueService service;
	
	@PostMapping("/admin/addVenue")
	public Venue addVenue(@RequestBody Venue venue) {
		return service.saveVenue(venue);
	}
	
	@GetMapping("admin/viewVenue")
	public List<Venue> findCourse(){
		return service.showVenue();
	}
	
	@PutMapping("/admin/updateVenue")
	public Venue updateVenue(@RequestBody Venue venue){
		return service.updateVenue(venue);
	}
	
	@DeleteMapping("/admin/deleteVenue")
	public void deleteCourse(@RequestParam int id) {
			service.deleteVenue(id);	
	}
	
	@GetMapping("/admin/getVenue")
	public Optional<Venue> getCourseById(@RequestParam int id) {
		return service.getVenueId(id);
	}

}
