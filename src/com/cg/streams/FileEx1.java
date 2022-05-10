package com.cg.streams;

import java.io.File;
import java.util.Date;

public class FileEx1 {
public static void main(String[] args) {
	File file= new File("D:\\Capgemini\\Hybris\\fruits.txt");
	System.out.println("Is it a Folder ? "+file.isDirectory());
	System.out.println("Is it a File ? "+file.isFile());
	System.out.println("Is it a hidden file ? "+file.isHidden());
	long lastModified=file.lastModified(); //returns the modified date in millisecs format
	Date d=new Date(lastModified); //converting millisecs into Date format
	System.out.println("Last Modified date is "+d);
	
	long fileSize=file.length();
	System.out.println("file size (in bytes) "+fileSize);
}
}
