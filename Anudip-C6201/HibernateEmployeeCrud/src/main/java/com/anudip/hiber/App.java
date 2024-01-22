package com.anudip.hiber;

import java.util.Scanner;

import com.anudip.hiber.daoimpl.EmployeeDaoImpl;

public class App {
	public static void main(String[] args) {
		char a;
		EmployeeDaoImpl impl = new EmployeeDaoImpl();
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please Enter Correct Option To Continue !");
			System.out.println(" 1  Add employee: ");
			System.out.println(" 2  Update emoloyee: ");
			System.out.println(" 3  Delete employee: ");
			System.out.println(" 4  Display all employee: ");
			System.out.println("Enter Choice: ");
			int input = scanner.nextInt();

			switch (input) {
			case 1: {
				impl.addEmployee();
				break;
			}
			case 2: {
				impl.updateEmployee();
				break;
			}
			case 3: {
				impl.deleteEmployee();
				break;
			}
			case 4: {
				impl.getEmployee();
				break;
			}
			case 5:
				System.exit(0);
				break;
			}
			System.out.println("Do you wanted to continue? press Y/N ");
			a = scanner.next().charAt(0);
			scanner.close();
		} while (a == 'Y' || a == 'y');
		System.out.println("Thanks !!!");
	}
}
