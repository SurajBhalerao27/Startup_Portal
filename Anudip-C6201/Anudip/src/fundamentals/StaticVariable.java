package fundamentals;

public class StaticVariable {
	/*
	 * Static variables are used for memory management. once an variable declared as
	 * static then it allocate memory at the time of obj creation.
	 * 
	 * The static can be:
	 * 
	 * Variable (also known as a class variable) Method (also known as a
	 * classmethod) Block Nested class
	 * 
	 * Q) Why is the Java main method static?
	 * 
	 * Ans) It is because the object is not required to call a static method. If it
	 * 		were a non-static method, JVM creates an object first then call main() method
	 * 		that will lead the problem of extra memory allocation.
	 * 
	 * 
	 */
	static int a = 5, b = 10;
	static int sum = a + b;

	public static void main(String[] args) {
		System.out.println("Sum is: " + sum);
		System.out.println("Sum is: " + ((StaticVariable.a) + (StaticVariable.b)));
	}

}
