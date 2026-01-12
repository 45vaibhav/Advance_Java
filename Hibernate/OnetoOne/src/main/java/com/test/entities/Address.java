package com.test.entities;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Address {
	@Id
	int add_id;
	String city;
	@OneToOne(mappedBy ="address") 
	Student student;
	public Address(int add_id, String city,Student student) {
		super();
		this.add_id = add_id;
		this.city = city;
		this.student=student;
	}
	public Address() {
		super();
	}
	public int getAdd_id() {
		return add_id;
	}
	public void setAdd_id(int add_id) {
		this.add_id = add_id;
	}
	public String getAddress() {
		return city;
	}
	public void setAddress(String city) {
		this.city = city;
	}
	
	public void setStudent(Student student) {
		this.student = student;
	}
	
			
}
