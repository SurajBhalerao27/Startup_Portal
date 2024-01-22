package com.profound.multi_thread;

class child10 extends Thread {
	public void run() {
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		notify();
	}
}

class child9 extends Thread {
	public void run() {
		int n = 1;
		while (n <= 10) {
			int r = 2 * n;
			System.out.println("This is table of 2: " + r);
			n++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}

public class MulThread {

	public static void main(String[] args) {
		child10 c10 = new child10();
		child9 c9 = new child9();
		c10.start();
		c9.start();
	}

}
