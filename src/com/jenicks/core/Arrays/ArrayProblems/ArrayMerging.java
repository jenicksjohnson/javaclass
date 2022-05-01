package com.jenicks.core.Arrays.ArrayProblems;

import java.util.Iterator;
import java.util.Scanner;

public class ArrayMerging {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first array size");
		int size1=sc.nextInt();
		int[] arr1=new int[size1];
		System.out.println("enter "+size1+" numbers");
		for (int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("enter the second array size");
		int size2=sc.nextInt();
		int[] arr2=new int[size2];
		System.out.println("enter "+size2+" numbers");
		for (int i=0;i<arr2.length;i++) {
			arr2[i]=sc.nextInt();
		}
		
		int[] totalarr=new int[size1+size2];
		for (int i=0;i<arr1.length;i++) {
			totalarr[i]=arr1[i];
		}
		for (int i=0;i<arr2.length;i++) {
			totalarr[size1+i]=arr2[i];
		}
		System.out.println("final array:: ");
		for (int i=0;i<totalarr.length;i++) {
			System.out.println(totalarr[i]);
		}

	}

}
