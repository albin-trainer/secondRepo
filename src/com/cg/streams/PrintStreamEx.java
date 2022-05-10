package com.cg.streams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamEx {
public static void main(String[] args) {
	try {
		PrintStream p= new PrintStream(new FileOutputStream("D:\\Capgemini\\Hybris\\Fruits.txt"));
		p.println("Apple");
		p.println("Orange");
		System.out.println("Done ......:)");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
