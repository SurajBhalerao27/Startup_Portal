package com.java.collections.treeset.org;

import java.util.Comparator;

public class ProductIdComparator implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		Integer pid1=o1.id;
		Integer pid2=o2.id;
		return pid1.compareTo(pid2);
	}

}
