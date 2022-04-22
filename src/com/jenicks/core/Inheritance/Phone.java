package com.jenicks.core.Inheritance;

public class Phone {
	int on(String a) {
		System.out.println("Turning on "+a);
		int n=123+154;
		return n;
	}
	void off() {
		System.out.println("Switching off");
	}

}

class Samsung extends Phone{
	void takePhones() {
		System.out.println("taking photos");
	}
}

class newphone extends Samsung{
	void facesensor() {
		System.out.println("move out");
	}
}