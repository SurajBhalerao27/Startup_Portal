//Write a java program to check number is positive or negative
package loops;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		if (num >= 0) {
			System.out.println(num + " is positive");
		} else {
			System.out.println(num + " is negative");
		}

	}

}
