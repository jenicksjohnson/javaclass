package com.jenicks.core.Arrays.Comperator;

import java.util.Comparator;

public class IdComperator implements Comparator {

	@Override
	public int compare(Object x, Object y) {
		
		return ((Student)x).id-((Student)y).id;
	}

}
