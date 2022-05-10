package com.cg.streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadingEx {
public static void main(String[] args) {
	try {
		FileInputStream fi= new FileInputStream("D:\\Capgemini\\Hybris\\data.txt");
		
		//int ch=fi.read();//reads 1 byte of data, returns -1 if it reaches End of File
		int ch=0;
		while((ch=fi.read())!=-1) {
			System.out.print((char)ch);
		}
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}
