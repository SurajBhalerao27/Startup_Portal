package com.app.java;

import java.util.Scanner;

public class GCD_LCM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Number: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("The GCD of two number: " + gcd(x, y) + " " + "The LCM of two number: " + lcm(x, y));
		sc.close();
	}

	// think of what logic should implement here
	static int gcd(int x, int y) {
		return 0;
	}

	static int lcm(int x, int y) {
		return 0;
	}
}
