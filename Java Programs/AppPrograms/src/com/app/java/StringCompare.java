package com.app.java;

public class StringCompare {
	public static void main(String[] args) {
		String str = "Hello World";
		String anotherString = "hello world";
		Object obj = str;

		System.out.println(str.compareTo(anotherString));
		System.out.println(str.compareToIgnoreCase(anotherString));
//		System.out.println(str.compareTo(obj));
	}
}
