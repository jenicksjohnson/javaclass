package com.jenicks.core.Arrays.ArrayProblems;

import java.util.Scanner;

public class printOddorEven {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the length of array:");
		int size=scn.nextInt();
		int []arr=new int[size];
		System.out.println("enter the valuees of array:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scn.nextInt();
		}
		String str1="";
		String str2="";
		String [] oddnum;
		String [] evennum;
		System.out.println("Odd numbers are");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				str1+=arr[i]+",";
			}else {
				str2+=arr[i]+",";
			}
		}
		evennum=str1.split(",");
		oddnum=str2.split(",");
		System.out.println("Odd number array values");
		for(int i=0;i<evennum.length;i++) {
			System.out.println(evennum[i]);
		}
		System.out.println("Odd number array values");
		for(int i=0;i<oddnum.length;i++) {
			System.out.println(oddnum[i]);
		}
		
	}

}
