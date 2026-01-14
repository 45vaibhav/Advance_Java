package com.test.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.test.service.Address;

@Component
public class Student {
	Address address;
	@Autowired
	public Student( @Qualifier("buldhana")Address address) {
		this.address=address;
	}
	
	void setAddress(Address address) {
		this.address=address;
		
	}
	
	public Address getAddress() {
		return address;
	}

}
