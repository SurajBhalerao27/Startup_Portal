package practice;

public class LambdaThreadExample {
	public static void main(String[] args) {
		Thread thread = new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Thread: " + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		thread.start();
		// Thread runnableThread = new Thread(runnable);
		// runnableThread.start();
	}

}

