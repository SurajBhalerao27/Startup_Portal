package loops;

import java.util.Scanner;

public class SwitchStatement1 {

	public static void main(String[] args) {
		/*
		 * Switch case statement is used when we know that a variable is going to have
		 * many possible values and we want to give different output for different
		 * values
		 */

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter any color present in rainbow...");
			String color = sc.nextLine();
			switch (color) {
			case "violet":
				System.out.println("know as a royal colour");
				break;
			case "indigo":
				System.out.println("Ashok chakra is of indiago color");
				break;
			case "blue":
				System.out.println("clear sky is usually blue in color");
				break;
			case "green":
				System.out.println("Nature and trees are in green colour");
				break;
			case "yellow":
				System.out.println("Sunflower has a beutiful yellow color");
				break;
			case "orange":
				System.out.println("The fruit orange in colour too");
				break;
			case "red":
				System.out.println("We Stop at red siglnal");
				break;
			default:
				System.out.println("Please give names in all small letters and only"
						+ " those colour which are there in rainbow only...");
			}
		}
	}

}
