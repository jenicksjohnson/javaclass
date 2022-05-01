package com.jenicks.core.Arrays.ArrayProblems;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		System.out.println("enter "+size+" numbers");
		for (int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int j=0;j<arr.length-1;j++) {
			int index=j;
			for( int k=j+1;k<arr.length;k++) {
				if(arr[k]<arr[j]) {
					index=k;
				}
			}
			int temp=arr[index];
			arr[index]=arr[j];
			arr[j]=temp;
		}
		for (int j=0;j<arr.length;j++) {
			System.out.println(arr[j]);
		}
		
	}

}
