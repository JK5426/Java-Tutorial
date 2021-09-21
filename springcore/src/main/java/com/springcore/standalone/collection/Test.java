package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/collection/standaloneConfig.xml");
		Person person = context.getBean("person",Person.class);
		System.out.println(person);
		System.out.println("Datatype of friends list : " +person.getFriends().getClass().getName());
		System.out.println("Datatype of courseFee set : " +person.getCourseFee().getClass().getName());
	}
}
