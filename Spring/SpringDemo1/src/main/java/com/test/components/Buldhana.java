package com.test.components;

import org.springframework.stereotype.Component;

import com.test.service.Address;

@Component("buldhana")
public class Buldhana implements Address {
	public Buldhana() {
		super();
	}
	@Override
	public void streetAddress() {
		System.out.println("buldhana address added");
	}
}
