package collections;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		/*
		 * Properties of ArrayList:-
		 * 1) Insertion order is mentioned.
		 * 2) Members are not sorted.
		 * 3) Null value is allowed.
		 * 4) Duplicates are allowed.
		 * 5) All members are allocated with indexes starting from 0 to size()-1.
		 */
		ArrayList<String> names = new ArrayList<String>();
		names.add("Kartik");
		names.add("Chaitali");
		names.add("Akash");
		names.add("Mayur");
		names.add("Mohini");
		names.add(null);
		names.add("Kartik");
		
		System.out.println("Directly: ");
		System.out.println(names);
		
		
		System.out.println("\nUsing for loop: ");
		for(int i=0; i<names.size(); i++) {
			
			System.out.println(names.get(i));
		}
		
		
		System.out.println("\nUsing foreach loop: ");
		for(String n:names) {
			
			System.out.println(n);
		}
	}

}
