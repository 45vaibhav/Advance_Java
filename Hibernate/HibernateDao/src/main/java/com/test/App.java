package com.test;

import com.test.entities.Student;
import com.test.serviceimpl.StudentImpl;
import com.test.services.StudentDao;

public class App 
{
    public static void main( String[] args ) {
    	StudentDao studentserv=new StudentImpl();
    	Student s=new Student(995,"sujit");
    	studentserv.addstudent(s);
//    	Student s1=new Student(993,"gaurav");
//    	studentserv.addstudent(s1);
//    	studentserv.getstudent();
//     	studentserv.deletestudent();
//    	studentserv.updatestudent();
    	
    	
    }
}