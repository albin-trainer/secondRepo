package com.cg.collections;

import java.util.Vector;

public class VectorEx2 {
public static void main(String[] args) {
	Vector<Product> v1=new Vector<Product>();
	//Assume these data pulled  from DB
	Product p1=new Product(1111, "Teddy Bear Toy", 500, 4.6f);
	Product p2=new Product(1112, "Samsung phone", 35500, 4.4f);
	Product p3=new Product(1113, "Alexa", 4500, 4.1f);
	Product p4=new Product(1114, "Smart Watch", 7500, 4.7f);
	Product p5=new Product(1115, "Shoes", 10000, 4.2f);
	//Create another 4  Product objects
	v1.add(p1);	v1.add(p2);	v1.add(p3);	v1.add(p4);	v1.add(p5);
	for(Product p:v1) {
		System.out.println(p.getProdCode()+"\t"+p.getProdName()+"\t"+p.getPrice()+"\t"+p.getRatings());
	}
}
}



