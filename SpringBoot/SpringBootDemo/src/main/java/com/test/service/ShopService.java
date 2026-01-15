package com.test.service;

import org.springframework.stereotype.Service;

import com.test.entities.Student;

@Service
public class ShopService {
	
		public Student getStudent() {
			return new Student("ganesh",33);
		}
		
		public String getName() {
			return "thite";
		}
}
