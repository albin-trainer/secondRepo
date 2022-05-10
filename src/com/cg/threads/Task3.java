package com.cg.threads;

public class Task3  implements Runnable{
	int count =0;
	public synchronized void run() {
		
		for(int i=1;i<=10000;i++) {
			count++;
		}
	}
	
	int getCount() {
		return count;
	}
}
