package arrays;

import java.util.Arrays;

public class MultiDimesionalArray {
	/*
	 *  
	 * 
	 * */
	public static void main(String[] args) {
		String names[] = new String[3];
		names[0] = "Suraj";
		names[1] = "Snehal";
		names[2] = "poms";

		String color[][] = new String[3][2];
		String a1[] = { "Red", "Brown" };
		String a2[] = { "Blue", "Yellow" };
		String a3[] = { "Violet", "Green" };

		int numbers[][] = { { 1, 2 }, { 6, 10, 15 }, { 900 } };
		System.out.println("\nSingle members");
		System.out.println(numbers[1][2]); 
		// This will access the value stored in the index that is present on index 2 of array present on index 1
		// of the array numbers.
		
		//using enhance forloop or foreach loop 
		System.out.println("\nEnhanced for loop");
		for (int i[] : numbers) {
			System.out.println(Arrays.toString(i));
		}
		System.out.println("\nNormal for loop");
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}
	}
}
