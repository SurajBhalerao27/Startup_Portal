package com.app.java;

import java.util.StringTokenizer;

public class StringTokenizerCounter {
	public static void main(String[] args) {
		String s = "This isthe example of string tokenizer";
		StringTokenizer stringTokenizer = new StringTokenizer(s);
		int count = 0;

		while (stringTokenizer.hasMoreElements()) {
			count++;
			System.out.println("Token " + count + " : " + stringTokenizer.nextToken());
		}
	}
}
