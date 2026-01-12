package com.test.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Student {
	@Id
	int st_id;
	String st_name;
	String college;
	@OneToOne
	Address address;
	
	public Student(int st_id, String st_name, String college, Address address) {
		super();
		this.st_id = st_id;
		this.st_name = st_name;
		this.college = college;
		this.address=address;
	}
	public Student() {
		super();
	}
	public int getSt_id() {
		return st_id;
	}
	public void setSt_id(int st_id) {
		this.st_id = st_id;
	}
	public String getSt_name() {
		return st_name;
	}
	public void setSt_name(String st_name) {
		this.st_name = st_name;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
		
		
}


