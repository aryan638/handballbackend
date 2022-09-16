package com.handball.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Referee")
public class Referee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String RefereeName;
	private String ContactNumber;
	private String ImageUrl;
	private String Email;
	private String Country;
	private String Description;
	public Referee() {
		
	}
	public Referee(int id,String referreName,String contactNumber, String imageUrl, String email, String country,
			String description) {
		super();
		this.id=id;
		RefereeName=referreName;
		ContactNumber=contactNumber;
		ImageUrl=imageUrl;
		Email=email;
		Country=country;
		Description=description;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRefereeName() {
		return RefereeName;
	}
	public void setRefereeName(String refereeName) {
		RefereeName = refereeName;
	}
	public String getContactNumber() {
		return ContactNumber;
	}
	public void setContactNumber(String contactNumber) {
		ContactNumber = contactNumber;
	}
	public String getImageUrl() {
		return ImageUrl;
	}
	public void setImageUrl(String imageUrl) {
		ImageUrl = imageUrl;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	
	

}
