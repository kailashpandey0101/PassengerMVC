package com.imcs.mvc.entity;


public class Passenger {

	
	private Long profileId;

	private String password;

	
	private String firstName;

	
	private String lastName;

	private String address;

	
	private String telNumber;

	
	private String emailId;


	public Passenger(String password, String firstName, String lastName, String address, String telNumber,
			String emailId) {
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.telNumber = telNumber;
		this.emailId = emailId;
	}

	public Passenger() {

	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelNumber() {
		return telNumber;
	}

	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Long getProfileId() {
		return profileId;
	}

}
