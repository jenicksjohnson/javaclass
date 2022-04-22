package com.jenicks.core.ObjectClassMethod.Equals_method;

public class Book {
	int pages;
	int value;
	Book(int p,int val){
		this.pages=p;
		this.value=val;
	}
	void Display() {
		System.out.println(pages);
	}
	@Override
	public boolean equals(Object arg)
	{
		if(!(arg instanceof Book)) 
		return false;
		return ((pages==((Book)arg).pages) && (value==((Book)arg).value));
	}
}
