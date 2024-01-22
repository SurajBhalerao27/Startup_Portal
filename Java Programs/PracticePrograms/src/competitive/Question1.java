/*
Given a square matrix, Calculate the absolute sum of
the diagonals.


    1   2   3
    4   5   6
    7   8   9

left diagonal = 1 + 5 + 9 = 15
right diagonal = 3 + 5 + 7 = 17
absolute diff = |15-17| = 2

sample input
3
11  2   4
4   5   6
10  8  -12

sample output :
15



*/
package competitive;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int arr[][] = new int[n][n];
		sc.close();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int i = 0;
		int j = 0;
		int left_sum = 0;
		while (i < n) {
			left_sum += arr[i][j];
			i++;
			j++;
		}
		int right_sum = 0;
		i = 0;
		j = n - 1;
		while (i < n) {
			right_sum += arr[i][j];
			i++;
			j--;
		}
		System.out.println(Math.abs(left_sum - right_sum));
	}
}
