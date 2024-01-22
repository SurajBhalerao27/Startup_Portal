package classAndObject;

// we can create the multiple constructor with different parameter.
// we can create object with different name but same name is not allow.
public class ConstructorsDemo {

	public ConstructorsDemo() {
		System.out.println("this is non parameterised constructor. ");

	}

	public ConstructorsDemo(String s) {

		System.out.println("this is parameterised constructor.");

	}

	public ConstructorsDemo(int a, String s) {
		System.out.println("this is two parameterised constructor. ");

	}

	public ConstructorsDemo(int a, String s, long r) {
		System.out.println("this is three parameterised constructor.");

	}

	public static void main(String[] args) {
		ConstructorsDemo c1 = new ConstructorsDemo(100, "chaitali", 10000);// parameter must same as constructor
																			// parameter.
		ConstructorsDemo c2 = new ConstructorsDemo();
		ConstructorsDemo c3 = new ConstructorsDemo("chaitali");
		ConstructorsDemo c4 = new ConstructorsDemo(100, "chaitali");
	}
}
