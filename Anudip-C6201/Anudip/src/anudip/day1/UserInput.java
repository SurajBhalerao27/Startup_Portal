package anudip.day1;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] suraj) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Your Name: ");
		String names = scanner.nextLine();
		System.out.println("The user input name is: " + names);
		scanner.close();
	}

}
