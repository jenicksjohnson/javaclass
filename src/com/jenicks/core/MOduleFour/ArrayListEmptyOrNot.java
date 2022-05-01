package com.jenicks.core.MOduleFour;

import java.util.ArrayList;

public class ArrayListEmptyOrNot {
	public static void main(String[] args) {
		ArrayList l1=new ArrayList();
		l1.add(15);
		l1.add(25);
		
		if(l1.size()==0) {
			System.out.println("Array is empty");
		}
		else {
			System.out.println("Array is not empty");
			System.out.println("Values are: "+l1);
		}
	}
}
