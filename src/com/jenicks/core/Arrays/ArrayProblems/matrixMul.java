package com.jenicks.core.Arrays.ArrayProblems;

import java.util.Scanner;

public class matrixMul {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of 1st rows");
		int row1=sc.nextInt();
		System.out.println("enter the number of ist column");
		int col1=sc.nextInt();
		int[][] matrix1=new int[row1][col1];
		System.out.println("input array value");
		for (int i=0;i<row1;i++) {
			for(int j=0;j<col1;j++) {
				matrix1[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter the number of 2nd rows");
		int row2=sc.nextInt();
		System.out.println("enter the number of 2nd column");
		int col2=sc.nextInt();
		System.out.println("input array numbers");
		int[][] matrix2=new int[row2][col2];
		for(int y=0;y<row2;y++) {
			for(int z=0;z<col2;z++) {
				matrix2[y][z]=sc.nextInt();
			}
		}
		System.out.println("array after multiplication");
		int[][] temp=new int[row1][col1];
		if((row1==row2)&& (col1==col2)) {
			for(int i=0;i<row1;i++) {
				for(int j=0;j<col2;j++) {
					for(int k=0;k<row2;k++) {
						temp[i][j]+=matrix1[i][k]*matrix2[k][j];
					}
				}
				
			}
		}
		for(int y=0;y<row2;y++) {
			for(int z=0;z<col2;z++) {
				System.out.print(temp[y][z]+" ");
			}System.out.println();
		}
		

	}

}
