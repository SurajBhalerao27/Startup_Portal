// Create a method which takes name and email as parameter and display details on screen.
package anudip.day3;

import java.util.Scanner;

public class PracticeQ {

	public String display(String n, String e, String add) {
		return "Name: " + n + " \nEmail: " + e + "\nAddress: "+add;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PracticeQ pq = new PracticeQ();

		System.out.println("Enter Your Name: ");
		String name = sc.nextLine();

		System.out.println("Enter Your Email: ");
		String email = sc.nextLine();

		String detail = pq.display(name, email, "My Adress is here"); // here it is also possible while creating a method
		
		System.out.println(detail);
	}

}
