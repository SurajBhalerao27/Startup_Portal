package fundamentals;

import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your name: ");
		String name = sc.nextLine();

		System.out.println("Enter Your marks: ");
		double marks = sc.nextDouble();

		System.out.println("Enter if you are fresher or not : Answer in true or false");
		boolean fresher = sc.nextBoolean();

		System.out.println("Enter Your mobile number: ");
		long contact = sc.nextLong();

		System.out.println("*****************Details Given Are*******************");

		System.out.println("name: " + name);
		System.out.println("marks: " + marks);
		System.out.println("fresher: " + fresher);
		System.out.println("contact: " + contact);
	}

}
