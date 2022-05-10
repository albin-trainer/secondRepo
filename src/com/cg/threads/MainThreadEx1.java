package com.cg.threads;

public class MainThreadEx1 {
public static void main(String[] args) {
	System.out.println("Hello World .....");
	//System.out.println(5/0);
	
	//returns the current running thread reference .....
	//to get the current running thread
	Thread t=Thread.currentThread();
	System.out.println("Current running thread is "+t.getName());
	t.setName("CG");
	System.out.println("Current running thread is "+t.getName());
	System.out.println("Default  priority : "+t.getPriority()); //5
	//1- min priority, 5 - normal priority ,10 -max priority
	t.setPriority(9);//Illegal argument exception occur if priority set other than 1 to 10 
	System.out.println("updated priority is "+t.getPriority());
	System.out.println(t);
	System.out.println(t.toString());
	for(int i=1;i<=20;i++) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(i);
	}
}
}
