package com.test.services;

import java.util.List;

import com.test.entities.Student;

public interface StudentService {
	List<Student >getAllStudents();

	Student getStudentById(int id);
	
	Student saveStudent(Student student);
	
	Student login(String name , String password);
	 
//	void deleteStudentById(int id);
}
