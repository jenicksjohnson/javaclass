package com.jenicks.core.Polymorphism;

//overloading
public class Rider {
	void ride(Bike b1) {
		System.out.println("executing ride with Bike argument");
		b1.start();
	}
	void ride(Pulsar b1) {
		System.out.println("executuing ride with pulsar arguments");
		b1.start();
	}

}
