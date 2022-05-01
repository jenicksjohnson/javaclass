package com.jenicks.core.CustomException;

public class SamePinException extends Exception{
	public SamePinException() {
		System.out.println("Same pin is not accepted");
	}
}
