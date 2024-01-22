package arrays;

import java.util.Arrays;

public class ArrayXExample7 {

	public static void main(String[] args) {
		/*
		 * Arrays is a predefined class used to manipulate the member of an array.
		 * 
		 * In this class All method are creation.
		 */
		int a[] = { 80, 2, 61, 12, 100 };
		 //sort is static method so we can call it with just class name.
		 		Arrays.sort(a);
		System.out.println("Number 12 is at index:" + Arrays.binarySearch(a, 12));
		System.out.println("Printing member of a:");
		for (int m : a) {
			System.out.println(m);
			// toString is an easy way as of printing the member of an array without using
			// loop.
			System.out.println("Member of a=" + Arrays.toString(a));// important
			System.out.println("a=" + a);
		}
	}

}
