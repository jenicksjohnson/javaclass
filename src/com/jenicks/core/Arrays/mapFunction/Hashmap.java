package com.jenicks.core.Arrays.mapFunction;

import java.util.*;

public class Hashmap {

	public static void main(String[] args) {
		HashMap<String,Integer> m1=new HashMap<String,Integer>();
		m1.put("java", 25);
		m1.put("python", 15);
		m1.put("php", 105);
		m1.put("sql", 95);
		System.out.println(m1);
		System.out.println(m1.get("java"));
		System.out.println(m1.keySet());
		System.out.println(m1.size());
		
		
		LinkedHashMap<String, Integer> m2=new LinkedHashMap<String,Integer>();
		m2.put("java", 25);
		m2.put("python", 15);
		m2.put("php", 105);
		m2.put("sql", 95);
		System.out.println(m2);
		System.out.println(m2.get("java"));
		//iterator implementation
	 	Iterator<String> itr=m2.keySet().iterator();
	 	while (itr.hasNext()) {
	 		String key=itr.next();
	 		int val=m2.get(key);
	 		System.out.println(key+ " = "+val);
	 	}
		
		TreeMap<String,Integer> m3=new TreeMap<String,Integer>();
		m3.put("java", 25);
		m3.put("python", 15);
		m3.put("php", 105);
		m3.put("sql", 95);
		System.out.println(m3);
		System.out.println(m3.get("java"));
		
		Hashtable<String,Integer> m4=new Hashtable<String,Integer>();
		m4.put("java", 25);
		m4.put("python", 15);
		m4.put("php", 105);
		m4.put("sql", 95);
		System.out.println(m4);
		System.out.println(m4.get("java"));
	}

}
