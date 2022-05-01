package com.jenicks.core.Arrays.Queue;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class QueueMethods {

	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add(25);
		l1.add(55);
		l1.add(16);
		l1.add(48);
		l1.add(75);
		l1.add(15);
//		System.out.println(l1);
//		System.out.println(l1.peek());
//		System.out.println(l1.poll());
//		System.out.println(l1);
//		System.out.println(l1.offer(560));
		System.out.println(l1);
//		System.out.println(l1.element());
		
		PriorityQueue p1=new PriorityQueue();
		p1.add(25);
		p1.add(55);
		p1.add(16);
		p1.add(48);
		p1.add(75);
		p1.add(15);
		System.out.println(p1);
		
		
	}

}
