package com.test.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.entities.Student;
import com.test.repositories.StudentRepo;
import com.test.services.ShopService;

@RestController
@CrossOrigin(origins="http://localhost:5173")
@RequestMapping("/students")
public class ShopController {
	@Autowired
	StudentRepo repo;
	
	List<Student> ls=new ArrayList<Student>();
	@Autowired
	ShopService service;
	
	@GetMapping("/getallstudents")
	List<Student> getallstudents(){
		return repo.findAll();
	}
	
	@GetMapping("/student")
	Student getStudent() {
		return service.getStudents();
	}
	
	@GetMapping
	String studentname() {
		return service.getName();
	}
	
	@PostMapping("/addstudent")
	Student addstudent(@RequestBody Student obj) {
		return repo.save(obj);
	}
	
	@GetMapping("/studentbyage/{age}")
	
	List<Student> studentByAge(@PathVariable int age) {
		List<Student> stu=repo.findByAge(age);
		return repo.findByAge(age);
	}
}
