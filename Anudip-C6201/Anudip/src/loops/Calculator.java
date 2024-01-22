/*   4) Write a program to create a calculator using switch statement.
*/
package loops;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter 1st number: ");
			int num1 = sc.nextInt();
			System.out.println("Enter 2nd number: ");
			int num2 = sc.nextInt();
			System.out.println("Enter Operation that you wnat to perform...");

			System.out.println("+ , - , * , /");
			String input = sc.next();

			switch (input) {
			case "+":
				System.out.println("Addition is : " + (num1 + num2));
				break;
			case "-":
				System.out.println("Substraction is : " + (num1 - num2));
				break;
			case "*":
				System.out.println("Multiplication is : " + (num1 * num2));
				break;
			case "/":
				System.out.println("Division is : " + (num1 / num2));
				break;
			default:
				System.out.println("Enter a valid input!!!");
			}
		}

	}

}
