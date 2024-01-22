package com.app.java;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int row = scanner.nextInt();
		System.out.println("Enter number of columns: ");
		int col = scanner.nextInt();

		int a[][] = new int[row][col];
		int b[][] = new int[row][col];
		int c[][] = new int[row][col];

		System.out.println("Enter first matrix: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				a[i][j] = scanner.nextInt();
			}
		}
		System.out.println("Enter second matrix: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				b[i][j] = scanner.nextInt();
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		System.out.println("Sum of matrix: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}

}
