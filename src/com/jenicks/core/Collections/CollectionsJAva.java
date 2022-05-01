package com.jenicks.core.Collections;

import java.util.ArrayList;

public class CollectionsJAva {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		ArrayList a2=new ArrayList();
		//array methods
		
		//public boolean add(object ele)
		a1.add("c#");
		a1.add("java");
		a1.add("php");
		a1.add("pyhton");
		
		//s.o.p(a1.size())
//		System.out.println(a1.size());
//		a1.clear();
		System.out.println(a1);
		System.out.println(a1.hashCode());
//		System.out.println(a1.isEmpty());
		a2.add(456);
		a2.add(457);
		a2.add(789);
		a2.add(74589);
		
		System.out.println(a2);
		a1.remove("java");
		a1.addAll(a2);
		System.out.println(a1);
		System.out.println(a1.containsAll(a2));
	}

}
