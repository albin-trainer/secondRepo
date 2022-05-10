package com.cg.threads;

public class Task2 implements Runnable {
private int arr[];
int i=0;
	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}
 
	public void run() {
		Thread t=Thread.currentThread();
		for(;i<arr.length;i++) {
			System.out.println(t.getName()+" "+i+" "+arr[i]);
		}
	}
}
