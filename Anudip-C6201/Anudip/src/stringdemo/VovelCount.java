package stringdemo;

import java.util.Scanner;

public class VovelCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (ch == 'a' || ch == 'A') {
				count++;
			}
		}

	}
}
