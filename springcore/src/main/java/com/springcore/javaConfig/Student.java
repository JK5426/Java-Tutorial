package com.springcore.javaConfig;

//import org.springframework.stereotype.Component;

//@Component("student")  // now we are going to use @Bean
public class Student {
	private Samosa samosa;	
	
	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}

	public void study() {
		samosa.price();
		System.out.println("student is reading book");
	}
}
