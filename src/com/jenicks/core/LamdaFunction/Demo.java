package com.jenicks.core.LamdaFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Demo {

	public static void main(String[] args) {
		Integer [] arr=new Integer[] {25,15,45,645,456,22};
			//converting an array elemnt to list array
		List<Integer>l1=new ArrayList<Integer>();
		l1=Arrays.asList(arr);
		System.out.println(l1);
//		for (int i=0;i<l1.size();i++) {
//			System.out.println(l1.get(i));
//		}
//		for(int i:l1) {
//			System.out.println(i);
//		}
		
		//lambda expression
		
//		l1.forEach(i->System.out.println(i));
		Consumer<Integer>c=(i->System.out.println(i));
//		Consumer<Integer>c=new coimp();
		l1.forEach(c);   //based on consumer interface
		
	}

}
//possibility 1
class coimp implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		System.out.println(t);
		
	} 
	
}



















