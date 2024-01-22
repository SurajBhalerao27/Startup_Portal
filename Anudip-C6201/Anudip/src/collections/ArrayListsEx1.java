package collections;

import java.util.ArrayList;

public class ArrayListsEx1 {
	public static void main(String[] args) {
		/*
		 * Properties of ArrayList:-
		 * 1) Insertion order is maintained.
		 * 2) Members are not sorted.
		 * 3) Null value is allowed.
		 * 4) Duplicates are allowed.
		 */
		ArrayList<String> names = new ArrayList<String>();
		names.add("Kartik");
		names.add("Chaitali");
		names.add("Akash");
		names.add("Mayur");
		names.add("Mohini");
		names.add(null);
		names.add("Akash");
		
		System.out.println("Directly: "+names);
	}
}
