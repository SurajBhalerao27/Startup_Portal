package anudip.day7;

import java.util.Scanner;

public class FibSeries {

	int num1 = 0, num2 = 1;

	void fib(int n) {
		System.out.println("Fib Series is : ");
		int i = 0;
		while (i <= n) {
			System.out.print(num1 + " ");
			int num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
//			System.out.print(num3 + " ");
			i++;
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter a Number ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		FibSeries f = new FibSeries();
		f.fib(num);
	}

}
