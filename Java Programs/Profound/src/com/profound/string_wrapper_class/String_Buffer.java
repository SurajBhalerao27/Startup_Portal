package com.profound.string_wrapper_class;

public class String_Buffer {

	public static void main(String[] args) {

		StringBuffer s1 = new StringBuffer();
		System.out.println("Capacity " + s1.capacity()); // inbuilt capacity of string buffer is ===> 16 char
		System.out.println("Length " + s1.length()); // Length is 0 bcoz no argument is passed to it

		System.out.println();

		StringBuffer s2 = new StringBuffer("I am Suraj Bhalerao");
		System.out.println("Capacity " + s2.capacity()); // 16+19 Char = 35 Total Capacity Of String Buffer
		System.out.println("Length " + s2.length()); // Length is 19 bcoz the string passed is 19 char
		System.out.println("After Append s = " + s2.append(" ,Wellcome."));
		System.out.println("Length " + s2.length()); // 19 + 11 Char = 30 Total Capacity Of String Buffer
		System.out.println("After Insert = " + s2.insert(0, "Hi ")); // This insert char set at specific index in the
																		// string.
		System.out.println("After Delete = " + s2.delete(0, 10)); // It deletes the characters in bet the star index and
																	// end index that we specified.
		System.out.println("After Replace = " + s2.replace(5, 8, "***")); // It replaces the declared start and end by
																			// string given.
		System.out.println("After Reverse = " + s2.reverse()); // It reverse the whole string.
		System.out.println("Character at index = " + s2.charAt(12)); // It return the character present at the index
																		// given
		System.out.println("Ascii Value of at index = " + s2.codePointAt(12)); // It gives the Ascii value of the given
	}

}
