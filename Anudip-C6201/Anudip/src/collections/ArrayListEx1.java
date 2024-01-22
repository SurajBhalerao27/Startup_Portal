package collections;

import java.util.ArrayList;

public class ArrayListEx1 {
	public static void main(String[] args) {

		/*
		 * Propeties of ArrayList : 
		 * 		1) Insertion order is maintained 
		 * 		2) Members are not sorted
		 * 		3) Null value us allowed
		 * 		4) Duplicates are allowed.
		 * 
		 */
		ArrayList<String> names = new ArrayList<>();

		names.add("Suraj");
		names.add("Poms");
		names.add("Aditya");
		names.add("Mayur");
		names.add(null);
		names.add("Suraj");

		System.out.println("****Direct Way****");
		System.out.println(names);

		System.out.println("\n**** By Iterating****");
		for (String n : names) {
			System.out.println(n);
		}
	}
}
