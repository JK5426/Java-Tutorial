package com.springcore.autowire;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext context =new ClassPathXmlApplicationContext("com/springcore/autowire/autoConfig.xml");
		
		Employee emp = (Employee) context.getBean("Emp");
		System.out.println(emp);
	}
}
