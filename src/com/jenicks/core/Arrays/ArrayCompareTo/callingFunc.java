package com.jenicks.core.Arrays.ArrayCompareTo;

import java.util.Arrays;

public class callingFunc {

	public static void main(String[] args) {
		Comapretoo[] c1= {
				new Comapretoo("java",1890),
				new Comapretoo("php",290),
				new Comapretoo("python",890),
				new Comapretoo("c",90)
	};
		Arrays.sort(c1);
		for(Comapretoo c:c1) {
			System.out.println(c);
		}
		
}
}