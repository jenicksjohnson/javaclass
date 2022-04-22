package com.jenicks.core.ObjectClassMethod.Equals_method;

public class test {

	public static void main(String[] args) {
		Book b1=new Book(100,200);
		System.out.println(b1);
		Book b2=new Book(100,200);
		System.out.println(b2);
		b1.Display();
//		System.out.println(b1==b2);
		//public boolean equals (object args)
		System.out.println(b1.equals(b2));
	}

}
