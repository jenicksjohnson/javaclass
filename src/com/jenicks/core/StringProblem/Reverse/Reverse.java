package com.jenicks.core.StringProblem.Reverse;
import java.util.*;

public class Reverse {

	public static void main(String[] args) {
//		madam malayalam
		Scanner scn=new Scanner(System.in);
		System.out.println("enter your string");
		String s1=scn.nextLine();
		String r=reverse(s1);
		System.out.println("after reverse\n"+r);
		
	}
	public static String reverse(String s) {
		String rev="";
		if(s==null) {
			return null;
		}
		for(int i=s.length()-1;i>=0;i--) {
			rev+=s.charAt(i);
		}
		return rev;
	}

}
