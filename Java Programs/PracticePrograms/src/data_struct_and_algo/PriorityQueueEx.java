package data_struct_and_algo;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {
	public static void main(String[] args) {
		Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
		queue.offer(8.5);
		queue.offer(1.2);
		queue.offer(9.3);
		queue.offer(2.4);

		// by this type we also display the elements.
		System.out.println(queue+"\n");

//		while(!queue.isEmpty()) {
//			System.out.println(queue.poll());
//		}
		// this is printing the elements in the ascending order


		// what is we need it in descending order
		// so to use this in descending order we have to pass and argument in the constructor of the
		//Priority queue is that is going to descends the element order in the priority queue.

		System.out.println();
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}

	}
}
