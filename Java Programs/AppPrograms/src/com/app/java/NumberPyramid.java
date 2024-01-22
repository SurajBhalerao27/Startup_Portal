package com.app.java;

import java.util.Scanner;

public class NumberPyramid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for loop: ");
		int toRun = sc.nextInt();
		System.out.println("Enter which series you want to print: ");
		int forRun = sc.nextInt();
		int y = forRun;
		for (int i = 0; i <= toRun; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(y + " ");
				y = y + forRun;
			}
			System.out.println();
		}
		sc.close();
	}
}
