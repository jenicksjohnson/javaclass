package com.jenicks.core.FilesinJava;

import java.io.ByteArrayInputStream;


public class BytearrayInputstream {

	public static void main(String[] args) {
		try {
			byte [] arr= {89,65,79,75,77};
			ByteArrayInputStream b1=new ByteArrayInputStream(arr); 
			int i;
			while((i=b1.read())!=-1) {
				System.out.print((char)i);
			}
			b1.close();
		} catch (Exception e) {
					// TODO: handle exception
		}

	}

}
