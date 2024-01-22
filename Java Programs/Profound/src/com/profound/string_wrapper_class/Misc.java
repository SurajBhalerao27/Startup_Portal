package com.profound.string_wrapper_class;

public class Misc {
	public static void main(String[] args) {
		/*
		 * Primitive data types ---> Wrapper Class. Integer i1 = new Integer(int); Using
		 * Method ----> Integer i3 = Integer.valueOf(int);
		 *
		 */

		// String Primitive Data Type---->
		String a = "11";
		int b = Integer.parseInt(a);
		System.out.println(b * 3);

		// Wrapper Class Object into String
		Integer i = new Integer(50);
		String s = i.toString();
		System.out.println("After Converting Into String : " + s);

		String word = "Java ";
		word = word.concat("is a amazing language!!!");
		System.out.println(word);

	}

}
