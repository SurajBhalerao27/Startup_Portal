package cwd.companyProject;

public class Consumer extends Thread {
	Company c;
	Consumer(Company c) {
		this.c = c;
	}
	@Override
	public void run() {

		while (true) {

			this.c.consume_item( );
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
