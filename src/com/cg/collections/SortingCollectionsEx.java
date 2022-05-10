package com.cg.collections;

import java.util.ArrayList;
import java.util.Collections;

public class SortingCollectionsEx {
public static void main(String[] args) {
	Product p1=new Product(1111, "Teddy Bear Toy", 500, 4.6f);
	Product p2=new Product(1112, "Samsung phone", 35500, 4.4f);
	Product p3=new Product(1113, "Alexa", 4500, 4.1f);
	Product p4=new Product(1114, "Smart Watch", 7500, 4.7f);
	Product p5=new Product(1115, "Shoes", 10000, 4.2f);
	ArrayList<Product> prodList= new ArrayList<Product>();
	//add all products one by one in the list
	//display it
	//after displaying try to sort it --> observe the results
	
	prodList.add(p1);
	prodList.add(p2);
	prodList.add(p3);
	prodList.add(p4);
	prodList.add(p5);
	for(Product p:prodList) {
		System.out.println(p); //internally toString()
	}
	//Anant is doing this code
	Collections.sort(prodList);//sorted on price
	System.out.println("---Sorted by Price low to High -----");
	for(Product p:prodList) {
		System.out.println(p); //internally toString()
	}
	System.out.println("*****************");
	SortByRatings sortByRatings=new SortByRatings();
	
	//Bindu is doing this code
	Collections.sort(prodList, sortByRatings);
	System.out.println("---Sorted by Ratings High to Low -----");
	for(Product p:prodList) {
		System.out.println(p); //internally toString()
	}
	
	//Sort the productList based on the Product Name
	Collections.sort(prodList, new SortByProductName());
	System.out.println("----Sorted by SortByName----");
	for(Product p:prodList) {
		System.out.println(p); //internally toString()
	}
}
}
