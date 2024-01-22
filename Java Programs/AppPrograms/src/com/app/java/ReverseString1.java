package com.app.java;

public class ReverseString1 {
/*
	  	  reverseString("Hello")
		= reverseString("ello") + 'H'
		= (reverseString("llo") + 'e') + 'H'
		= ((reverseString("lo") + 'l') + 'e') + 'H'
		= (((reverseString("o") + 'l') + 'l') + 'e') + 'H'
		= ((((reverseString("") + 'o') + 'l') + 'l') + 'e') + 'H'
		= "olleH"
*/
	public static String reverseString(String str) {
		if (str.isEmpty()) {
			return " ";
		} else {
			return reverseString(str.substring(1)) + str.charAt(0);
		}
	}

	public static void main(String[] args) {
		String s = "Hello World";
		// using string builder
		System.out.println(new StringBuffer(s).reverse().toString());

		// using recursion
		System.out.println(reverseString(s));
	}
}
