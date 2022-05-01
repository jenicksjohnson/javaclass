package com.jenicks.core.MultiThreading.another1;

public class Demo {
	//1.Main thread(user thread/non Daemon thread)//jre
	//2.Garbage collector thread //protected Object inalize()Daemon thread
	//3.Thread scheduler
	public static void main(String[] args) throws Exception {
		//Methods of threadClass
		//public void start()
		//public void run()
		//public static sleep()
		//public static Thread currentThread()
		//public public join()
		//public long getId()
		//public void stop()
		//public void interrupt()
		//public void notify()
		//public void notifyAll()
		//public void wait()
		
		//calling sleep
		Runnable s1=new sleep();
		Thread t1=new Thread(s1);
		Thread t2=new Thread(s1);
		System.out.println(t1.getName());
		System.out.println(t1.getId());
		t1.start();
//		t1.interrupt();
//		try {
//			t1.join();
//		}catch(Exception e){
//			System.out.println(e);
//		}
		System.out.println(t2.getName());
		System.out.println(t2.getId());
		t2.start();
		
	}
}
