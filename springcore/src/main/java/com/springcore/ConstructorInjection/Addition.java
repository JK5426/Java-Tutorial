package com.springcore.ConstructorInjection;

public class Addition {
	private int x;
	private int y;
	
	public Addition(double x, double y) {
		super();
		this.x = (int)x;
		this.y = (int) y;
		System.out.println("Constructor called having two double value.");
	}
	public Addition(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		System.out.println("Constructor called having two interger value.");
	}
	
	public void doSum() {
		System.out.println("x : " + this.x + " y : " + this.y);
		System.out.println("sum is : " + (this.x+this.y)); 
	}
}
