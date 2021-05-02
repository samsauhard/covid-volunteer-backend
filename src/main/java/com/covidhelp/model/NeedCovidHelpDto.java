package com.covidhelp.model;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class NeedCovidHelpDto {
	private String name;
	private String address;
	private String city;
	private String email;
	private String mobContact;
	private String state;
	private String zip;
	private List<String> listNeeds;
	private String description;
	
	
	
	
	
	
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getName() {

		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getListNeeds() {
		return listNeeds;
	}

	public void setListNeeds(List<String> listNeeds) {
		this.listNeeds = listNeeds;
	}

	public String getMobContact() {
		return mobContact;
	}

	public void setMobContact(String mobContact) {
		this.mobContact = mobContact;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	

}
