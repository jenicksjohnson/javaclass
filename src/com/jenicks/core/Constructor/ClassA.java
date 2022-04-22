package com.jenicks.core.Constructor;

//Constructor calling
public class ClassA {
	int a;
	public ClassA(int a) {
		this.a=a;
		System.out.println("constructor of ClassA"+a);
	}
	
}
class B extends ClassA{
	int h;

	public B(int h) {
		super(h);
		
		System.out.println("constructor of Class B");
	}
}

class C extends B{
	public C() {
		super(1456);  //call to super
		System.out.println("constructor of Class C");
	}
}