package collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo11 {

	public static void main(String[] args) {
		/*
		 * Collections is a predefined class used to rearrange and manipulate the members
		 * of our list.
		 * By default list implemented classes such as ArrayList, LinkedList etc does not 
		 * sort our members, hence in order to achieve sorting we use this Collections class.
		 * 
		 * Collections is a singleton class meaning we will not be able to create its object
		 * All methods in the Collections class is static.
		 */
		ArrayList<String> names = new ArrayList<String>();
		names.add("Kartik");
		names.add("Chaitali");
		names.add("Akash");
		names.add("Mayur");
		names.add("Mohini");
		names.add("Kartik");
		
		System.out.println("Before sorting:\n" + names);
		
		// Collections.sort(names); will sort the members in natural order
		// Collections.shuffle(names); will randomly shuffle the members
		// Collections.reverse(names); will give the mirror image of the list
		
		Collections.sort(names, Collections.reverseOrder()); // will sort in reverse of natural order
		
		System.out.println("\nAfter sorting:\n" + names);
	}

}
