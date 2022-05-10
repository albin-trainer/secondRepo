package com.cg.collections;

import java.util.Comparator;

public class SortByProductName implements Comparator<Product> {

	public int compare(Product p1, Product p2) {
		int r=p1.getProdName().compareTo(p2.getProdName());
		return r;
	}
	

}
