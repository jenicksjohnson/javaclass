package com.jenicks.core.synchronisation.Deadlocks;

public class Thread8 {
	String s1="java";
	String s2="python";
	Thread t1=new Thread() {
		@Override
		public void run() {
			synchronized(s1) {
				try {
					System.out.println(Thread.currentThread().getName()+" locked "+s1);
					Thread.sleep(100);
					
				}catch(InterruptedException e){
					e.printStackTrace();
				}
				synchronized (s2) {
					System.out.println(Thread.currentThread().getName()+" locked "+s2);
					System.out.println(s1+" "+s2);
				}
			}
		}
	};
	
	Thread t2=new Thread() {
		@Override
		public void run() {
			synchronized(s2) {
				System.out.println(Thread.currentThread().getName()+" locked "+s2);
				synchronized(s1) {
					System.out.println(Thread.currentThread().getName()+" locked "+s1);
					System.out.println(s1+" "+s2);
				}
			}
		}
	};
	
	
	public static void main(String[] args) {
		Thread8 th1=new Thread8();
		th1.t1.start();
		th1.t2.start();
	}
	
	
}
