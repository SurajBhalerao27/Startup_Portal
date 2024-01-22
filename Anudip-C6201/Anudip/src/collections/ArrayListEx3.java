package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx3 {
	public static void main(String[] args) {

		ArrayList<Person> personList = new ArrayList<Person>();
		Person p1 = new Person(101, "Atul", false, 6, "Indian");
		personList.add(p1); // by this type we are adding reff to the method.

		personList.add(new Person(102, "Charles", true, 40, "Britisher")); // and in this we are directly gives value																	// here.
		personList.add(new Person(2, "Sultan", true, 25, "Saudi Arabian"));
		personList.add(new Person(58, "William", false, 10, "American"));
		personList.add(new Person(4, "Yang Li", true, 31, "Chinese"));
		System.out.println(personList);

		System.out.println("\nSorting on age");
		Collections.sort(personList);
		System.out.println(personList);
	}
}
