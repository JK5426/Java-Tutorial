package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoConfig.xml");
		Student st = context.getBean("student",Student.class);
//		System.out.println(st);
//		System.out.println(st.getBooks());
		
		System.out.println("Hashcode for student 1 : " + st.hashCode());
		
		Student st2 = context.getBean("student",Student.class);
		
		System.out.println("Hashcode for student 2 : "+ st2.hashCode());
		
		
	}
}
