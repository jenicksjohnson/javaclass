package com.jenicks.core.CustomException;

import java.util.Scanner;

public class Account {
	Scanner scn=new Scanner(System.in);
	double balance;
	public Account(double balance) {
		super();
		this.balance=balance;
	}
	public void withdraw(double amt) throws InsufficiantBalanceException {
		if(balance<amt) {
			System.out.println("Shortage of"+(amt-balance)+"Rs");
			throw new InsufficiantBalanceException();
		}
		else {
			balance-=amt;
			System.out.println("amount withdrawn and balance= "+(balance-amt) );
		}	
	}
	public void getBalance() {
		System.out.println("Balance:"+balance);
	}
	public void PinChange() throws SamePinException {
		System.out.println("Enter the old pin::");
		int oldpin=scn.nextInt();
		System.out.println("Enter the new pin::");
		int newpin=scn.nextInt();
		if (oldpin==newpin) {
			throw new SamePinException();
		}else {
			System.out.println("pin changed succesfully");
		}
	}
	
}
