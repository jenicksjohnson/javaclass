package com.jenicks.core.Arrays.SetInterfate;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetInterfc {

	public static void main(String[] args) {
		// set
		// hash set
		// linked set
		// Tree set
		HashSet h1= new HashSet();
		h1.add("Java");
		h1.add("Python");
		h1.add("Php");
		h1.add("c");
		h1.add("Java");
		h1.add("Javasc");
		h1.add("c");
		System.out.println(h1);
		
		LinkedHashSet h2= new LinkedHashSet();
		h2.add("Java");
		h2.add("Python");
		h2.add("Php");
		h2.add("c");
		h2.add("Java");
		h2.add("Javasc");
		h2.add("c");
		System.out.println(h2);
		
		TreeSet h3= new TreeSet();
		h3.add("Java");
		h3.add("Python");
		h3.add("Php");
		h3.add("Javasc");
		h3.add("Java");
		h3.add("Javasc");
		h3.add("c");
		System.out.println(h3);

	}

}
