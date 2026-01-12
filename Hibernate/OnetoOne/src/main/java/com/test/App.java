package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.test.entities.Address;
import com.test.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
    	try {
       Configuration cfg=new Configuration();
       	cfg.configure("hibernate.cfg.xml");
       SessionFactory sessionfact=cfg.buildSessionFactory();
       Session session=sessionfact.openSession();
       Transaction tx=session.beginTransaction();
//       System.out.println("hello");
      Address add=new  Address(2, "pune", null);
      session.save(add);
      Student s=new Student(102, "prathmesh", "YC", add);
      session.save(s);
      tx.commit();
      session.close();
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
      
 }
}
