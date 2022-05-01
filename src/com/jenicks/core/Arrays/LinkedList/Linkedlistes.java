package com.jenicks.core.Arrays.LinkedList;

public class Linkedlistes {
		private Node start;
		private Node last;
		private int count;
		
		
		public void add(Object ele) {
			if (start==null) {
				start=new Node(ele); 
				last=start;
			}else {
				last.next=new Node(ele);
				last=last.next;
			}
		}
		
		public int size() {
			return count;
		}
		
		public Object get(int index) {
			if(index>size()) {
				throw new IndexOutOfBoundsException();
			}
			else {
				Node p=start;
				for(int i=1;i<=index;i++) {
					p=p.next;
				}
				return p.element;
			}
		}
		
		public String toString() {
			if(size()==0) {
				return "[]";
			}else {
				String s="["+start.element;
				Node p=start;
				while(p.next!=null) {
					p=p.next;
					s=s+","+p.element;
				}
				s=s+"]";
			return s;	
			}
		}
		
		class Node{
			Object element;
			Node next;
			Node(Object ele){
				element=ele;
				count++;
			}
			
		}
	
	
}
