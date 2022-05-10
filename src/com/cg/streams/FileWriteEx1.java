package com.cg.streams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteEx1 {
public static void main(String[] args) {
	try {
		FileOutputStream fo= new FileOutputStream("D:/Capgemini/Hybris/hello.txt",true);
		fo.write('A');
		fo.write('B');
		fo.write('C');
		fo.write('D');
		System.out.println("done .....");
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
