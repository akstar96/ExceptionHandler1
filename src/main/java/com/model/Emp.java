package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Entity
public class Emp {
		@Id
		@GeneratedValue(strategy = GenerationType.SEQUENCE)
private long id;
		@NotEmpty(message = "Please Enter Name")
private String name;
		@NotEmpty(message = "please Enter LastName")
private String lastname;
		@NotBlank(message = "Please Enter Valid E mail ID")
private String email;
		
private long mobile;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getMobile() {
	return mobile;
}
public void setMobile(long mobile) {
	this.mobile = mobile;
}
public Emp() {
	super();
	// TODO Auto-generated constructor stub
}
public Emp(String name, String lastname, String email, long mobile) {
	super();
	this.name = name;
	this.lastname = lastname;
	this.email = email;
	this.mobile = mobile;
}
	
	
	
}
