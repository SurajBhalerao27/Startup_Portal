package com.app.java;

public class ReverseNumber {
	public static void main(String[] args) {
		int number = 1234;
		int reverNumber = 0, temp = 0;

		System.out.println("Original: " + number);
		while (number > 0) {
			temp = number % 10; // to take out last digit from number
			reverNumber = reverNumber * 10 + temp; // 1) 0+4=4 2) 40 +3=43 3) 430+2=432 4) 4320 + 1 = 4321
			number = number / 10; // to remove last digit from then number
		}
		System.out.println("Reverse : " + reverNumber);
	}
}
