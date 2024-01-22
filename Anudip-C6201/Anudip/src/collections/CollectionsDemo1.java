package collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo1 {
	public static void main(String[] args) {
		
		/*
		 * Collections is a predefined class used to rearrange and manipulate the members of our list.
		 * By default list implemented classes such as ArrayList, LinkedList etc does not sort their members,
		 * hence in order to achieve sorting We use the Collections class.
		 * 
		 * Collections is a singleton class meaning We will not be able to create its object.
		 * All methods in the Collections class is static.
		 */
		ArrayList<String> names = new ArrayList<String>();
		names.add("Kartik");
		names.add("Chaitali");
		names.add("Akash");
		names.add("Mayur");
		names.add("Mohini");
		// names.add(null); --> This line will throw null pointer exception when sorting.
		names.add("Akash");
		
		Collections.sort(names); // Will sort the members in natural order
		System.out.println("Sorted:\n"+names);
		
		Collections.shuffle(names);	// Will randomly shuffle the members
		System.out.println("\nShuffle:\n"+names);
		
		Collections.reverse(names);	// Will reverse the members stored
		System.out.println("\nReversed after shuffling:\n"+names);
		
		Collections.sort(names, Collections.reverseOrder());	// Will sort in reverse of natural order
		System.out.println("\nSorted in reverse order:\n"+names);
	}
}
