package data_struct_and_algo;

import java.util.LinkedList;

public class LinkedListEx {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();

		// act as a stack if we use the .push() method here
//		list.push("A");
//		list.push("B");
//		list.push("C");
//		list.push("D");
//		list.push("F");
//		list.pop();
//		System.out.println(list);

		// act as a queue if we use the .offer() method here
		list.offer("A");
		list.offer("B");
		list.offer("C");
		list.offer("D");
		list.offer("F");
//		list.poll();

		// to add a element in the linkedlist is we use the .add() method
		list.add(4, "E");
		// now by adding a element at the 4th index.

		// to remove a element from the linkedlist we use .remove() method
//		list.remove(4);
//		list.remove("F");

		// to find out a index of an element we use the .indexOf() method
		System.out.println(list.indexOf("D"));

		// to add element at the first position we use .addFirst() method
		list.addFirst("0");
		// to add element at the last position we use .addLast() method
		list.addLast("G");
		System.out.println(list.peekFirst());
		System.out.println(list.peekLast());

		list.removeFirst();
		list.removeLast();
		System.out.println(list);
	}
}
