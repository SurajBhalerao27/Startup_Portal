package collections;

import java.util.LinkedHashMap;
/*
 * LinkedHashMap is similar to HashMap, only difference is that insertion order is 
 * maintained in LinkedHashMap.
 * 
 * Properties:-
 * 1) Insertion order is maintained.
 * 2) Members are not sorted.
 * 3) Keys cannot be duplicate, but values can be duplicates.
 * 4) Only one null key is allowed, multiple null values are allowed.
 */
public class LinkedHashMap1 {

	public static void main(String[] args) {
		
		LinkedHashMap<String, String> hm=new LinkedHashMap<String, String>();
		hm.put("Maharashtra", "Mumbai");
		hm.put("Kerala", "Trivandrum");
		hm.put("Gujrat", "Gandhinagar");
		hm.put("Bihar", "Patna");
		hm.put("Tamil Nadu", "Chennai");
		hm.put("Asam", "Ranchi");
		hm.put(null, null);
		
		System.out.println(hm);
		
		System.out.println("\nCapital of Kerala: "+hm.get("Kerala"));
		
		LinkedHashMap<Integer, Person> personDetails=new LinkedHashMap<Integer, Person>();
		personDetails.put(1, new Person(102,"Aishwarya", true, 24,"Indian"));
		personDetails.put(2, new Person(176,"Parth", true, 21,"Indian"));
		
		System.out.println(personDetails);
		
		System.out.println(personDetails.get(1));
	}

}
