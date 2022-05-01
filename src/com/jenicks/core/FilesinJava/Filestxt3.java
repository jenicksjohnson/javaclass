package com.jenicks.core.FilesinJava;


import java.io.FileOutputStream;


public class Filestxt3 {

	public static void main(String[] args) {
//		input/output/error
		System.err.println("this is an error");
//		Input stream Output stream
		try {
			FileOutputStream f1=new FileOutputStream("C:/Users/Jenicks/Documents/JavaPractice/practiceSession/new.txt");
			String s1="i am a developer";
			byte arr[]=s1.getBytes();  //converting s1 to byte
			f1.write(arr);  //asci value
			f1.close();
			System.out.println("finished");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
