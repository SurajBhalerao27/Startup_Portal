package collections;

import java.util.ArrayList;
import java.util.Collections;

public class PersonTest {

	public static void main(String[] args) {
		
		ArrayList<Person> plist = new ArrayList<Person>();
		Person p1 = new Person(101, "Atul", false, 6, "Indian");
		plist.add(p1);
		
		plist.add(new Person(102, "Charles", true, 40, "British"));
		plist.add(new Person(2, "Sultan", true, 25, "Saudi"));
		plist.add(new Person(58, "Willaim", false, 10, "American"));
		plist.add(new Person(8, "Jackie Chain", true, 31, "Chinese"));
		plist.add(new Person(8, "Haan Jee Huu", false, 54, "Korean"));
		
		System.out.println("Before Sorting"+ plist);
		
		Collections.sort(plist);
		
		System.out.println("\nAfter Sorting"+ plist);
	}

}
