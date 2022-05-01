package com.jenicks.core.CustomException;

import java.util.Scanner;

public class BankAtm {
	public static void main(String[] args) throws SamePinException {
		Scanner sc=new Scanner(System.in);
		Account a1=new Account(5500);
		int ch;
		do {
			System.out.println("1--->Check Balance");
			System.out.println("2--->Cash Withdraw");
			System.out.println("3--->Pin Change");
			int input=sc.nextInt();
			switch (input) {
			case 1:
				a1.getBalance();
				break;
			case 2:
				System.out.println("Enter the amount to withdraw");
				double w1=sc.nextInt();
				try {
				a1.withdraw(w1);
				}
				catch(Exception s) {
					System.out.println("withdraw failure");
				}
			case 3:
				try {
				a1.PinChange();
				}
				catch(Exception s){
					System.out.println("the pin you have entered is already used");
				}
			default:
				System.out.println("invalid number");
				break;
			}
			System.out.println("enter 0 to continue and 4 to exit");
			ch=sc.nextInt();
		} while (ch==0);
	}

}
