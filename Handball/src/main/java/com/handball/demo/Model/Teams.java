package com.handball.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Teams")
public class Teams {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int id;
	private String TeamName;
	private int noofPlayers;
	private String teamLocation;
	private String description;
	public Teams() {
		
	}
	public Teams(int id,String TeamName ,int noofplayers ,String teamLocation  ,String description) {
		super();
		this.id=id;
		this.TeamName=TeamName;
		this.noofPlayers=noofplayers;
		this.teamLocation=teamLocation;
		this.description=description;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTeamName() {
		return TeamName;
	}
	public void setTeamName(String teamName) {
		TeamName = teamName;
	}
	public int getNoofPlayers() {
		return noofPlayers;
	}
	public void setNoofPlayers(int noofPlayers) {
		this.noofPlayers = noofPlayers;
	}
	public String getTeamLocation() {
		return teamLocation;
	}
	public void setTeamLocation(String teamLocation) {
		this.teamLocation = teamLocation;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
