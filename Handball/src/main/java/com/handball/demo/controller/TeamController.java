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

import com.handball.demo.Model.Teams;
import com.handball.demo.service.TeamService;



@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TeamController {
	
	@Autowired
	private TeamService service;
	
	@PostMapping("/admin/addTeam")
	public Teams addTeams(@RequestBody Teams team) {
		return service.saveTeam(team);
	}
	
	@GetMapping("admin/viewTeam")
	public List<Teams> findTeams(){
		return service.showTeam();
	}
	
	@PutMapping("/admin/updateTeam")
	public Teams updateTeams(@RequestBody Teams team){
		return service.updateTeams(team);
	}
	
	@DeleteMapping("/admin/deleteTeam")
	public void deleteTeams(@RequestParam int id) {
			service.deleteTeam(id);	
	}
	
	@GetMapping("/admin/getTeam")
	public Optional<Teams> getTeamById(@RequestParam int id) {
		return service.getTeamsId(id);
	}


}


