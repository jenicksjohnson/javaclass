package com.jenicks.core.synchronisation;

 class Table {
//	 synchronized void printTable(int j){ -another method
//	 static synchronized void printTable(int j){ -another method
	 public void printTable(int j){
		 synchronized(this) {
			 for (int i=1;i<=5;i++) {
				System.out.println(j*i);
			}
			try {
				Thread.sleep(500);
		
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
