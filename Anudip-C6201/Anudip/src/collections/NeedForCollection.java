package collections;

import java.util.ArrayList;

public class NeedForCollection {

	public static void main(String[] args) {
		/*
		 * Disadvantages of arrays:-
		 * 1) Size is fixed.
		 * 2) Only homogeneous type of data can be stored in an array.
		 * 3) Array does not provide much variations or predefined methods in it. Searching
		 * 	  and other manipulations in an array is difficult.
		 * 
		 * Framework: It is a group of predefined classes and interfaces having many predefined 
		 * methods which can be used and modified according to our requirement.
		 * 
		 * Collections is a framework of many interfaces and classes.
		 * Collection is used to store a group of objects.
		 * Advantages:-
		 * 1) It's size is not fixed.
		 * 2) We can create homogeneous or heterogeneous collections.
		 * 3) We get many predefined classes due to which we can have different collections 
		 * 	  having their own unique properties.
		 */
		
		/*
		 * Below we have created a heterogeneous or non-generic collections.
		 * Meaning we can add any type of data in it.
		 * 
		 * Note:-
		 * In java this is not preferred. We should usually never make such non-generic
		 * collection, because it does not give type safety.
		 */
		ArrayList myObj = new ArrayList();
		
		myObj.add("Anudip");
		myObj.add(10);
		myObj.add(9.6);
		myObj.add(true);
		myObj.add('#');
		
		System.out.println(myObj);
	}

}
