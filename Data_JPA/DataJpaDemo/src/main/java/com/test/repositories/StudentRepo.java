package com.test.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.entities.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {
	List<Student> findByAge(int age);

}
