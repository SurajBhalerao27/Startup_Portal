package collections;
/*
 * We can also make private methods inside an interface.
 * Uses:-
 * 1) To encapsulate some important codes.
 * 2) If We have some line of codes which needs to be repeated again and again then We can write it once in
 * a private method and call this private method wherever We want to execute the common line of codes.
 */
interface PrivateDemo{
	private void display() {
		System.out.println("Welcome to our interface!!!");
	}
	default void show() {
		display();
		System.out.println("This is the show method!!");
	}
	default void add() {
		display();
		System.out.println("This is the add method");
	}
}

class PrivateDemo2 implements PrivateDemo{
	
}
public class InterfacePrivateMethod {
	public static void main(String[] args) {
		PrivateDemo2 pv2 = new PrivateDemo2();
		pv2.show();
	}
}
