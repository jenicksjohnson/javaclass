package com.jenicks.core.StringProblem.Excersice;

import java.util.Scanner;

public class RmveWrdFrmStrng {
	public static void main(String[] args) {
//		Scanner scn=new Scanner(System.in);
		String str="Let’s discuss the ways to convert string array to string";
		String rem="string";
		String arr[]=str.split(" ");
		String temp=str.replace(rem, "");
		System.out.println(temp);
	}
}