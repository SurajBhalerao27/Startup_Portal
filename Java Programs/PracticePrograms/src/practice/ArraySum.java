/*Write a java program to input six elements in array and print all elements also find sum of all elements*/

package practice;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a[] = new int[6];
		int i, sum = 0;
		System.out.println("Enter Six Elements");
		for (i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();

		}
		System.out.println("Elements are: ");
		for (i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			sum = sum + a[i];
		}
		System.out.println("Total sum = " + sum);
	}

}
