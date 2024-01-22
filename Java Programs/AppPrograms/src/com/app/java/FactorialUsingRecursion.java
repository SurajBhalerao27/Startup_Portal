package com.app.java;

import java.util.Scanner;

public class FactorialUsingRecursion {
	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			int num = scanner.nextInt();

			int result = fact(num);
			System.out.println("Factorial is: " + result);
		} catch (Exception e) {
			System.out.print(e);
		}
	}

	static int fact(int num) {
		System.out.println(num);
		if (num <= 1) {
			return 1;
		} else {
			int res = num * fact(num - 1);
			System.out.println(res);
			return res;
		}
	}
}
