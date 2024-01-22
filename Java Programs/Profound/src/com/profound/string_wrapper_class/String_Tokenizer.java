package com.profound.string_wrapper_class;

import java.util.StringTokenizer;

public class String_Tokenizer {

	public static void main(String[] args) {
		String s = "Good Morning Suraj";
		int c = 0;
		StringTokenizer st = new StringTokenizer(s);
		while (st.hasMoreElements()) {
			System.out.println(st.nextToken());
			c++;
		}
		System.out.println("No.of Tokens : " + c);

	}

}
