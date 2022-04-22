package com.jenicks.core.Polymorphism;

public class Test {

	public static void main(String[] args) {
		Rider r1=new Rider();
		Pulsar p1=new Pulsar();
		Bike b1=new Bike();
		r1.ride(p1);
		//
		r1.ride(b1);
	}

}
