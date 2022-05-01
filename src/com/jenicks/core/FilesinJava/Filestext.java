package com.jenicks.core.FilesinJava;

import java.io.File;

public class Filestext {

	public static void main(String[] args) {
		try {
			File f1=new File("new.txt");
//			File f2;
			if(f1.exists()) {
				System.out.println("file existed");
				System.out.println(f1);  ////gives file name
			}
			else {
				System.out.println("file not created");
			}
			System.out.println(f1.getCanonicalFile());
//			f2=f1.getCanonicalFile();
//			System.out.println(f2);
		}catch(Exception e){
			System.out.println(e);
		}

	}

}
