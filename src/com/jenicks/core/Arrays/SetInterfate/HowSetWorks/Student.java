package com.jenicks.core.Arrays.SetInterfate.HowSetWorks;

public class Student {
	String name;
	int marks;
	int age;
	public Student(String name, int marks, int age) {
		super();
		this.name = name;
		this.marks = marks;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		return age;
	}
	public boolean equals(Object x) {
		if(!(x instanceof Student))
			return false;
		Student s1=(Student)x;
		return name.equals(s1.name)&& marks==(s1.marks) && age==s1.age;
	}
	
}
