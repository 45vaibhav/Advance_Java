package com.test.utilities;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	
		private static final String url="jdbc:mysql://localhost:3306/car";
		private static final String user="root";
		private static final String password="Vaibhav@123";
		
		static Connection getConnection() {
			try {
			Connection con=DriverManager.getConnection(url , user,password );
			return con;
			}catch(Exception e) {
				e.printStackTrace();
				return null;
			}
		}
}
