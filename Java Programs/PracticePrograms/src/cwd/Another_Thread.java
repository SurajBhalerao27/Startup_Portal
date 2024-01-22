
/// Creating Thread Using Extending Thread Class
package cwd;

public class Another_Thread extends Thread {
	@Override
	synchronized public void run() {
		for (int i = 10; i >= 1; i--) {
			System.out.println("Another Thread Value : " + i);
		}
		try {
			Thread.sleep(1000);
//			wait();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
