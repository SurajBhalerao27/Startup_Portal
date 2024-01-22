package com.profound.multi_thread;

class child extends Thread {
	public void run() { // Running()
		System.out.println("Child Theread ");
		try {
			Thread.sleep(1000); // Blocked
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("Hello ");
	}
}

public class First { // Parent Thread

	public static void main(String[] args) {

		child c = new child(); // New
		c.start(); // Implicitly call run() Runnable
	}

}
