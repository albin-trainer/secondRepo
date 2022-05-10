package com.cg.collections;

import java.util.HashSet;
import java.util.TreeSet;

public class SetEx1 {
public static void main(String[] args) {
	/*
	 * HashSet - duplicates not permitted
	 *         - no guaranty for order of the elements
	 * */
	HashSet<String> set1= new HashSet<String>();
	set1.add("Virat");
	set1.add("Smiley");
	boolean b1=set1.add("Tom And Jerry"); //returns true if the element successfully added in the set
	set1.add("Doraemon");
	boolean b2=set1.add("Tom And Jerry");//ignored
	set1.add("Dhoni");
	set1.add("Anant");
	System.out.println(set1); //order not predictable
	System.out.println(b1+"  "+b2);
	
	//TreeSet --> no duplicates, elements are sorted in default
	//Create TreeSet object and store few data & observe the results .......
	TreeSet<String> set2= new TreeSet<String>(); //here String classs already implemented Comparable interface
	set2.add("Virat");
	set2.add("Smiley");
	 b1=set2.add("Tom And Jerry"); //returns true if the element successfully added in the set
	set2.add("Doraemon");
	 b2=set2.add("Tom And Jerry");
	set2.add("Dhoni");
	set2.add("Anant");
	set2.add("anant");
	System.out.println(set2);
	System.out.println(b1+"  "+b2);
	
	//LinkedHashSet  --> No duplicates, elements arranged the insertion order (the way we inserted into the set)
	//Try this .....
	
	for(String s:set2) {
		System.out.println(s);
	}

}
}
