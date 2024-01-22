package com.app.java;

public class SwapWithoutTemp {
	public static void main(String[] args) {
		int num1 = 425, num2 = 8749;
		System.out.println("Before Swaped: " + num1 + " " + num2);
		num2 = num1 + num2;
		num1 = num2 - num1;
		num2 = num2 - num1;
		System.out.println("After Swaped : " + num1 + " " + num2);
	}
}
