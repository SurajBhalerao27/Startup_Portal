package multithreadingExamples;

class Table extends Thread {
	int num;

	public Table(int num) {
		this.num = num;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " X " + i + " = " + (num * i));

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class JoinDemo {
	public static void main(String[] args) {
		Table tableoftwo = new Table(2);
		Table tableofthree = new Table(3);

		tableofthree.start();
		try {
			tableofthree.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tableoftwo.start();
	}
}
