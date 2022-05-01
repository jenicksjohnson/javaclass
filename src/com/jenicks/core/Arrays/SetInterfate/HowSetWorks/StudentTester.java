package com.jenicks.core.Arrays.SetInterfate.HowSetWorks;

import java.util.HashSet;
import java.util.Set;

public class StudentTester {

	public static void main(String[] args) {
		Set s1=new HashSet();
		s1.add(new Student("Arun",45,21));
		s1.add(new Student("Basil",41,22));
		s1.add(new Student("Arun",45,21));
		System.out.println(s1);
	}

}
