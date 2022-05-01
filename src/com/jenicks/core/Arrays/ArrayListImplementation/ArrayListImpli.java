package com.jenicks.core.Arrays.ArrayListImplementation;

import java.util.Arrays;

public class ArrayListImpli {
	Object[]arr=new Object[3];
	private int p=0;
	public void add(Object ele) {
		if(p>=arr.length) 
		increase();  //elsepart
		arr[p++]=ele;
		
	}
	public void increase() {
		int newsize=arr.length+(arr.length/2);
		Object[]newArr=new Object[newsize];
		for(int i=0;i<arr.length;i++) {
			newArr[i]=arr[i];
		}
		arr=newArr;
	}
	public Object get(int index) {
		if(index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		return arr[index];
	}
	
	public int size() {
		return p;
	}
	@Override
	public String toString() {
		if(size()==0) {
			return "[]";
		}else {
			String s1="["+get(0);
			for(int i=1;i<size();i++) {
					s1=s1+" ,"+get(i);
				}
				s1=s1+ "]";
		return s1;
		}
	}
	
	public void delete(Object e) {
		int p=0;
		Object[]newArr=new Object[arr.length-1];
		for (int i =0;i<arr.length-1;i++) {
			if(arr[i]==e) {
				p+=i;
				break;
			}
		}
		for(int i=0;i<p;i++) {
			newArr[i]=arr[i];
		}
		int len=newArr.length;
		for(int i=p+1;i<arr.length-1;i++) {
			
			newArr[len]=arr[i];
			len++;
		}
		arr=newArr;
	}
}
