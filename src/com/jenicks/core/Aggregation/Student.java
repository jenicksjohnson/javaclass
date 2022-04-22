package com.jenicks.core.Aggregation;

public class Student {
	int rollno;
	String name;
//	aggregation method
	Address adr;
public Student(int rollno, String name, Address adr) {
	super();
	this.rollno = rollno;
	this.name = name;
	this.adr = adr;
}
	
	void display() {
		System.out.println("roll no"+rollno);
		System.out.println("name"+name);
		System.out.println("address"+adr);
	}

	
}
