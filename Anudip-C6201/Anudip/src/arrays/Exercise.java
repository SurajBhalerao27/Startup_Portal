package arrays;

import java.util.Scanner;

public class Exercise {
	public static void main(String[] args) {
		/*
		 * Create an array of int type of size 5. Take user input to add data into this
		 * array. Print only the even members of the array
		 */
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter a numbers");
			arr[i] = sc.nextInt();
		}
		System.out.println("*******Even Number Array******");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0)
				System.out.printf(arr[i] + " ");
		}
	}
}
