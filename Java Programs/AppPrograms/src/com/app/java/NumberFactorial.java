package com.app.java;

import java.util.Scanner;

public class NumberFactorial {
	public static void main(String[] args) {
		int number;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number: ");
		number = scanner.nextInt();
		int factorial = number;
		for (int i = number - 1; i > 0; i--) {
			factorial = factorial * i;
		}
		System.out.println("Factorial is : " + factorial);
		scanner.close();
	}
}
