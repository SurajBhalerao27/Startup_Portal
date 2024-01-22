package com.app.java;

public class DecimaToBinary {
	public static void main(String[] args) {
		System.out.println("Binary values 1 - 10\n***********************");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " : " + Integer.toBinaryString(i));
		}
	}
}
