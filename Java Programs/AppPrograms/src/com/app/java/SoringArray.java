package com.app.java;

import java.util.Arrays;

public class SoringArray {
	public static void main(String[] args) {
		String[] names = new String[] { "John", "Alex", "Chris", "Williams", "Mark", "Bob" };
		// this is case sensitive --> if first word is small case then it is not sort
		Arrays.sort(names);
		for (String name : names) {
			System.out.print(name + ", ");
		}
	}
}
