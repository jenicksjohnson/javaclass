package com.jenicks.core.Arrays.Comperator;


public class Student implements Comparable {
	String name;
	int id;
	int yop;
	public Student(String name, int id, int yop) {
		super();
		this.name = name;
		this.id = id;
		this.yop = yop;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", yop=" + yop + "]";
	}
	@Override
	public int compareTo(Object x) {
		Student s1=(Student) x;
		return name.compareTo(s1.name);
	}
	
}
