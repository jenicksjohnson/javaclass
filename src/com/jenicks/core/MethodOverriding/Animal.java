package com.jenicks.core.MethodOverriding;

public class Animal {
	void move() {
		System.out.println("Animal moving");
	}
	

}
class Dog extends Animal{
	
}

class Snake extends Animal{
	void move() {
		System.out.println("Snake Moving");
	}
}
