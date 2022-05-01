package com.jenicks.core.Arrays.Comperator;

import java.util.Arrays;
import java.util.Scanner;

public class StudentTester {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student[] arr= {
				new Student("Arun",1001,2005),
				new Student("Bibin",1005,2001),
				new Student("Rahul",1003,2010),
				new Student("Manu",1010,2003),
				new Student("Crin",1004,2006)
		};
		System.out.println("Sorting based on");
		String by=sc.nextLine();
		if(by.equalsIgnoreCase("name")) {
			Arrays.sort(arr);
		}
		if(by.equalsIgnoreCase("id")) {
			Arrays.sort(arr,new IdComperator());
		}
		if(by.equalsIgnoreCase("yop")) {
			Arrays.sort(arr,new yop());
		}
		for(Student r:arr) {
			System.out.println(r);
		}
	}

}
