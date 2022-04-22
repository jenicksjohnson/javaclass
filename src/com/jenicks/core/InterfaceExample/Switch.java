package com.jenicks.core.InterfaceExample;

public interface Switch {
	void on();
	void off();

}

class Fan implements Switch{

	@Override
	public void on() {
		System.out.println("fan turn on");
		
	}

	@Override
	public void off() {
		System.out.println("fan turn off");
		
	}
	
}

class Bulb implements Switch{
	public void on() {
		System.out.println("bulb turn on");
	}
	public void off() {
		System.out.println("bulb turn off");
	}
	
}