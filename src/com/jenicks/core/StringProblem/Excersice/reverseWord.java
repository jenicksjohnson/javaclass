package com.jenicks.core.StringProblem.Excersice;

import java.util.Scanner;

public class reverseWord {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter the string");
		String s=scn.nextLine();
		String arr[]=s.split(" ");
		String temp="";
		for (int i=0;i<=arr.length-1;i++) {
			temp=arr[i]+" "+temp;
		}
		System.out.println(temp);
	}
}
