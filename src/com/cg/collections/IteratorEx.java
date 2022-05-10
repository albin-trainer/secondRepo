package com.cg.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorEx {
public static void main(String[] args) {
	ArrayList<Integer> list1= new ArrayList<Integer>();
	list1.add(99);
	list1.add(45);
	list1.add(65);
	list1.add(31);
	list1.add(37);
	
	System.out.println("------for each loop----------");
	//internally use iterator .......
	for(int a:list1) {
		System.out.println(a);
	}
	
	System.out.println("-------------------------");
	//using iterator directly .......
 Iterator<Integer>it=	 list1.iterator();
 while(it.hasNext()) {
	 int val=it.next();
	 System.out.println(val);
 }
 System.out.println("****iterating in reverse*********");
 ListIterator<Integer> it2=list1.listIterator(list1.size());
	while(it2.hasPrevious()) {
		 int val=it2.previous();
		 System.out.println(val);
	}
	
	System.out.println("****iterating in reverse*********");
	for(int i=list1.size()-1;i>=0;i--) {
		int val=list1.get(i);
		System.out.println(val);
	}
}
}
