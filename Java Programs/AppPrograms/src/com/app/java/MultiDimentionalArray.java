package com.app.java;

public class MultiDimentionalArray {

	public static void main(String[] args) {
		boolean blnFound = false;
		int[][] array = new int[][] { { 1, 2, 3, 4, 5 }, { 10, 20, 40, 50, 30 } };

		System.out.println("Searching '30' ...");

		for (int[] element : array) {
			for (int element2 : element) {
				if (element2 == 30) {
					blnFound = true;
					if (blnFound) {
						System.out.println("'30' found");
					}
				}
			}
		}

	}

}
