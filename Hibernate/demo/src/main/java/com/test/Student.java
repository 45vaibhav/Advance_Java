package com.test;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
		@Id
		int id;
		String name;
		
		public Student() {
			super();
		}
		public Student(int id , String name) {
			this.id=id;
			this.name=name;
		}
}
