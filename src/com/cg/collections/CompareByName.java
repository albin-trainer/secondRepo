package com.cg.collections;
import java.util.Comparator;
public class CompareByName  implements Comparator<Student>{
	public int compare(Student s1, Student s2) {
		int r=s1.getStudName().compareTo(s2.getStudName());
		return r;
	}
}
