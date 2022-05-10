package com.cg.wrapper;
public class AutoboxingEx2 {
public static void main(String[] args) {
	//what are the type of data can be pass
	//in f1 method
	f1(99); //Autoboxing
	f1(true);
	f1("Have a Nice Day !!!!");
	
}
//Since Object is the root class for all java classes
//nos the f1 can accept any type of object 
static void f1(Object obj) {
	System.out.println(obj);
	System.out.println(obj.getClass().getName());
	System.out.println("------------------");
}
}
