package com.app.java;

import java.util.Scanner;

public class TransposeMatrix {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int row = 3, col = 3;
		int matrix[][] = new int[row][col];
		System.out.println("Enter matrix: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}

		System.out.println("\n\nTranspose of matrix: ");
		for (int j = 0; j < col; j++) {
			for (int i = 0; i < row; i++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
