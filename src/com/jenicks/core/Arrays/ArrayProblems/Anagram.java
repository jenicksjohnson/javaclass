package com.jenicks.core.Arrays.ArrayProblems;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the first String");
		String s1=scn.nextLine();
		char[] arr1=new char[s1.length()];
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=s1.charAt(i);
		}
		
		System.out.println("enter the second String");
		String s2=scn.nextLine();
		char[] arr2=new char[s2.length()];
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=s2.charAt(i);
		}
		
		char[] newarr1=new char[arr1.length];
		char[] newarr2=new char[arr2.length];
		
		newarr1=sort(arr1);
		newarr2=sort(arr2);
		
		if (arr1.length!=arr2.length) {
			System.out.println("it is not anagram");
		}else {
			for(int i=0;i<newarr1.length;i++) {
				System.out.println(newarr1[i]);
			}
			for(int i=0;i<newarr2.length;i++) {
				System.out.println(newarr2[i]);
			}	
				
				
			int flag=0;
			for(int i=0;i<newarr1.length;i++) {
				if(newarr1[i]!=newarr2[i]) {
					flag=0;
					break;
				}else {
					flag=1;
				}
			
			}
			if(flag==0) {
				System.out.println("it is not anagram");
			}else {
				System.out.println("it is anagram");
			}
		
		
			
		}
		
	}
	static char[] sort(char[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					char temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}

}
