package collections;

import java.util.Enumeration;
import java.util.Vector;

public class Vector1 {
	
    public static void main(String[] args) {
        /*
         * Vector class is a legacy class, meaning it was introduced before collection framework.
         * Later on vector class implemented List interface and became a part of collection.
         * 
         * Enumeration is an interface used to fetch members from legacy collections such as 
         * vector, stack, etc.
         * 
         * properties of vector:-
         * 1) Insertion order is maintained.
         * 2) Members are not sorted.
         * 3) Null value is allowed.
         * 4) Duplicates are allowed.
         * 5) All members are allocated with index starting from 0 to size()-1.
         */

         Vector<String> v = new Vector<String>();
         v.add("Saturday");
         v.add("Friday");
         v.add("Monday");
         v.add(null);
         v.add("Sunday");
         v.add("Tuesday");
         v.add("Wednesday");
         v.add("Monday");

         System.out.println(v);

         System.out.println("\nUsing Enumeration...");
         
         Enumeration<String> e = v.elements();
         while(e.hasMoreElements()) {
        	 
            System.out.println(e.nextElement());
         }
        
    }
    
}

