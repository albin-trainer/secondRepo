package com.cg.threads;

public class SynchronizationEx {
public static void main(String[] args) throws InterruptedException {
	Banking bank= new Banking();
	Thread t1= new Thread(bank);
	Thread t2= new Thread(bank);
	t1.setName("ATM");
	t2.setName("G Pay");
	
	t1.start();
	//t1.start(); //IllegalThreadStateException
	t2.start();
	
	t1.join();
	t2.join();
	System.out.println("Bal Amt: "+bank.getBalanceAmt());
}
}
