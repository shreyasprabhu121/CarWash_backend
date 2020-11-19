package com.carwash.customersignup.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "CustomerDetails")
public class CustomerModel {
	
	private String fullName;
	private String emailId;
	private String password;
	
	public CustomerModel(String fullName, String emailId, String password) {
		super();
		this.fullName = fullName;
		this.emailId = emailId;
		this.password = password;
	}
	public CustomerModel() {
		super();
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "CustomerModel [fullName=" + fullName + ", emailId=" + emailId + ", password=" + password + "]";
	}
	
	

}

