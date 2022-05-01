package com.jenicks.core.Arrays.Comperator;

import java.util.Comparator;

public class yop implements Comparator {

	@Override
	public int compare(Object x, Object y) {
		
		return ((Student)x).yop-((Student)y).yop;
	}

}
