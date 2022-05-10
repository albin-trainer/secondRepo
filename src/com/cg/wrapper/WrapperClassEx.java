package com.cg.wrapper;

public class WrapperClassEx {
public static void main(String[] args) {
	int a=19; //data type it has ony data
	
	Integer b= new Integer(a);
	System.out.println(a);
	System.out.println(b);
	
	//Convert int into a Binary
	System.out.println(Integer.toBinaryString(19));
	//Convert int into a Hexa
	System.out.println(Integer.toHexString(896));
	
	String str="999";
	//Convert String into int
	int val=Integer.parseInt(str);
	
	System.out.println(val);
	
}
}
