package com.test.entities;

import org.springframework.web.bind.annotation.CrossOrigin;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Student {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		
		int id;
		String name;
		String password;
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Student(int id, String name,String password) {
			super();
			this.id = id;
			this.name = name;
			this.password=password;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		
		
}
