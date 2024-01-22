package anudip.day3;

import java.util.Scanner;

public class ParameterDemo1 {

	public int addition(int a, int b) {

		return a + b;
	}

	public int addition(int a, int b, int c) { // This is method overloading

		return a + b + c;
	}

	public static void main(String[] args) {

		ParameterDemo1 pd = new ParameterDemo1();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter First Number: ");
		int x = scanner.nextInt();

		System.out.println("Enter Second Number: ");
		int y = scanner.nextInt();

		System.out.println("Enter Third Number: ");
		int z = scanner.nextInt();

		int total = pd.addition(x, y);
		int total1 = pd.addition(x, y, z);
		System.out.println(total);
		System.out.println(total1);
	}

}
