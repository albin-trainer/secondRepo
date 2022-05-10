package com.cg.threads;


public class Banking implements Runnable{
	float balanceAmt=5000;
	
	
	public void run() {
		synchronized (this) {
			debit(4000);
		}
	}

	 void debit(int debitAmt) {
		Thread t=Thread.currentThread();
		if(balanceAmt>=debitAmt) {
		
			System.out.println(t.getName() +" ready to debit");
			try {
				System.out.println(t.getName()+" goes to zzzzz");
				//Thread.sleep(4000);
				wait(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			balanceAmt=balanceAmt-debitAmt;
			
			System.out.println(t.getName()+" Successfully debited");
		}
		else {
			System.out.println(t.getName()+" insufficient funds .....");
		}
	}

	public float getBalanceAmt() {
		return balanceAmt;
	}
}
