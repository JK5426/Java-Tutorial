package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Pepsi price initilized.");
		this.price = price;
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	// we don't need configure this methods..
	public void afterPropertiesSet() throws Exception { // this method is similar to init() methods.
		// TODO Auto-generated method stub
		System.out.println("Initilizer function is callled in pespi class.");

	}

	public void destroy() throws Exception { // destroy method --> free all resources.
		// TODO Auto-generated method stub
		System.out.println("Destructor function is callled in pespi class.");
	}

}
