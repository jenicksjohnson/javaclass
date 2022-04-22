package com.jenicks.core.ObjectClassMethod.ToString_method;

public class Book {
	int pages;
	int value;
	Book(int p,int val){
		this.pages=p;
		this.value=val;
	}
	
	@Override
	public String toString() {
		return "Book [pages=" + pages + ", value=" + value + "]";
	}
	
}
