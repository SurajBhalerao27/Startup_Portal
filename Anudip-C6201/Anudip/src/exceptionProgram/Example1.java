package exceptionProgram;

/*
 * Exception is something that occurs out of the ordinary.
 * In java programs exceptions occurs when jvm does not execute all lines of code in the program, it terminates 
 * the program in between due to some error code. This is known as exceptions.
 * 
 * Def : Exception is the abrupt termination the program without reaching the end point.
 * 
 * When an exception occurs, i.e JVM terminates the profram abruptly one of the Exception class object is created
 * at the error code.
 * As developer we need to know how to handle such abrupt interuptions and get the program to be executed to the 
 * last line of code.
 * This is done by exception handling.
 * 
 * */
public class Example1 {
	public static void main(String[] args) {
		System.out.println("Hello Everyone !...");
		System.out.println("Today is the first day of the week");

		try {
			int div = 10 / 0;
		} catch (ArithmeticException e) {
			System.err.println("An exception has occured !!! " + e.getMessage());
		}

		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nBye Everyone");
	}
}
