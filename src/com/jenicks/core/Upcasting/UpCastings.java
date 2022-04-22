package com.jenicks.core.Upcasting;

public class UpCastings {
	void class1() {
	System.out.println("class 1 in Upcasting");
	}
}

class b extends UpCastings{
	@Override
	void class1() {
		System.out.println("class 1 in B");
	}
}

class c extends UpCastings{
	@Override
	void class1() {
		System.out.println("class 1 in c");
	}
}
