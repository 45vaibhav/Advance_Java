package com.test.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.entities.Student;
import com.test.repo.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentRepo repo;
	
	
	public StudentServiceImpl(StudentRepo repo) {
		super();
		this.repo = repo;
	}
	
	@Override
	public Student login(String name,String password) {
			return repo.getByNameAndPassword(name, password);
	}
	@Override
	public List<Student>getAllStudents(){
			return repo.findAll();
		}
	@Override	
	public Student saveStudent(Student student) {
			return repo.save(student);
		}
	@Override
	public Student getStudentById(int id) {
		return repo.findById(id).orElse(null);
	}
		
}
