package com.springcore.javaConfig;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;

@Configurable
//@ComponentScan(basePackages = "com.springcore.javaConfig")
public class JavaConfig {
	@Bean(name = {"samosa"}) // if you don't provide name then Bean name will be "getSamosa".
	public Samosa getSamosa() {
		return new Samosa();
	}
	
	@Bean(name = {"student","temp"}) // you can specify more than one name for same bean.
	public Student getStudent() {
		return new Student(getSamosa());
	}
	
}
