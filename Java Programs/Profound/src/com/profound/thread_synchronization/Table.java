package com.profound.thread_synchronization;

class Table {
	synchronized public void print(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
