package com.java.collections.treeset.org;

import java.util.Comparator;

public class ProductPriceComparator implements Comparator<Product>{
 
	@Override
	public int compare(Product o1, Product o2) {
		Float pp1= o1.price;
		Float pp2= o2.price;
		return pp1.compareTo(pp2);
	}
}
