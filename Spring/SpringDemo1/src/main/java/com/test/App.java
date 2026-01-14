package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.test.configuration.AppConfig;
import com.test.entities.Student;
import com.test.service.Address;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext app=new AnnotationConfigApplicationContext(AppConfig.class);
       Student s=app.getBean(Student.class);
      Address current= s.getAddress();
      current.streetAddress();
       
    }
}
