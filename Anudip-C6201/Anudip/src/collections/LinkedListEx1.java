package collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListEx1 {
	/*
	 * Propeties of LinkedList : 
	 * 		1) Insertion order is maintained 
	 * 		2) Members are not sorted
	 * 		3) Null value us allowed
	 * 		4) Duplicates are allowed.
     * 		5) All members are allocated with indexes starting from 0 to size()-1.
     * 		6) LinkList implements List and also Deque, due to which it has the properties of List. Deque and 
     * 			also Queue.
	 *
	 * LinkedList is have two properties - Deque Child of Queue and list.
	 * 
	 * Properties of Queue : 
	 * 	1) Insertion order is maintained, meaning the object which was added  will be usually added to the end
	 * 		of the queue.
	 * 	2) It follows FIFO (First In First Out), meaning the object which was added first will be deleted first
	 *    when we call poll() 
	 *  3) Members are not given indexes.
	 *  4) Null vlaues are allowed.
	 *  5) Members are not stored.
	 *  
	 *  
	 *  Properties of LinkedList as a Deque
	 *   1) New members can be added at athe beginning and also to the end of the queue.
	 *   2) We can delete members from the start and also from the end of the queue/
	 *   3) It follows both FIFO and LIFO 
	 *   4) Members are not given indexes
	 *   5) Null values are allowed
	 *   6) Members are not stored
	 */
	public static void main(String[] args) {
		
//		LinkedList<String> list = new LinkedList<String>();
//		
//		Queue<String> list2 = new LinkedList<String>(); // This is casting and inherited linked list properties from Queue.
//		list2.add("Pramod");
//		list2.add("Suraj");
//		list2.add("Akash");
//		
//		System.out.println("Before: \n"+list2);
//		list2.add("Chaitali");
//		
//		System.out.println("\nAfter: \n"+list2);
//		list2.poll();
//		System.out.println("\nAfter Deleting: \n"+list2);
//		
		
		Deque<String> list3 = new LinkedList<String>();
		list3.add("Amar");
		list3.add("Akbar");
		list3.add("Raju");
		list3.add("Laila");
		System.out.println("Before\n"+list3);
		list3.offer("Tiger");
		System.out.println("\nAfter\n"+list3);
		list3.offerFirst("Lion");
		System.out.println("\nAfter Offer First \n"+list3);
		list3.poll();
		System.out.println("\nAfter Poll\n"+list3);
		list3.pollLast();
		System.out.println("\nAfter Poll Last\n"+list3);
	}
}
