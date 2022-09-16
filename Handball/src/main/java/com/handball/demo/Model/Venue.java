package com.handball.demo.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Venue")

public class Venue {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String venueName;
	private String Location;
    private String eventName;
    private int capacity;
    @Column(length = 5000)
    private String description;
    public Venue(){
    	
    }
    
    
	public Venue(int id, String venueName, String Location, String eventName, int capacity,
			String description) {
		super();
		this.id = id;
		this.venueName = venueName;
		this.Location = Location;
		this.eventName = eventName;
		this.capacity = capacity;
		this.description = description;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getVenueName() {
		return venueName;
	}


	public void setVenueName(String venueName) {
		this.venueName = venueName;
	}


	public String getLocation() {
		return Location;
	}


	public void setLocation(String location) {
		Location = location;
	}


	public String getEventName() {
		return eventName;
	}


	public void setEventName(String eventName) {
		this.eventName = eventName;
	}


	public int getCapacity() {
		return capacity;
	}


	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
    
}
