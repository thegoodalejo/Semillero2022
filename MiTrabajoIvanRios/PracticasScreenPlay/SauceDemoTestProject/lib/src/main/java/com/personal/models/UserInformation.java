package com.personal.models;

public class UserInformation {
	
	private String name;
	private String lastname;
	private String zipcode;
	
	public UserInformation(String name, String lastname, String zipcode) {
		this.name = name;
		this.lastname = lastname;
		this.zipcode = zipcode;
	}
	
	public String getName() {
		return name;
	}
	public String getLastname() {
		return lastname;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

}
