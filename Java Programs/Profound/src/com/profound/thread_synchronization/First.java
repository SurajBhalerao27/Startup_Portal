package com.profound.thread_synchronization;

public class First extends Thread {
	Table t;

	First(Table t) {
		this.t = t;
	}

	public void run() {
		t.print(6);
	}
}
