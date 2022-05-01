package com.jenicks.core.Arrays.ArrayProblems;

import java.util.Scanner;

public class removeEle {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the length of array:");
		int size=scn.nextInt();
		int []arr=new int[size];
		System.out.println("enter the valuees of array:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scn.nextInt();
		}
		System.out.println("input the element to remove:");
		int remEle=scn.nextInt();
		int []finalarr=new int[size-1];
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==remEle) {
				continue;
			}else {
				finalarr[index]=arr[i];
				index++;
			}
		}
		arr=finalarr;
		for (int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]);
		}
		
	}

}




