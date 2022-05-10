package com.cg.streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationEx {
public static void main(String[] args) {
	ObjectInputStream objInp=null;
	FileInputStream fi=null;
	try {
		fi=new FileInputStream("D:\\Capgemini\\Hybris\\emp.ser");
		objInp=new ObjectInputStream(fi);
		Employee e=(Employee) objInp.readObject();
			System.out.println("Object restored back.....");
			System.out.println(e.getName()+"\t"+e.getAddress());
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
