package cwd;


class UserThread extends Thread{
	@Override
	public void run() {
		System.out.println("This is user defined thread ---> ");
	}
}

public class ThreadOP {

	public static void main(String[] args) {

		/// Main Method itself is a One type of thread ---->> Main Thread
		System.out.println("Program Is Started...");
		Byte s = 40 + 50;
		System.out.println("Sum is : " + s);

		Thread t = Thread.currentThread();
		String tname = t.getName(); // This will shows the actual name of the << Main >> As a therad in the output
									// conssole window

		// This shows that << Main >> is itself is a Thread of a program that executed
		System.out.println("Currunt Running Thread is : " + tname);

		t.setName("Suraj Thread"); // This will change/ Set thread name as per our requirements
		System.out.println("New Name Is : " + t.getName());

		try {
			Thread.sleep(2000); // This will sleep thread for 5 sec
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println();

		System.out.println("Id of currunt thread (Main) : "+t.getId());
		System.out.println("Program Ended...");

		UserThread thread = new UserThread();
		thread.start();
		System.out.println("id of next thread (User) : "+thread.getId());
	}

}
