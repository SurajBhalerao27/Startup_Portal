package collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
 * Members of TreeMap are sorted in ascending order by default.
 * 
 * Properties:-
 * 1) Insertion order is not maintained.
 * 2) Members are sorted.
 * 3) Keys cannot be duplicate, but values can be duplicates.
 * 4) Null key is not allowed, multiple null values are allowed.
 */
public class TreeMap1 {

	public static void main(String[] args) {
		
		TreeMap<String, Double> tm=new TreeMap<String, Double>();
		tm.put("Abhidnya", 45.00);
		tm.put("Vaishnavi",67.78 );
		tm.put("Sampat", 87.97);
		tm.put("Sachin",56.98 );
		tm.put("Swanandi",85.90 );
		tm.put("Avni", 98.99);
		tm.put("Sam", 87.97);
		tm.put("Fulva", null);
		
		System.out.println(tm);
		
		System.out.println("\nGetting all keys of the TreeMap...");
		Set<String> stud=tm.keySet();	//Set type variable to store all keys
		System.out.println("Student Names: "+stud);
		
		System.out.println("\nGetting all values of the HashMap...");
		Collection<Double> marks=tm.values();	//Variable type variable stores all values
		System.out.println("Marks: "+marks);
		
		System.out.println("\nGetting each pair separtely in a set...");
		/*
		 * Map.Entry is a nested interface inside the Map interface
		 * entrySet() gives single object contains a singles pair of key and value.
		 */	
		Set<Map.Entry<String, Double>> pairs=tm.entrySet(); 
		
		Iterator<Map.Entry<String,Double>> it=pairs.iterator();	
		
		while(it.hasNext())
			System.out.println(it.next());
		
	}

}
