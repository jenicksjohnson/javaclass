package com.jenicks.core.FilesinJava;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferINOUT {

	public static void main(String[] args) {
		Input n1=new Input();
//		n1.input();
		new Output().Output();
	}

}

class Input{
	public void input() {
		try {
			FileOutputStream f1=new FileOutputStream("C:\\Users\\Jenicks\\Documents\\JavaPractice\\practiceSession\\print.txt");
			BufferedOutputStream f2=new BufferedOutputStream(f1);
			String s1="Java is a language";
			byte[] arr=s1.getBytes();
			f2.write(arr);
			f2.flush();
			f2.close();
			f1.close();
			System.out.println("success");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Output{
	public void Output() {
		try {
			FileInputStream f1=new FileInputStream("C:\\Users\\Jenicks\\Documents\\JavaPractice\\practiceSession\\print.txt");
			BufferedInputStream f2=new BufferedInputStream(f1);
			int i=0;
			while((i=f2.read())!=-1) {
				System.out.print((char) i);
			}
			
			f2.close();
			f1.close();
//			System.out.println("success");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
