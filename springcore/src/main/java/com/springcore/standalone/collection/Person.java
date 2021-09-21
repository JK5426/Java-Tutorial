package com.springcore.standalone.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	private List<String> friends;
	private Map<String, Integer> courseFee;
	private Properties properties;

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public Map<String, Integer> getCourseFee() {
		return courseFee;
	}

	public void setCourseFee(Map<String, Integer> courseFee) {
		this.courseFee = courseFee;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

//	public Person(List<String> friends,Map<String,Integer> courseFee) {
//		super();
//		this.friends = friends;
//		this.courseFee = courseFee;
//	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", courseFee=" + courseFee + ", properties=" + properties + "]";
	}

	

}
