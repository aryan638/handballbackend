package com.handball.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.handball.demo.Model.Teams;
import com.handball.demo.repository.TeamRepository;

@Service
public class TeamService {
	@Autowired
	private TeamRepository repository;
	
	public Teams saveTeam(Teams team) {
		return repository.save(team);
	}
	
	public List<Teams> showTeam() {
		return repository.findAll();
	}
	
	public void deleteTeam(int id) {
		repository.deleteById(id);
	}
	
	public Teams updateTeams(Teams team) {
		Teams existingTeams = repository.findById(team.getId()).orElse(null);
		existingTeams.setTeamName(team.getTeamName());
		existingTeams.setTeamLocation(team.getTeamLocation());
		existingTeams.setDescription(team.getDescription());
		
		return repository.save(existingTeams);
	}
	
	public Optional<Teams> getTeamsId(int id) {
		return repository.findById(id);
	}


	}
