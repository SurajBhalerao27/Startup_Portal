package com.java.collections.treeset.org;

import java.util.Comparator;

public class ProductNameComparator implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		String pn1=o1.name;
		String pn2=o2.name;
		return pn1.compareTo(pn2);
	}
	
}
