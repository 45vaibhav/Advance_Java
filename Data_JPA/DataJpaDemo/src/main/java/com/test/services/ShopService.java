package com.test.services;



import org.springframework.stereotype.Service;

import com.test.entities.Student;
import com.test.repositories.StudentRepo;
@Service
public class ShopService {
	
//	private final StudentRepo repo;
	
	public Student getStudents() {
		return new Student("vaibhav",43);
	}
	
	public String getName() {
		return "ganesh";
	}
}
