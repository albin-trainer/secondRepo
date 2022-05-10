package com.cg.collections;

import java.util.Vector;

public class VectorEx1 {
	public static void main(String[] args) {
		/*Vector provides Dynamic Array .....*/
		Vector<String> v1= new Vector<String>();
		System.out.println("Initial capacity : "+v1.capacity());
		
		//Vector<String> v2= new Vector<String>(4);
		Vector<String> v2= new Vector<String>(4,10);
		System.out.println("Initial capacity : "+v2.capacity());
		v2.add("Bangalore");
		v2.add("Chennai");
		System.out.println(v2);
		System.out.println("No of elements :  "+v2.size());
		
		//add 3 more elements and diplay it 
		//display the capacity .....
		v2.add("Delhi");
		v2.add("Pune");
		v2.add("Mumbai");
		System.out.println(v2);
		System.out.println(v2.size());
		System.out.println("capacity : "+v2.capacity());
		System.out.println("----------------");
		for(String s:v2) {
			System.out.println(s);
		}
		v2.add(1,"Kolkatta");
		System.out.println(v2);
		String city =v2.get(0);
		System.out.println(city);
		v2.remove("Pune");
		System.out.println(v2);
		
		boolean isPresent=v2.contains("Mysore");
		System.out.println(isPresent);
		//Create a another Vector which stores only Integers
		//store few integers and display it 
		
	}
}
