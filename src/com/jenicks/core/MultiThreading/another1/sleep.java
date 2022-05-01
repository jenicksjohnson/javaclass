package com.jenicks.core.MultiThreading.another1;

public class sleep implements Runnable{

	@Override
	public void run() {
		for (int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName());
			System.out.println(i);
		}
		try {
			Thread.sleep(450);
		}
		catch(Exception e){
			System.out.println(e);
		}
		
	}

}
