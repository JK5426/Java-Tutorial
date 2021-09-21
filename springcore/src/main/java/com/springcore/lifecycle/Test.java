package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/lifecycle/lifeConfig.xml");

		context.registerShutdownHook();
		Samosa samosa = (Samosa) context.getBean("s1");
		 System.out.println(samosa.getPrice());
		 
		 System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");

		// to call the destroy function we need to registerShutdownHook() function....

		Pepsi pepsi = (Pepsi) context.getBean("pepsi");
		System.out.println(pepsi);
		
		Example ex = (Example) context.getBean("Ex");
		System.out.println(ex);
	}
}
