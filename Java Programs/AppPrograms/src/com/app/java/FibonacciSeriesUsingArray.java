package com.app.java;

import java.util.Scanner;

public class FibonacciSeriesUsingArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter limit upto you wanted to print the fibonacci series: ");
		int limit = scanner.nextInt();
		long[] series = new long[limit];

		series[0] = 0;
		series[1] = 1;
		for (int i = 2; i < series.length; i++) {
			series[i] = series[i - 1] + series[i - 2];
		}

		System.out.println("The Fib Series upto " + limit + " is: ");
		for (long element : series) {
			System.out.print(element + " ");
		}
		scanner.close();
	}
}
