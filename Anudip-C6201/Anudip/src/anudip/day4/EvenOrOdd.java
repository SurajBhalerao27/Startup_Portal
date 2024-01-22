// write a java program to take a number from user. check it is even or odd
package anudip.day4;
import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println(num + " is even");
		} else {
			System.out.println(num + " is odd");
		}
	}

}
