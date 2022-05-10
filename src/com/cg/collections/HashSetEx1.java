package com.cg.collections;

import java.util.HashSet;

public class HashSetEx1 {

	public static void main(String[] args) {
Employee e1=new Employee(101, "A", "Bangalore");
Employee e2=new Employee(102, "B", "Mumbai");
Employee e3=new Employee(103, "C", "Pune");
Employee e4=new Employee(104, "D", "Delhi");
Employee e5=new Employee(105, "E", "Bangalore");
Employee e6=new Employee(102, "B", "Mumbai");
HashSet<Employee> set= new HashSet<Employee>();
set.add(e1);
set.add(e2);
set.add(e3);
set.add(e4);
set.add(e6); //since e2's hashCode is matches, it cross chk with equals(), if it return true wont add the element
set.add(e5);
System.out.println("no of elements : "+set.size());
System.out.println(set);

//System.out.println(e2.hashCode()); //get some numbers==> generated based on internal Memory address
//System.out.println(e6.hashCode());
System.out.println(e2.equals(e6));

int n=10;
int hash=e2.hashCode();
int r=(n - 1) & hash;
System.out.println(r);
	}

}
