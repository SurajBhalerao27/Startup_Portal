package com.app.java;

import java.util.Scanner;

public class LinearSearchExample {
	public static void main(String[] args) {
		int counter, num, item, array[];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements: ");
		num = sc.nextInt();
		array = new int[num];
		System.out.print("Enter " + num + " integers: ");
		for (counter = 0; counter < num; counter++) {
			array[counter] = sc.nextInt();
		}
		System.out.print("Enter number you want to search: ");
		item = sc.nextInt();
		for (counter = 0; counter < num; counter++) {
			if (array[counter] == item) {
				System.out.print(item + " Found at: " + (counter + 1));
				break;
			}
		}
		if (counter == num) {
			System.err.print(item + " doesn't exist !!");
		}
	}
}
