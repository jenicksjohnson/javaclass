package com.jenicks.core.StringProblem.Excersice;

import java.util.Scanner;

public class Swapcases {
	public static void main(String [ ] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the string");
		String st=scn.next();
		char k;
		String newln="";
		for( int i=0;i<=st.length()-1;i++) {
			if (st.charAt(i)>='a' && st.charAt(i) <='z') {
				k=upCase(st.charAt(i));
				newln+=k;
			}else {
				k=loCase(st.charAt(i));
				newln+=k;
			}
		}System.out.println(newln);
		
	}
	static char upCase(char s) {
		char add;
		add=(char) ((int) s-32);
		
		return add;
	}
	static char loCase(char s) {
		char add;
			add=(char) ((int) s+32);
		return add;
	}
	
}
