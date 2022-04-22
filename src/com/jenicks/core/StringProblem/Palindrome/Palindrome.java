package com.jenicks.core.StringProblem.Palindrome;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String st=sc.nextLine();
		String lc=st.toLowerCase();
		int flag=1;
		int n=lc.length();
		for(int i=0;i<n/2;i++) {
			if(lc.charAt(i)== lc.charAt(n-1-i)) {
				flag=1;
			}else {
				flag=2;
			}
		}
		if(flag==1) {
			System.out.println("it is palindrome");
		}else{
			System.out.println("not palindrome");
		}

	}

}
