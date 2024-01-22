package com.app.java;

import java.util.Scanner;

public class SparseMatrix {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m, n;
		System.out.println("Enter diamensions of the matrix - m * n : ");
		m = scanner.nextInt();
		n = scanner.nextInt();
		double matrix[][] = new double[m][n];
		int zero = 0;
		System.out.println("Enter matrix with zeros: ");

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = scanner.nextDouble();
				if (matrix[i][j] == 0) {
					zero++;
				}
			}
		}
		Math.floor(zero);
		if (zero > (m * n) / 2) {
			System.out.println("It is a sparse matrix");
		} else {
			System.out.println("It is not sparse matrix");
		}
		scanner.close();
	}
}
