package com.jenicks.core.FilesinJava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class SequenceInOut {

	public static void main(String[] args) {
		new seqOutput().output();
		new seqInput().input();
	}

}
class seqOutput{
	public void output() {
	try {
		FileInputStream f1=new FileInputStream("C:\\Users\\Jenicks\\Documents\\JavaPractice\\practiceSession\\new.txt");
		FileInputStream f2=new FileInputStream("C:\\Users\\Jenicks\\Documents\\JavaPractice\\practiceSession\\print.txt");
		SequenceInputStream s1=new SequenceInputStream(f1,f2); 
		int i;
		while((i=s1.read())!=-1) {
			System.out.print((char)i);
		}
		s1.close();
		f2.close();
		f1.close();
	} catch (Exception e) {
				// TODO: handle exception
	}

	}
}

class seqInput{
	public void input() {
	try {
		FileInputStream f1=new FileInputStream("C:\\Users\\Jenicks\\Documents\\JavaPractice\\practiceSession\\new.txt");
		FileInputStream f2=new FileInputStream("C:\\Users\\Jenicks\\Documents\\JavaPractice\\practiceSession\\print.txt");
		FileOutputStream fout=new FileOutputStream("C:\\Users\\Jenicks\\Documents\\JavaPractice\\practiceSession\\seqout.txt"); 
		SequenceInputStream s1=new SequenceInputStream(f1,f2);
		int i;
		while((i=s1.read())!=-1) {
			fout.write(i);
		}
		s1.close();
		fout.close();
		f2.close();
		f1.close();
	} catch (Exception e) {
				// TODO: handle exception
	}

	}
}