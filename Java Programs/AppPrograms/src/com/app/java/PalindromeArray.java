package com.app.java;

public class PalindromeArray {
	public static void main(String[] args) {
		int[] numbers = new int[] { 121, 11, 22, 54, 12 };
		for (int number : numbers) {
			int num = number;
			int reverseNumber = 0;
			int temp = 0;
			while (num > 0) {
				temp = num % 10;
				num = num / 10;
				reverseNumber = reverseNumber * 10 + temp;
			}
			if (reverseNumber == number) {
				System.out.println(number + " : is Palindrome");
			} else {
				System.out.println(number + " : is not Palindrome");
			}
		}
	}
}
