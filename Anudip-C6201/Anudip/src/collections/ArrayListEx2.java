package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListEx2 {

	public static void main(String[] args) {
		/*
		 * Iterator is an interface use to iterate the members of the collection. It can
		 * be used to fetch data from any type of collection. Iteration interface's
		 * implemented object is created with the method iteration();
		 * 
		 * ListIterator is also am interface used to interact members of the collection.
		 * It can be used to fetch
		 */

		/*
		 * < > This is the diamind operator and we always passes wrapper classes.
		 */
		ArrayList<Integer> rollNo = new ArrayList<>();
		rollNo.add(01);
		rollNo.add(11);
		rollNo.add(22);
		rollNo.add(33);
		rollNo.add(44);

		Iterator<Integer> it = rollNo.iterator();
		/* Upcasting .. Object of Itr class is created when we call iterator() 
		 	method. Itr class implements Iterator interface. Hence we are doing upcasting over here.		
		 */
		System.out.println("Using Iterator");
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		/*
		 * Iterator is only done in row means from front to back only
		 * 
		 * but by ListIterator we prints it back to front with the help of
		 * ListIterator().
		 */
		System.out.println("Using listIterator from start to end:- ");
		ListIterator<Integer> li = rollNo.listIterator(), 
							 rev = rollNo.listIterator(rollNo.size());
		
		System.out.println("\nUsing ListIteratoor:- ");
		while (li.hasNext()) {
			System.out.println(li.next());
		}

		System.out.println("Using listIterator from end to start:- ");
//		ListIterator<Integer> rev = rollNo.listIterator(rollNo.size());
		while (rev.hasPrevious()) {
			System.out.println(rev.previous());
		}
	}
}
