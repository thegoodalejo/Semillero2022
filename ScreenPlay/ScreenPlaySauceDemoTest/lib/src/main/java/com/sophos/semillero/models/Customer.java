package com.sophos.semillero.models;

public class Customer {
	
	private String firstName;
	private String lastName;
	private String zipCode;
	
	public Customer(String firsName, String lastName, String zipCode) {
		this.firstName = firsName;
		this.lastName = lastName;
		this.zipCode = zipCode;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	
}
