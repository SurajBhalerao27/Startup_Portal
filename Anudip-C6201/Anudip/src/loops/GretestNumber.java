package loops;

import java.util.Scanner;

public class GretestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three nums: ");
		int num1 = sc.nextInt(), num2 = sc.nextInt(), num3 = sc.nextInt();
		if (num1 > num2 && num1 > num3)
			System.out.println(num1 + " is gretest");
		else if (num2 > num1 && num2 > num3)
			System.out.println(num2 + " is gretest");
		else
			System.out.println(num3 + " is gretest");
	}
}
