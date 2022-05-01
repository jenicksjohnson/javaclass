package com.jenicks.core.Arrays.ArrayProblems;

import java.util.Scanner;

public class ThirdandSecondelement {
	public static void main(String [] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=scn.nextInt();
		System.out.println("enter "+size+" numbers");
		int []arr=new int[size];
		int len=arr.length-1;
		for(int i=0;i<arr.length;i++) {
			arr[i]=scn.nextInt();
		}
		
		
		int []newarr=new int[size];
		ThirdandSecondelement ts=new ThirdandSecondelement();
		newarr=ts.sort(arr);
	
		System.out.println("third largest: "+newarr[len-2]);
		System.out.println("second smallest: "+newarr[1]);
		
	}
	public int[] sort(int[] arra) {
		for(int i=0;i<arra.length-1;i++) {
			for(int j=i+1;j<arra.length-1;j++) {
				if(arra[i]>arra[j]) {
					int temp=arra[i];
					arra[i]=arra[j];
					arra[j]=temp;
				}
			}
		}
		return arra;
	}
	
}
