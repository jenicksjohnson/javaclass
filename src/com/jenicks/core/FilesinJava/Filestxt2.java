package com.jenicks.core.FilesinJava;

import java.io.File;

public class Filestxt2 {

	public static void main(String[] args) {
		try {
			File f1=new File("C:\\Users\\Jenicks\\Documents\\JavaPractice\\practiceSession");
			File [] arr=f1.listFiles();
			for(File d:arr) {
				System.out.println(d.getName()+". can write-"+d.canWrite()+".can execute-"+d.canExecute()+".Is hidden-"+d.isHidden()+".Filesize-"+d.length());
			}
		}catch(Exception e){
			System.out.println(e);
		}

	}

	
}


