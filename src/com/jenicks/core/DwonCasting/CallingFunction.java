package com.jenicks.core.DwonCasting;

public class CallingFunction {

	public static void main(String[] args) {
		DownCasting a1= new A();  //upcasting
		a1.Bike1();
		//Downcasting
		B B1=(B)a1;
		B1.Bike3();
		B1.Bike1();
	}

}
