package data_struct_and_algo;

public class Recursion {
	public static void main(String[] args) {
		int res = factorial(5);
		System.out.println("factorial is: " + res);
	}

	private static int factorial(int value) {
		if (value < 1) {
			return 1;
		}
		return value * factorial(value - 1);
	}
}
