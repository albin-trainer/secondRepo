package com.cg.streams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx1 {
public static void main(String[] args) {
	Employee e1=new Employee();
	e1.setId(101);
	e1.setName("TejShree");
	e1.setAddress("Mumbai");
	
	ObjectOutputStream objectOutput=null;
	FileOutputStream fo=null;
	try {
		fo= new FileOutputStream("D:\\Capgemini\\Hybris\\emp.ser");
		objectOutput=new ObjectOutputStream(fo);
		objectOutput.writeObject(e1);
		System.out.println("Success ......");
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}
