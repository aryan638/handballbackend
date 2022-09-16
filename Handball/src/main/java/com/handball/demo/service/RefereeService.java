package com.handball.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.handball.demo.Model.Referee;
import com.handball.demo.repository.RefereeRepository;


@Service
public class RefereeService {
	@Autowired
	private RefereeRepository repository;
	
	public Referee saveReferee(Referee referee) {
		return repository.save(referee);
	}
	
	public List<Referee> showReferee() {
		return repository.findAll();
	}
	
	public void deleteReferee(int id) {
		repository.deleteById(id);
	}
	
	public Referee updateReferee(Referee referee) {
		Referee existingReferee = repository.findById(referee.getId()).orElse(null);
		existingReferee.setRefereeName(referee.getRefereeName());
		existingReferee.setContactNumber(referee.getContactNumber());
		existingReferee.setDescription(referee.getDescription());
		existingReferee.setEmail(referee.getEmail());
		existingReferee.setImageUrl(referee.getImageUrl());
		existingReferee.setCountry(referee.getCountry());
		return repository.save(existingReferee);
	}
	
	public Optional<Referee> getRefereeId(int id) {
		return repository.findById(id);
	}


}
