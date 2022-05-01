package com.jenicks.core.MultiThreading;

public class printingNumbers {

	public static void main(String[] args) {
		System.out.println("Main Started");
		Thread t1=new PrintChars();
		t1.start();
		for(int i=0;i<21;i++) {
			System.out.println(i);
		}
		System.out.println("Main ended");

	}

}
