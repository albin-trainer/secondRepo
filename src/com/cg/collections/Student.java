package com.cg.collections;
public class Student implements Comparable<Student>{
private int rollNo;
private String studName;
private String courseName;

public Student(int rollNo, String studName, String courseName) {
	super();
	this.rollNo = rollNo;
	this.studName = studName;
	this.courseName = courseName;
}
public int compareTo(Student s) {
	if(this.rollNo< s.rollNo)
		return -1;
	else if(this.rollNo>s.rollNo)
		return 1;
	else //if rollnos are equal
	return 0;
}

@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", studName=" + studName + ", courseName=" + courseName + "]";
}
public int getRollNo() {
	return rollNo;
}
public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}
public String getStudName() {
	return studName;
}
public void setStudName(String studName) {
	this.studName = studName;
}
public String getCourseName() {
	return courseName;
}
public void setCourseName(String courseName) {
	this.courseName = courseName;
}


}
