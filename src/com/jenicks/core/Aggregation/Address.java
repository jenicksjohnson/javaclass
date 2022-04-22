package com.jenicks.core.Aggregation;

public class Address {
	String District;
	String State;
	String Country;
	public Address(String district, String state, String country) {
		super();
		District = district;
		State = state;
		Country = country;
	}
	@Override
	public String toString() {
		return "Address [District=" + District + ", State=" + State + ", Country=" + Country + "]";
	}
	
}
