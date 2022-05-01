package com.jenicks.core.Arrays.ArrayProblems;

import java.util.Scanner;

public class DuplicateEle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("enter "+size+" numbers");
		for (int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int[] rmdarr=new int[arr.length];
		for(int k=0;k<rmdarr.length;k++) {
			System.out.println(rmdarr[k]);
		}
	}
	
	
	
	

}
