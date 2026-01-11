package com.test.services;

import com.test.entities.Student;

public interface StudentDao {
		void addstudent(Student student);
		Student getstudent();
		void deletestudent();
		void updatestudent();
}
