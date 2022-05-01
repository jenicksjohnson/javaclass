package com.jenicks.core.FilesinJava;

import java.io.FileInputStream;

public class FileInputstream {

	public static void main(String[] args) {
		try {
			FileInputStream f1=new FileInputStream("C:/Users/Jenicks/Documents/JavaPractice/practiceSession/new.txt");
			int i=0;
			while((i=f1.read())!=-1) {
				System.out.print((char)i);
			}
			f1.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
