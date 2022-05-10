package com.cg.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class PerformanceTestListEx {
public static void main(String[] args) {
	ArrayList<String> list1= new ArrayList<String>();
	
	long t1=System.currentTimeMillis(); //returns the current time in millisecs
	for(int i=1;i<=100000;i++) {
		//list1.add("hello"); //adding @end
		list1.add(0,"Hello");//Add @ start
	}
	long t2=System.currentTimeMillis();
	System.out.println("Time took for ArrayList : "+(t2-t1));
	
	LinkedList<String> list2= new LinkedList<String>();
	t1=System.currentTimeMillis(); //returns the current time in millisecs
	for(int i=1;i<=100000;i++) {
		//list2.add("hello");//adding @end
		list2.add(0,"Hello");//Add @ start
	}
	t2=System.currentTimeMillis();
	System.out.println("Time took for LinkedList : "+(t2-t1));
}
}
