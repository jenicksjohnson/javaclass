package com.jenicks.core.finallyblock;

public class testFinal {

	public static void main(String[] args) {
		System.out.println("main Starts");
		try {
			int a=10/0;
		}catch(Exception e) {
			System.out.println("catch runs");
		}finally {
			System.out.println("finally block starts");
		}
		System.out.println("main ends");

	}

}
