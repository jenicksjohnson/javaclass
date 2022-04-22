package com.jenicks.core.returnObject;
import java.util.*;

public class CarObject {
	CarType CarObjects() {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the car Name:");
		String name=sc.next();
		System.out.println("enter the car Year:");
		int year=sc.nextInt();
		System.out.println("enter the car Fine Amount:");
		double amount=sc.nextDouble();
		return new CarType(name,year,amount);
	}

}
