package com.jenicks.core.Collections;

import java.util.ArrayList;

public class ArraysaList {

	public static void main(String[] args) {
		ArrayList  a1=new ArrayList();
		a1.add(25);
		a1.add(456);
		a1.add("java");
		a1.add("php");
		a1.add(1, "are");
		a1.set(3, 1456);
		System.out.println(a1.subList(2, 4));
		System.out.println(a1);
	}

}
