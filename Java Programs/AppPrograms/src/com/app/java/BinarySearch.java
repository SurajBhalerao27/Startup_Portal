package com.app.java;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		int counter, num, item, array[], first, last, middle;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many numbers you want to fill in the array: ");
		num = sc.nextInt();
		array = new int[num];

		System.out.println("Enter " + num + " (integer) elements in the array: ");
		for (counter = 0; counter < array.length; counter++) {
			array[counter] = sc.nextInt();
		}
		System.out.println("Enter the value you want to search in the array: ");
		item = sc.nextInt();
		sc.close();
		first = 0;
		last = num - 1;
		middle = 0;
		while (first <= last) {
			middle = (first + last) / 2;
			if (array[middle] < item) {
				first = middle + 1;
			} else if (array[middle] > item) {
				last = middle - 1;
			} else {
				System.out.println("Number found at index: " + (middle + 1));
				break;
			}
		}

		if (first > last) {
			System.err.println(item + " is not found!");
		}

	}
}
