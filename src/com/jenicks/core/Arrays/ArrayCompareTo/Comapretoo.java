package com.jenicks.core.Arrays.ArrayCompareTo;

public class Comapretoo implements Comparable {
	String book;
	int pages;
	public Comapretoo(String book, int pages) {
		super();
		this.book = book;
		this.pages = pages;
	}
	@Override
	public String toString() {
		return "Comapretoo [book=" + book + ", pages=" + pages + "]";
	}
	@Override
	public int compareTo(Object x) {
		Comapretoo b=(Comapretoo) x;  //down casting
		return pages-b.pages;
	}
	
	

}

//sorting by pages::
//public int compareTo(Object x) {
//	Comapretoo b=(Comapretoo) x;  //down casting
//	return pages-b.pages;
//}