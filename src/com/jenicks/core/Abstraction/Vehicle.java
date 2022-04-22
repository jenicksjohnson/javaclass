package com.jenicks.core.Abstraction;

public interface Vehicle {
	void ChangeGear(int g);
	void SpeedUp(int s);
	void ApplyBrake(int a);

}

class Bicycle implements Vehicle{
	int speed;
	int gear;
	int brake;
	@Override
	public void ChangeGear(int g) {
		gear=g;
		
	}

	@Override
	public void SpeedUp(int s) {
		speed=s+speed;
		
	}

	@Override
	public void ApplyBrake(int a) {
		speed=speed-a;
		
	}
	void display() {
		System.out.println("Speed = "+speed+"\ngear = "+gear);
	}
}