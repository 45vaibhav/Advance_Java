package com.test.service;

import java.util.List;

import com.test.entities.Student;

public interface StudentDao {
		void addstudent(Student student);
		List<Student> getallstudent();
}
