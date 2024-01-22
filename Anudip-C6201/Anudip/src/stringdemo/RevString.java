package stringdemo;

import java.util.Scanner;

public class RevString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your name: ");
		String name = sc.nextLine();
		String rev = " ";
		System.out.println("Original Name: " + name);
		
		for (int i = 0; i < name.length(); i++) {
			String  s = rev + name.charAt(i);
		}
		String s = null;
		System.out.println("Reverse : " + s);
	}
}
