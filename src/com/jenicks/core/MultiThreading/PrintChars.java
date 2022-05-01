package com.jenicks.core.MultiThreading;

public class PrintChars extends Thread {
	@Override
	public void run() {
		System.out.println("Run method of print characters started");
		for(char c='a';c<='z';c++) {
			System.out.println(c);
		}
	}

}
