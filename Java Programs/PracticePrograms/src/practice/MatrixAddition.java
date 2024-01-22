/*write a java program to input 3*2 matrix also initialize another 3*2 matrix and print matrix addition in matrix form*/

package practice;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int first[][] = new int[3][2];
		int row, col;
		System.out.println("Enter Six Element for array a: ");
		for (row = 0; row < 3; row++) {
			for (col = 0; col < 2; col++) {
				first[row][col] = sc.nextInt();
			}
		}
		int second[][] = { { 1, 1 }, { 1, 1 }, { 1, 1 } };
		int result[][] = new int[3][2];
		System.out.println("After a matrix addition: ");
		for (row = 0; row < 3; row++) {
			for (col = 0; col < 2; col++) {
				result[row][col] = first[row][col] + second[row][col];
				System.out.print(result[row][col] + " ");
			}
			System.out.println();
		}

	}

}
