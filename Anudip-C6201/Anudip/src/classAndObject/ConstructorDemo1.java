package classAndObject;

public class ConstructorDemo1 {

	ConstructorDemo1() {

		System.out.println("This is the non parameterzed constructor");
	}

	public ConstructorDemo1(String s) {

		System.out.println("String data given: " + s);
	}

	public ConstructorDemo1(String s, int i) {
		System.out.println("String is: " + s + " this is integer: " + i);
	}

	public static void main(String[] args) {
		/*
		 * We can make more than one object of the same class It is our wish how to
		 * create the object, we can use any of the constructor available to us to make
		 * object
		 * 
		 * 
		 * A class can have more than one constructors. This is known as Constructor
		 * overloading, meaning many constructors in one class with same name and
		 * different parameters.
		 */

		ConstructorDemo1 cd = new ConstructorDemo1("Anudip", 30);
		ConstructorDemo1 cd1 = new ConstructorDemo1();
		ConstructorDemo1 cd2 = new ConstructorDemo1("Suraj");

	}

}
