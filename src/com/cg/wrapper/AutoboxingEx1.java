package com.cg.wrapper;

public class AutoboxingEx1 {
public static void main(String[] args) {
	//prior to jdk1.5
	int a=9;
	Integer a1=new Integer(a);
	System.out.println(a);
	
	//From JDK1.5 Autoboxing and Auto unboxing introduced
	Integer a2=100; //autoboxing
	System.out.println(a2);
	Object obj1=a2;
	System.out.println(obj1);
	
	Object obj2=999; //Autoboxing
	Object obj3="Hello Capgemini";
	System.out.println(obj2);
	System.out.println(obj3);
	
	Integer a5=99;
	//prior to jdk1.5
	int v1=a5.intValue(); //From Object to datatype
	System.out.println(v1);
	
	//From JDK1.5
	int v2=a5; //Auto unboxing
	System.out.println(v2);
	
}
}
