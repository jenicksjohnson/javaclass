package com.jenicks.core.Arrays.ArrayProblems;

import java.util.Scanner;

public class BinarySearchArray {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the length of array:");
		int size=scn.nextInt();
		int []arr=new int[size];
		System.out.println("enter the valuees of array:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scn.nextInt();
		}
		System.out.println("enter the key:");
		int key=scn.nextInt();
		
		int []newarr=new int[size];
		newarr=numOrder(arr);
		
		int last=newarr.length-1;
		int res=binarySearch(newarr,key,0,last);
        if (res == -1)  
            System.out.println("key is not found");  
        else  
            System.out.println("key is found");  
    } 
	
	static int[] numOrder(int[] arr) {
		for (int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	
	static int binarySearch(int[] arr,int key,int first,int last){
		if(first<=last) {
			int mid=(first+last)/2;
			if (arr[mid]==key) {
				return mid;
			}else if(key>arr[mid]) {
				
				return binarySearch(arr,key,mid+1,last);
			}else {
				
				return binarySearch(arr,key,0,mid-1);
			}
		}else {
			return -1;
		}
	}
	
}






