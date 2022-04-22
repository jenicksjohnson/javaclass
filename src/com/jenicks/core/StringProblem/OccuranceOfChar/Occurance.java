package com.jenicks.core.StringProblem.OccuranceOfChar;

import java.util.Scanner;

public class Occurance {
	public static void main(String [] Args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=scn.next();
		
		
		String temp="";
		for (int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(temp.indexOf(c)!=-1)
				continue;
			int count=getCount(s,c);
			System.out.println(c+"="+count);
			temp+=c;
		}
	}
	static int getCount(String w, char l) {
		String d=w.replace(l+"", "");
		return w.length()-d.length();
	}
	

}
