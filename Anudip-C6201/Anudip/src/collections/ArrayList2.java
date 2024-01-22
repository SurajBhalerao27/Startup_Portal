package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList2 {

	public static void main(String[] args) {
		/*
		 * Iterator is an interface used to iterate the members of the collection.
		 * It can be used to fetch data from any type of collection.
		 * It can fetch data in one direction only.
		 * Iterator interface's implemented object is created with the method iterator().
		 * 
		 * ListIterator is also an interface used to iterate members of the collection.
		 * It can be used to fetch data only from those collection classes that implement
		 * list interface.
		 * It can fetch data in both direction.
		 */
		ArrayList<Integer> rollNo = new ArrayList<>();
		rollNo.add(78);
		rollNo.add(30);
		rollNo.add(35);
		rollNo.add(19);
		rollNo.add(45);
		
		/*
		 * Object of Itr class is created when we call iterator()
		 * method. Itr class implements Iterator interface. Hence we are doing upcasting over here.
		 */
		Iterator<Integer> it = rollNo.iterator();
		System.out.println("Using Iterator:- ");
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		
		System.out.println("\nUsing ListIterator from start to end:- ");
		ListIterator<Integer> li = rollNo.listIterator();
		while(li.hasNext()) {
			
			System.out.println(li.next());
		}
		
		System.out.println("Using ListIterator from end to start:- ");
		ListIterator<Integer> rev = rollNo.listIterator(rollNo.size());
		while(rev.hasPrevious()) {
			
			System.out.println(rev.previous());
		}
	}

}
