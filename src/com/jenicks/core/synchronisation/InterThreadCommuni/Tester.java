package com.jenicks.core.synchronisation.InterThreadCommuni;

public class Tester {

	public static void main(String[] args) {
		Account a1=new Account();
		Thread t1=new Thread() {
			public void run(){
				a1.withdraw(7000);
			}
		
		};
		Thread t2=new Thread() {
			public void run() {
				a1.deposit(5000);
			}
		};
		t1.start();
		t2.start();

	}

}
