package com.jenicks.core.FilesinJava;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class BytearrayOutputstream {

	public static void main(String[] args) {
		try {
			FileOutputStream f1=new FileOutputStream("C:\\Users\\Jenicks\\Documents\\JavaPractice\\practiceSession\\new.txt");
			FileOutputStream f2=new FileOutputStream("C:\\Users\\Jenicks\\Documents\\JavaPractice\\practiceSession\\print.txt");
			ByteArrayOutputStream b1=new ByteArrayOutputStream(); 
			b1.write(65);
			b1.writeTo(f1);
			b1.writeTo(f2);
			
			b1.close();
			f2.close();
			f1.close();
		} catch (Exception e) {
					// TODO: handle exception
		}

	}

}
