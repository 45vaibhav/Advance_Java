package com.test.serviceimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.test.entities.Student;
import com.test.service.StudentDao;
import com.test.utilities.DBUtil;

public class StudentImpl implements StudentDao{
	@Override
	public void addstudent(Student student) {
		String q="insert into owner(id, name, address, age)values(?,?,?,?)";
		try(Connection con=DBUtil.getConnection();
				PreparedStatement ps=con.createPreparedStatement(q);
				) {
			ps.setInt(1, student.getId());
			ps.setString(2, student.getName());
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
		
}
