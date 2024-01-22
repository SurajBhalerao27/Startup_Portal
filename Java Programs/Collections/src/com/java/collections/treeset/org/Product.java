package com.java.collections.treeset.org;

public class Product implements Comparable<Product>{
	
	int id;
	String name;
	float price;

	public Product() {
		//default constructor
	}

	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	/*
	 * @Override public int compareTo(Product o) { Product p1=this; Product p2=o;
	 * if(p1.id>p2.id) { return 1; } else if(p2.id>p1.id){ return -1; } return 0; }
	 */
	@Override public int compareTo(Product o) {
		Integer i1=this.id;
		Integer i2=o.id;
		//return	 i1>i2?1:i2>i1?-1:0;
		return i1.compareTo(i2);//*-1 multiply by this to sort it in descending order;
	}
}