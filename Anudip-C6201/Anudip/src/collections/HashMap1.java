package collections;

import java.util.HashMap;
/*
 * Properties:-
 * 1) Insertion order is not maintained.
 * 2) Members are not sorted.
 * 3) Keys cannot be duplicate, but values can be duplicates.
 * 4) Only one null key is allowed, multiple null values are allowed.
 */
public class HashMap1 {

	public static void main(String[] args) {
		
		HashMap<String,Long> contacts=new HashMap<String, Long>();
		contacts.put("John", 4449400388l);
		contacts.put("Seeema", 9774648949l);
		contacts.put("Sumona", 7489400388l);
		contacts.put(null, null);
		contacts.put("Neha", 6909400450l);
		contacts.put("Sumona", 4449400388l);
		
		System.out.println(contacts);
		System.out.println("\nContact number of Sumona: "+contacts.get("Sumona"));
		
		HashMap<Integer, Person> personDetails=new HashMap<Integer, Person>();
		personDetails.put(1, new Person(102,"Aishwarya", true, 24,"Indian"));
		personDetails.put(2, new Person(176,"Parth", true, 21,"Indian"));
		
		System.out.println(personDetails);
		
		System.out.println(personDetails.get(2)); //pass key in .get() method
	}

}
