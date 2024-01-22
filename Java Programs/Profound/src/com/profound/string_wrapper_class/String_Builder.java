package com.profound.string_wrapper_class;

public class String_Builder {

	public static void main(String[] args) {
		// String builder is non synchronized class of string than that of the string
		// buffer class and hence, in a single threaded environment the overhead is less
		// than using a string buffer

		StringBuilder s1 = new StringBuilder("Suraj");
		System.out.println("Capacity = " + s1.capacity());
		System.out.println("After Insert = " + s1.insert(0, "Hello, "));
		System.out.println("Length = " + s1.length());
		System.out.println("After Append  = " + s1.append(" Wellcome To My Code"));

		System.out.println();

		StringBuilder s2 = new StringBuilder("Suraj");
		System.out.println("After Reverse = " + s2.reverse());
		System.out.println("After Re-Reverse = " + s2.reverse());
		System.out.println("After Delete = " + s2.deleteCharAt(2));
	}

}
