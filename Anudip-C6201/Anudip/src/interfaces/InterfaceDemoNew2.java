package interfaces;

interface Myinter22 {
	public void display();

	public void show();

}

abstract class Myclass1 implements Myinter22 {

	public void display() {

	}
	/*
	 * In below given Myclass we have not given method body/implementation to the
	 * show method. Meaning the show method is inheritance from Myinter22 is being
	 * kept as it is and would be abstract. we are already know that any class
	 * having abstract method has to be declared as would be abstract. we will have
	 * to make myclass also abstract.
	 */
}

public class InterfaceDemoNew2 {
	public static void main(String[] args) {

	}
}
