package practice;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age");
        age = sc.nextInt();
        if (age < 18) {
			System.out.println("You are underage to drive");
		} else {
			System.out.println("You are eligible to apply for a driving license");
		}

        sc.close(); // Close the Scanner after using it.
    }
}
