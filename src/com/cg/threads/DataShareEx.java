package com.cg.threads;

public class DataShareEx {
	public static void main(String[] args) throws InterruptedException {
		MyTask1 task=new MyTask1();
		Thread t1=new Thread(task);
		
		Thread t2=new Thread(task);
		t1.start(); //Runnable
		t2.start();//Runnable
		
		//here main thread shud wait for another thread
		//to complete the job
		t1.join();
		t2.join();
		
		//here main thread gets the computation result of child 
		System.out.println(task.getData());
	}
}
