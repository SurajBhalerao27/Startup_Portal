package com.app.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseString {
	public static void main(String[] args) {
		String[] days = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		System.out.println("1. with the collection framework");
		List<String> list = Arrays.asList(days);
		Collections.reverse(list);
		days = list.toArray(new String[0]);
		System.out.print("Reverse is => ");
		for (String string : days) {
			System.out.print(string + ", ");
		}

		System.out.println("\n\n2. with the temporary array");
		int len = days.length;
		String[] revDays = new String[len];
		for (int i = 0; i < len; i++) {
			revDays[i] = days[len - 1 - i];
		}
		System.out.print("Reverse is => ");
		for (String string : revDays) {
			System.out.print(string + ", ");
		}
	}
}
