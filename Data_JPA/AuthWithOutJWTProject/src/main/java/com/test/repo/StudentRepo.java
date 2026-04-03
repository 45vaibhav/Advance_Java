package com.test.repo;



import org.springframework.data.jpa.repository.JpaRepository;

import com.test.entities.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

	Student getByNameAndPassword(String name,String  password);
}