package com.jenicks.core.MOduleFour;

import java.util.HashMap;
import java.util.TreeMap;

public class SortHashMapbyKeys {

	public static void main(String[] args) {
		HashMap<String, Integer> h1=new HashMap<String, Integer>();
		h1.put("java", 178);
		h1.put("python", 7581);
		h1.put("php", 58);
		h1.put("javascript", 456);
		h1.put("html", 123);
		System.out.println(h1);
		TreeMap<String, Integer> tp1=new TreeMap<String, Integer>(h1);
		System.out.println(tp1);
	}

}
