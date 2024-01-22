package data_struct_and_algo;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		/* here why we do not create a constructor for the queue because Queue itself is a interface and this interface is implemented by
		 * the LinkedList class so we use this.  and Queue is also implemented by the PriorityQueue but it has different properties

		   it is a FIFO -> First in First out
		   it have the head and tail.
		 * */

		// adding a data to Queue is called -> offer OR add OR enqueue
		// removing data from Queue is called -> poll OR remove OR dequeue

		queue.offer("Suraj");
		queue.offer("Pramod");
		queue.offer("Sanjana");
		queue.offer("Aditya");
		queue.offer("Rohit");

		System.out.println(queue);

		// it is used to peeking which one is the first element in the queue
		System.out.println(queue.peek());

		// to see is any element is present in the queue or not
		System.out.println(queue.contains("Aditya"));

		// to delete elements from the queue
		System.out.println(queue.poll());  // this method only removes the first element in the queue.
		System.out.println(queue);

	}
}
