package com.jenicks.core.MultiThreading;

public class PrintNum extends Thread {
	//Thread scheduling && Thread priority
	//we use  algorithms like::
	//1. Fixed priority algorithm
	//2. fifo algorithm(first in first out)
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getPriority());
		System.out.println("countdown started");
		for (int i=1;i<=5;i++) {
			System.out.println(i);
			}
		}
	
	
	//constant threads
//	public final static int MIN_PRIORITY=1;
//	
//	public final static int NORM_PRIORITY=5;
//	
//	public final static int MAX_PRIORITY=10;

	public static void main(String[] args) {
		//public final void setPriority(int newPriority)
		// public final int getPRIORITY()
		 PrintNum t1 = new PrintNum();
		 
		 t1.setPriority(Thread.MAX_PRIORITY);
		 t1.start();
		 System.out.println("Happy New Year");
		
		
		
	}
}
