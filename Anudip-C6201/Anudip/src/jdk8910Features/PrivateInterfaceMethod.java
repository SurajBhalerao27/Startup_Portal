package jdk8910Features;
/* We can also make private methods inside an interfaces 
 * Uses : 
 * 	1) to encapsulate some important codes.
 * 	2) If we have some common line of code which needs to be repeated again and again then we can write
 * 		it once in a private method and call this private method wherever we want to executes the 
 * 		commmon line of codes.
 * 
 * */
interface PrivateDemo{
	private void display() {
		System.out.println("Welcome to our interface");
	}
	
	default void show() {
		display();
	}
	
	default void add() {
		display();
	}
}
public class PrivateInterfaceMethod {
	public static void main(String[] args) {
		
	}
}
