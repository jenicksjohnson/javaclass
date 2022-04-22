package com.jenicks.core.returnObject;

public class CarType {

	String CarName;
	int CarYear;
	double fAmount;
	
	CarType(String Name,int Year,double amount){
		CarName=Name;
		CarYear=Year;
		fAmount=amount;
	}
	
	void Display() {
		System.out.println("Car name= "+CarName);
		System.out.println("Car year= "+CarYear);
		System.out.println("Car Fine amount"+fAmount);
	}

}
