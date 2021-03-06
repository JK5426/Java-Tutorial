package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {	
	
	@Autowired
	@Qualifier("address2")    // if you created more than one bean of same type...
	private Address address;	
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		System.out.println("Inside setter.");
		this.address = address;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee( Address address) {
		super();
		
		this.address = address;
		System.out.println("Inside Constructor.");
	}
	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
		
	
}
