// Write to print one thread numbers from 1-5 and second thread numbers form 5 -1 ....
package com.profound.multi_thread;

class child1 extends Thread {
	public void run() {
		for (int i = 1; i < 6; i++) {
			System.out.println("Top-Bottom :" + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class child2 extends Thread {
	public void run() {
		for (int i = 5; i >= 1; i--) {
			System.out.println("Bottom-Top :" + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class multh {

	public static void main(String[] args) {
		child1 c1 = new child1();
		child2 c2 = new child2();

		c1.start();
		c2.start();
	}

}
