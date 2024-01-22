package Practice;

import java.util.Scanner;

class test {
	public void check(int number) {
		int a = number;
		int f = 0;
		while (number > 0) {
			int reminder = number % 10;
			f = f + (reminder * reminder * reminder);
			number = number / 10;
		}
		if (a == f) {
			System.out.println(+f + ":Number is Armstrong");
		} else {
			System.out.println(+f + ":Number is not Armstrong");

		}
	}
}

public class ArmstrongDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		test t = new test();
		t.check(num);

	}

}
