package com.cg.threads;

public class MultipleThreadsEx1 {
public static void main(String[] args) {
	System.out.println("Main thread started");
	Thread.currentThread().setPriority(1);
	FileDownloader downloader=new FileDownloader();
	Thread t=new Thread(downloader); //new state
	t.setPriority(10);
	t.start();//Runnable state
	//Cant predict 
	for(int i=1;i<=1000;i++) {
		System.out.println("Main : "+i);
	}
	System.out.println("Main thread Ends .....");
	
}
}
