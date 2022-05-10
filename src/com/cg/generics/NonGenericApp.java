package com.cg.generics;
public class NonGenericApp {
public static void main(String[] args) {
	//Here since val is the type of Object, v can store any type of data ......
	Data data1= new Data();
	data1.setVal(99); //Autoboxing (Automatically convert into a Integer Object) upcasting 
	
	Data data2= new Data();
	data2.setVal("Albin");
	 //Typecasting is required while reading
	int x=(Integer)data1.getVal();
	//Typecasting is required while reading
	String name=(String)data2.getVal();
	
	System.out.println(x);
	System.out.println(name);
}
}
class Data{
	private Object val;
	public Object getVal() {
		return val;
	}
	//accept any type .....
	public void setVal(Object val) {
		this.val = val;
	}
	
}