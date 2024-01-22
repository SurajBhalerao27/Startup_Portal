package com.java.collections.hashmap.org;

//import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Test {

	//It allows only unique keys and allows multiple values but updated values will be consider. It do not follow insertion order 

	public static void main(String[] args) {

		HashMap<Integer,String> hmap=new HashMap<Integer,String>();
		hmap.put(1, "Omkar Narveer");
		hmap.put(1, "Kiran Agarwal");
		hmap.put(2, "Nishant Agarwal");
		hmap.put(23, "Amit Agarwal");
		hmap.put(33, "Indrajeet Narveer");

		//hmap.forEach((k,v)->System.out.println(k+" "+v));

		/*
		 * Set<Integer>keys=hmap.keySet(); for(Integer i:keys) { System.out.println(i);}
		 */
		
		
		
		//hmap.forEach((k,v)->System.out.println(v));
		
		/*Collection<String>values=hmap.values();
		for(String s:values) {
			System.out.println(s);}
		*/
		Set<Entry<Integer,String>>entries=hmap.entrySet();
		for(Entry<Integer,String>entry:entries) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}