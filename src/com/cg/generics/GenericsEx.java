package com.cg.generics;

/*
 * Generics -Paramerterized type
 *          -typecasting is not req
 * */
public class GenericsEx {
public static void main(String[] args) {
	MyData<Integer> data1= new MyData<Integer>();
	data1.setVal(99);
	
	MyData<String> data2=new MyData<String>();
	data2.setVal("Albin");
	
	int x=data1.getVal();//no need of casting
	String name=data2.getVal();
	System.out.println(x);
	System.out.println(name);
}
}
class MyData <E>{
	private E val;

	public E getVal() {
		return val;
	}
	public void setVal(E val) {
		this.val = val;
	}
}