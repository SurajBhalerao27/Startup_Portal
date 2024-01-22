package collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Deque;

public class LinkedList1 {
	
	public static void main(String[] args) {
		/*
		 * LinkedList implements List and also Deque, due to which it has the properties
		 * of List, Dequeue and also Queue
		 * 
		 * Properties of LinkedList:-
		 * 1) Insertion order is mentioned.
		 * 2) Members are not sorted.
		 * 3) Null value is allowed.
		 * 4) Duplicates are allowed.
		 * 5) All members are allocated with indexes starting from 0 to size()-1.
		 * 
		 * Properties of LinkedList as a Queue:-
		 * 1) Insertion order is maintained, meaning the new object added will be usually
		 * 	  added to the end of the queue.
		 * 2) It follows FIFO, meaning the object which was added first will be deleted 
		 * 	  first when we call poll();
		 * 3) Members are not given indexes.
		 * 4) Null values are allowed.
		 * 5) Members are not sorted.
		 * 
		 * Properties of LinkedList as a Dequeue:-
		 * 1) New members can be added at the beginning and also to the end of the queue.
		 * 2) We can delete members from the start and also from the end of the queue.
		 * 3) It follows both FIFO and LIFO.
		 * 4) Members are not given indexes.
		 * 5) Null values are allowed.
		 * 6) Members are not sorted.
		 */
		List<String> list = new LinkedList<String>();
		list.add("Anthony");
		list.add(null);
		list.add("Seeta");
		list.add("Kartik");
		list.add("Akash");
		
		System.out.println("Before: " + list);
		list.add("Kartik");
		System.out.println("After: " + list);
		list.remove(1);
		System.out.println("After remove index1: " + list);
		
		
		Queue<String> list2 = new LinkedList<String>();
		list2.add("Kartik");
		list2.add("Akash");
		list2.add(null);
		list2.add("Mayur");
		
		System.out.println("\nBefore: " + list2);
		list2.add("Aishwarya");		
		System.out.println("After: " + list2);
		list2.poll();		
		System.out.println("After deleting: " + list2);
		
		
		Deque<String> list3 = new LinkedList<String>();
		list3.add("Amar");
		list3.add("Akbar");
		list3.add("Anthony");
		list3.add(null);
		list3.add("Seeta");
		list3.add("Geeta");
		
		System.out.println("\nBefore: " + list3);
		list3.offer("Tiger");		
		System.out.println("After: " + list3);
		list3.offerFirst("Pathan");		
		System.out.println("After offer first: " + list3);
		list3.poll();
		System.out.println("After poll: " + list3);
		list3.pollLast();
		System.out.println("After poll last: " + list3);
	}
}
