package com.cg.threads;

public class MultipleThreadsArrayIterationEx {
public static void main(String[] args) {
	int arr[]= {4,54,87,5,4,8,7,9,9,7,56,6,8,78,2,9,4,
			8,7,99,5,89,44,66,33,54,78,17};
	
	Task2 task= new Task2();
	task.setArr(arr);
	
	//create two threads and start it 
	Thread t1=new Thread(task);
	Thread t2=new Thread(task);
	t1.setName("Thread A"); t2.setName("Thread B");
	t1.start();
	t2.start();
}
}
