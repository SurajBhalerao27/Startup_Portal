package com.app.java;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();
		q.add("Suraj");
		q.add("Modern");
		q.add("Chetan");
		q.add("Pramod");
		System.out.println(q);

		q.poll();
		System.out.println(q.poll());

		q.element();
		System.out.println(q);

		q.peek();
		System.out.println(q);
	}

}
