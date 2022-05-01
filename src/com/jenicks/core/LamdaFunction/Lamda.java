package com.jenicks.core.LamdaFunction;

public class Lamda {


	public static void main(String[] args) {
//		a y1;
//		y1=new a(){
//			@Override
//			public void show() {
//				System.out.println("haii");
//			}
//		}
//////////////////////////////////////////////////
		//lamnda method 
		A obj;
		obj=(i)->System.out.println("hai"+i);
		obj.show(25);

	}

}
@FunctionalInterface
interface A{
	void show(int i);  //functional interface
}

class xYz implements A{

	@Override
	public void show(int i) {
		System.out.println("xYz class");
		
	}
	
}