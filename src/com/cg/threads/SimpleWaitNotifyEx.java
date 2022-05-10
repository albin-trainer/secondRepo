package com.cg.threads;

public class SimpleWaitNotifyEx {
public static void main(String[] args) throws InterruptedException {
	MyTask5 task= new MyTask5();
	Thread t=new Thread(task);
	t.start();
	Thread.sleep(2000);
	synchronized(task) { //acquiring the lock
			task.notify();//giving the signal
	}
	System.out.println("Main Ends ....");
}
}



class MyTask5 implements Runnable{

	public void run() {
		f1();
	}
	synchronized void f1() {
		System.out.println("I m sleeping ....");
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Hey I m BACK !!!!!");
	}
	
}