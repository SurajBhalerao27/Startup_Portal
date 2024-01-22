package data_struct_and_algo;

import java.util.ArrayList;
import java.util.LinkedList;

public class CompareArrayListToLinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> linkList = new LinkedList<>();
		ArrayList<Integer> arrayList = new ArrayList<>();

		long startTime;
		long endTime;
		long elapseTime;

		for (int i = 0; i < 1000000; i++) {
			linkList.add(i);
			arrayList.add(i);
		}
		/************************* Notes ********************************/
		/*  1. To get first element in both ArrayList is the faster one
		 *  2. To get middle element in both ArrayList is the faster one
		 *  3. To get last element in both ArrayList is the faster one
		 *
			1. To remove fist element in both LinkedList is the faster one
			2. To remove middle element in both ArrayList is the faster one
			3. To remove last element in both ArrayList is the faster one
		*/
		/********************** conclusion *****************************/
		/* the arraylist is way more faster than linkedlist and linkedlist is doubly linked list so adding and retrieving is slower
		 *
		 * In case of lot of inserting and deleting of data in large datasets then linkedlist might be better because in arraylist we have to
		 * shift elements to right or left while inserting or deleting it takes time.
		 * */

		/******************** LinkedList ********************************/
		startTime = System.nanoTime();
//		linkList.get(0);
//		linkList.get(500000);
//		linkList.get(999999);

//		linkList.remove(0);
//		linkList.remove(500000);
		linkList.remove(999999);
		endTime = System.nanoTime();
		elapseTime = endTime - startTime;
		System.out.println("LinkedList:\t" + elapseTime + " NS");

		/******************** ArrayList ********************************/
		startTime = System.nanoTime();
//		arrayList.get(0);
//		arrayList.get(500000);
//		arrayList.get(999999);

//		arrayList.remove(0);
//		arrayList.remove(500000);
		arrayList.remove(999999);
		endTime = System.nanoTime();
		elapseTime = endTime - startTime;
		System.out.println("ArrayList:\t" + elapseTime + " NS");
	}
}
