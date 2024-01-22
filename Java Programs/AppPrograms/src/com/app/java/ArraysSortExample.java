package com.app.java;

import java.util.Arrays;

public class ArraysSortExample {
	public static void main(String[] args) {
		int[] first = new int[] { 3, 2, 5, 6, 4, 1 };
//
//		System.out.print("Original Array: ");
//		for (int i = 0; i < first.length; i++) {
//			System.out.print(" " + first[i]);
//		}

		Arrays.sort(first);
//
//		System.out.print("\nSorted Array: ");
//		for (int i = 0; i < first.length; i++) {
//			Arrays.sort(first);
//			System.out.print(" " + first[i]);
//		}
//
		System.out.println("Sorted array: ");
		for (int i : first) {
			System.out.print(i + " ");
		}
	}
}
