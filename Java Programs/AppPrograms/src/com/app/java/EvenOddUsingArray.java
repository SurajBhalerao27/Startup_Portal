package com.app.java;

public class EvenOddUsingArray {
	public static void main(String[] args) {
		int[] numbers = new int[] { 2, 1, 5, 6, 4, 90, 60, 35, 40, 11 };
		for (int number : numbers) {
			if (number % 2 == 0) {
				System.out.println(number + " is even");
			} else {
				System.out.println(number + " is odd");
			}
		}
	}
}
