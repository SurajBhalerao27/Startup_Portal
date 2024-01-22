package collections;

import java.util.*;

public class HashMap2 {
	
	public static void main(String[] args) {
		
		HashMap<String, String> hm=new HashMap<String, String>();
		hm.put("Maharashtra", "Mumbai");
		hm.put("Kerala", "Trivandrum");
		hm.put("Gujrat", "Gandhinagar");
		hm.put("Bihar", "Patna");
		hm.put("Tamil Nadu", "Chennai");
		hm.put("Asam", "Ranchi");
		
		System.out.println("Getting all keys of the HashMap...");
		Set<String> states=hm.keySet();	//Set type variable to store all keys
		System.out.println("States: "+states);
		
		System.out.println("\nGetting all values of the HashMap...");
		Collection<String> cities=hm.values();
		System.out.println("Cities: "+cities);
		
		System.out.println("\nGetting each pair separtely in a set...");
		/*
		 * Map.Entry is a nested interface inside the Map interface
		 * entrySet() gives single object contains a singles pair of key and value.
		 */	
		Set<Map.Entry<String, String>> pairs=hm.entrySet(); 
		//System.out.println("States and its City: "+pairs);
		
		Iterator<Map.Entry<String, String>> it=pairs.iterator();
		//Entry is nested interface in Map interface i.e. Map.Entry
		
		while(it.hasNext())
			System.out.println(it.next());		
 	}

}
