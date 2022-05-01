package com.jenicks.core.Arrays.ArrayProblems;

import java.util.Scanner;

public class specificIndxAddVal {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the size of array ");
		int size=scn.nextInt();
		int[] a1=new int[size];
		System.out.println("enter the numbers");
		for(int i=0;i<size;i++) {
			a1[i]=scn.nextInt();
		}
		System.out.println("enter the index of array which want to replace");
		int index=scn.nextInt();
		System.out.println("enter the value to add");
		int value=scn.nextInt();
		
		int[] newa1=new int[size+1];
		newa1=remove(a1,index,value);
		for (int j=0;j<newa1.length;j++) {
			System.out.println(newa1[j]);
		}
	}
	static int[] remove(int[] arr,int index,int value) {
		int len=arr.length;
		int[] newarr=new int[len+1];
		for(int i=0;i<index-1;i++) {
			newarr[i]=arr[i];
		}
		newarr[index-1]=value;
		for (int j=index;j<newarr.length;j++) {
			newarr[j]=arr[j-1];
		}
		return newarr;
	}

}
