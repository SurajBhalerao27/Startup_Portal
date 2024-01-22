/* Write a java program to input value and find factorial  using default constructor */
package practice;

import java.util.Scanner;

public class FactorialConstructor {
	long n;

	public FactorialConstructor() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Value \n");
		n = scanner.nextLong();

	}

	public void find() {
		long f = 1;
		for (long i = n; i >= 1; i--) {
			f = f * i;
		}
		System.out.println("Factorial is: " + f);
	}

	public static void main(String[] args) {
		FactorialConstructor factorialConstructor = new FactorialConstructor();
		factorialConstructor.find();
	}

}
