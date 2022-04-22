package com.jenicks.core.Polymorphism;

//overriding
public class Bike {
	void start() {
		System.out.println("Bike starts");
	}

}
class Pulsar extends Bike{
	void start() {
		System.out.println("Pulsar starts");
	}
}
