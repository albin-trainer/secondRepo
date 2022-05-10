package com.cg.collections;

import java.util.TreeSet;

public class TreeSetEx {
public static void main(String[] args) {
	/*
	 * Create 5 or more instances of Student
	 * add in a TreeSet 
	 * display it
	 * observe the results
	 * */
	//Natural order ....
	//TreeSet<Student> set= new TreeSet<Student>(  );
	TreeSet<Student> set= new TreeSet<Student>(new CompareByName() );
	Student s1= new Student(101, "Y", "Java");
	Student s2= new Student(119, "Z", "Spring");
	Student s3= new Student(105, "X", "HTML");
	Student s4= new Student(500, "A", "SQL");
	Student s5= new Student(99, "B", "Java");
	Student s6= new Student(101, "A", "Java");
	set.add(s1);
	set.add(s2);
	set.add(s3);
	set.add(s4);
	set.add(s5);
	set.add(s6);
	for(Student s:set) {
		System.out.println(s); //in order traversal
	}
}
}
