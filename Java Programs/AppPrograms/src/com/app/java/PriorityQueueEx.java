package com.app.java;

import java.util.PriorityQueue;

public class PriorityQueueEx {
	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<>(15, new QueueComparator());
		queue.add("Modern");
		queue.add("Snehu");
		queue.add("Rajnandini");
		queue.add("Shamal");
		queue.add("Neha");

		while (queue.size() != 0) {
			System.out.println(queue.poll());
		}
	}
}
