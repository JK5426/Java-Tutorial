package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.core.io.buffer.LimitedDataBufferList;
import org.springframework.stereotype.Component;

@Component  // you want your bean name other than student mean in ("newname")
@Scope("prototype")  // default value = "singleton"
public class Student {
	@Value("Jitendra")   // initialized the value at run time...
	private String studentName;
	private String city;
	@Value("#{temp}") //spring Expression Language // we create a standalone list in config file with id "temp"
	private List<String> books;	
	

	public List<String> getBooks() {
		return books;
	}

	public void setBooks(List<String> books) {
		this.books = books;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + "]";
	}

}
