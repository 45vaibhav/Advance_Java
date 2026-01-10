package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main(String args[]) {
    	
        Configuration cfg=new Configuration();
       	cfg.configure("hibernate.cfg.xml");
       	
       	SessionFactory sessionfactory=cfg.buildSessionFactory();
       	Session session=sessionfactory.openSession();
       	
       	Transaction tx=session.beginTransaction();
//       	INSERT_DATA
//       	Student s=new Student(2,"diwane");
//       	session.save(s);
//       	GET_DATA
       	Student s1=session.get(Student.class, 1);
       	System.out.println(s1.name);
       	
       	tx.commit();
       	session.close();
    }
}
