package stringdemo;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name : ");
		String pass = sc.nextLine().toLowerCase();
		sc.close();
//		for (int i = 0; i < pass.length(); i++) {
//			char ch = pass.charAt(i);
//		}

		// try to do with switch case statement 
		pass = pass.replace('a', '@');
		pass = pass.replace('e', '#');
		pass = pass.replace('i', '%');
		pass = pass.replace('o', '!');
		pass = pass.replace('u', '*');

		System.out.println(pass);
	}

}
