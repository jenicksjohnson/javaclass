package com.jenicks.core.MOduleFour;

import java.util.ArrayList;
import java.util.HashSet;

public class ConvertHashsetToArraylist {
	public static void main(String[] args) {
		HashSet<String> h1=new HashSet<String>();
		h1.add("java");
		h1.add("python");
		h1.add("php");
		System.out.println(h1);
		ArrayList<String> a1=new ArrayList<String>(h1);
		System.out.println(a1);
		
	}
}
