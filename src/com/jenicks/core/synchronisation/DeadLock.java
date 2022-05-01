package com.jenicks.core.synchronisation;

public class DeadLock {
	//Thread interference
	//Consistency
	
	//Synchronization::
	//1.process synchronization
	//2.Thread synchronization
	
	
	//2 methods to do:
		//1-Mutual Exclusive
			//1.1-using synchronization method
			//1.2-using synchronized block
			//1.3-static synchronization
		//2.InterThread Communication--(Cooperation)
		//DeadLock
	public static void main(String[] args) {
		//Tester
		Table t1= new Table();
		Thread1 th1=new Thread1(t1);
		Thread2 th2=new Thread2(t1);
		th1.start();
		th2.start();
	}			
			



}
