package com.java.collections.treeset.org;

import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Collections;
//import java.util.Enumeration;
//import java.util.Iterator;
//import java.util.ListIterator;

public class Test {

	// look out compateTo method of product class

	/*
	 * TreeSet allows unique values TreeSet and it do not allows duplicates values.
	 * It do not follow insertion order and do follows sorting order. Null entries or values are not allowed Multiple
	 * Null are not allowed
	 */

	public static void main(String[] args) {

		Product p1 = new Product(5, "Pen", 20);
		Product p2 = new Product(4, "Notebook", 50);
		Product p3 = new Product(3, "Testbook", 200);
		Product p4 = new Product(2, "Marker", 89);
		Product p5 = new Product(1, "Bag", 1000);

		TreeSet<Product> products = new TreeSet<Product>();

		// products.add(null);
		products.add(p1);
		//products.add(null);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
		//products.add(p5);
		//products.add(p5);


		//System.out.println("------------------------------------");
		//System.out.println(products.contains(p5)); // this method gives the status of
		//element present in the TreeSet or // not. //products.add(1,p5); // this
		//method is used to update at particular index //(indexing starts form 0)
		//products.remove(p3); // it remove the object of particular index
		//products.clear(); //it clear the data of all objects
		//products.removeAll(products); //it delete all objects
		//System.out.println(products.size());// it gives no of elements present in TreeSet

		//System.out.println("------------------------------------");

		/*
		 * System.out.println("1.Using for loop iteration"); for(int
		 * i=0;i<products.size();++i) { System.out.println(products.get(i)); }
		 * 
		 * System.out.println("------------------------------------");
		 */	
	
		/*
		 * System.out.println("2.Using for each loop iteration"); for (Product p :
		 * products) { System.out.println(p); }
		 */

        ArrayList<Product> p =new ArrayList<Product>();
        p.addAll(products);
        

        Collections.sort(p, new ProductIdComparator());
		System.out.println("-------------------------------------------------------------");
		System.out.println("1.Sorted on the basis of Id using comparable");
		System.out.println("-------------------------------------------------------------");
		
		p.forEach(s->System.out.println(s));
		
		System.out.println("-------------------------------------------------------------");
        System.out.println("2.Sorted by Name using comparator");
        System.out.println("-------------------------------------------------------------");
        
        
        Collections.sort(p, new ProductNameComparator());
        p.forEach(s->System.out.println(s));
        System.out.println("-------------------------------------------------------------");
		System.out.println("3.Sorted by Price using comparator");
		System.out.println("-------------------------------------------------------------");
		
		ArrayList<Product> xy = new ArrayList<Product>();
		xy.addAll(products);
        Collections.sort(xy, new ProductPriceComparator());
        xy.forEach(s->System.out.println(s));
        System.out.println("-------------------------------------------------------------");

		/*
		 * System.out.println("------------------------------------");
		 * System.out.println("3.Using iteration"); Iterator<Product>
		 * itr=products.iterator(); while (itr.hasNext()) { //
		 * System.out.println(itr.next()); Product t = itr.next();
		 * System.out.println(t); }
		 */
		 // System.out.println("------------------------------------");
		
		/*
		 * System.out.println("4.a.Using Next List iteration"); // having advantage to
		 * // go forward and backward 
		 *ListIterator<Product> litr =products.listIterator();
		 * while (litr.hasNext()) { // 
		 * System.out.println(itr.next()); 
		 * Product n =litr.next(); 
		 * System.out.println(n); 
		 * }
		 * System.out.println("4.b.Using Previous List iteration"); 
		 * while(litr.hasPrevious()) { // reverse traversing 
		 * //System.out.println(itr.previous()); 
		 * Product p = litr.previous();
		 * System.out.println(p); 
		 * }
		 * System.out.println("------------------------------------");
		 */
		  
		/*
		 * System.out.println("5.Collection.Enumeration");
		 * 
		 * Enumeration<Product> e =Collections.enumeration(products); while
		 * (e.hasMoreElements()) { Product p11 =e.nextElement();
		 * System.out.println(p111); }
		 * System.out.println("------------------------------------");
		 * 
		 * System.out.println("6.Lambda Expression or foreach method");
		 * products.forEach(p11 -> System.out.println(p11));
		 * System.out.println("------------------------------------");
		 * System.out.println("------------------------------------");
		 * 
		 * System.out.println("7. Using method ref");
		 * products.forEach(System.out::println);
		 * System.out.println("------------------------------------");
		 */
	}
}
