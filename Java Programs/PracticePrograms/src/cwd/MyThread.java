package cwd;

public class MyThread implements Runnable { // Runnable is an interface to create a Threads..
	@Override
	synchronized public void run() { /// Runnable interface have One Method that is Run() ... as it have only one
		/// method in it so it is as called as FunctinalInterface

		for (int i = 1; i <= 10; i++) {
			System.out.println("Value is : " + i);
			try {
				Thread.sleep(2000);
//				wait();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

	public static void main(String[] args) {
		// Creating object of My Thread Class
		MyThread t1 = new MyThread();

		// t1.start(); My created class is not having this method so i have to create
		// Thread class helper object.
		Thread thr = new Thread(t1); // here i passed my objects reference to the Thread object.
		thr.start();


		/// Object of another thread

		Another_Thread at = new Another_Thread(); // Here i directly called the method by extending Thread Class because
													// by Thread Class implements the runnable interface so by default
													// it have the run method in it.
		at.start();
	}
}
