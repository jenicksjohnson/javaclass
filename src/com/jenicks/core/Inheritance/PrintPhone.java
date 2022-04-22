package com.jenicks.core.Inheritance;

public class PrintPhone {

	public static void main(String[] args) {
		newphone m1=new newphone();
		m1.facesensor();
		m1.takePhones();
		m1.off();
		int j=m1.on("iphone");
		System.out.println(j);

	}

}
