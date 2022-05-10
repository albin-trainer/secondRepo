package com.cg.collections;

import java.util.ArrayList;
import java.util.Collections;
public class ArrayListEx1 {
public static void main(String[] args) {
	ArrayList<Integer> list1= new ArrayList<Integer>();
	list1.add(99);
	list1.add(45);
	list1.add(65);
	list1.add(31);
	list1.add(37);
	
	for(int a:list1) {
		System.out.println(a);
	}
	System.out.println("------------------");
	int x=list1.get(4);
	System.out.println(x);
	
	ArrayList<String> list2= new ArrayList<String>();
	list2.add("Bindu");
	list2.add("Anant");
	list2.add("Prajwal");
	list2.add("Rohan");
	list2.add("Priya");
	System.out.println("----------------");
	for(String s:list2) {
		System.out.println(s);
	}
	System.out.println("---------");
	String name=list2.get(0);
	System.out.println(name);
	
	Collections.sort(list1);
	System.out.println("---After sorted----");
	System.out.println(list1);
	Collections.sort(list2);
	System.out.println("after sorting the names");
	System.out.println(list2);
}
}
