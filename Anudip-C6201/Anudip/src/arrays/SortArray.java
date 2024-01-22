package arrays;

import java.util.Scanner;

public class SortArray {
// Selection Sort Algorithm

	public static void main(String[] args) {
		int a[] = new int[5];

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter a Number");
			a[i] = sc.nextInt();
		}
		// checking
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					// by using Temp variable
//					int t = a[i];
//					a[i] = a[j];
//					a[j] = t;

					// by not using of temp variable
//					a[i] = a[i] + a[j];
//					a[j] = a[i] - a[j];
//					a[i] = a[i] - a[j];

					// using XOR operator
					a[i] = a[i] ^ a[j];
					a[j] = a[i] ^ a[j];
					a[i] = a[i] ^ a[j];
				}
			}
		}
		// printing
		for (int i = 0; i < 5; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
