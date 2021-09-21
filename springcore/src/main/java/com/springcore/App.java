package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.collections.Emp;


public class App 
{
    private static ApplicationContext context;

	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        context = new ClassPathXmlApplicationContext("config.xml");
        
        Student student = (Student)context.getBean("Student");
        System.out.println(student);
        
//        Creating a more object
        Student student1 = (Student)context.getBean("Student1");
        System.out.println(student1);
        
        ApplicationContext contextEmp = new ClassPathXmlApplicationContext("CollectionConfig.xml");
        Emp emp = (Emp)contextEmp.getBean("Emp");
        
        System.out.println(emp);
    }
}
