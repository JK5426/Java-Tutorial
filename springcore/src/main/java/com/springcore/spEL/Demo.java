package com.springcore.spEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

	@Value("#{22+33}")
	private int x;

	// lets call static methods here.
	@Value("#{T(java.lang.Math).sqrt(144)}") // T(className).methodName()
	private int y;

	// calling static variable...
	@Value("#{T(java.lang.Math).E}")
	private double z;

	// calling constructor ...
	@Value("#{ new String('Jitendra kushwaha') }")
	private String names;

	public String getNames() {
		return names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", names=" + names + "]";
	}

}
