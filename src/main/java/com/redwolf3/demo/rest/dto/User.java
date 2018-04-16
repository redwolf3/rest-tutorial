package com.redwolf3.demo.rest.dto;

public class User {

	private String mail;
	private String password;
	private String lastName;
	private String name;
	private String address;

	public User() {
	}

	public String getAddress() {
		return address;
	}

	public String getLastName() {
		return lastName;
	}

	public String getMail() {
		return mail;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}