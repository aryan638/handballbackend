package com.handball.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.handball.demo.Model.Venue;
import com.handball.demo.repository.VenueRepository;


@Service
public class VenueService {
	@Autowired
	private VenueRepository repository;
	
	public Venue saveVenue(Venue course) {
		return repository.save(course);
	}
	
	public List<Venue> showVenue() {
		return repository.findAll();
	}
	
	public void deleteVenue(int id) {
		repository.deleteById(id);
	}
	
	public Venue updateVenue(Venue venue) {
		Venue existingVenue = repository.findById(venue.getId()).orElse(null);
		existingVenue.setId(venue.getId());
		existingVenue.setVenueName(venue.getVenueName());
		existingVenue.setLocation(venue.getLocation());
		existingVenue.setEventName(venue.getEventName());
		existingVenue.setCapacity(venue.getCapacity());
		existingVenue.setDescription(venue.getDescription());
		return repository.save(existingVenue);
	}
	
	public Optional<Venue> getVenueId(int id) {
		return repository.findById(id);
	}

}
