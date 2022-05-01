package com.jenicks.core.synchronisation.InterThreadCommuni;

public class Account {
	double balance =5000;
	
	synchronized public void withdraw(double amount) {
		System.out.println("Going to withdraw");
		if(amount>balance) {
			System.out.println("Less balance please wait for depositing");
			try {
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
			balance-=amount;
			System.out.println("Withdraw Completed");
			System.out.println("current balance="+balance);
	}
	synchronized void deposit(double dep) {
		System.out.println("Depositing the amount");
		balance+=dep;
		System.out.println("Depositing completed");
		notify();
	}
	
	
	
}
