package com.app.java;

public class FindLargestAndSmallestInArray {
	public static void main(String[] args) {
		int[] numbers = new int[] { 2, 1, 5, 6, 4, 90, 60, 35, 40, 11 };
		int smallest = numbers[0];
		int largest = numbers[0];
		for (int number : numbers) {
			if (number > largest) {
				largest = number;
			} else if (number < smallest) {
				smallest = number;
			}
			System.out.println("Largest is " + largest);
			System.out.println("Smallest is " + smallest);
		}
	}
}
