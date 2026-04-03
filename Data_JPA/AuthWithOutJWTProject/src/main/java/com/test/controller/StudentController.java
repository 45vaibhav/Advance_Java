package com.test.controller;



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
import com.test.services.StudentService;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentService service;
	
	
	//GETALL STUDENTS
	@GetMapping("/getstudents")
	public List<Student> getAllStudents(){
		try {
		return service.getAllStudents();
		}catch(Exception e) {
			return null;
	}
}
	

	//ADD STUDENT 
	@PostMapping("/savestudent")
	public Student saveStudent(@RequestBody Student student) {
		return service.saveStudent(student);
	}
	
	
	@GetMapping("/getbyid/{id}")
	public Student getStudentById(@PathVariable int id) {
		return service.getStudentById(id);
	}
	
	
	@PostMapping("/login")
	public String login(@RequestBody Student student) {

	    Student data= service.login(
	        student.getName(),
	        student.getPassword()
	    );

	    if (data != null) {
	        return "SUCCESS";
	    } else {
	        return "FAIL";
	    }
	}
	
	
}
