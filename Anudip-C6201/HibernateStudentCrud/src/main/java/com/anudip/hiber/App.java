package com.anudip.hiber;

import java.util.Scanner;

import com.anudip.hiber.daoimpl.StudentDaoImpl;

public class App {
	public static void main(String[] args) {

		char a;
		StudentDaoImpl daoimpl = new StudentDaoImpl();

		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Student Registration");
			System.out.println("1. Add the Students: 2. Display all students : 3. Delete student: 4. Update student: ");
			System.out.println("Enter the choice");

			int ch = sc.nextInt();
			switch (ch) {
			case 1: {
				daoimpl.addStudent();
				break;
			}
			case 2: {
				daoimpl.getStudent();
				break;
			}
			case 3: {
				daoimpl.deleteStudent();
				break;
			}
			case 4: {
				daoimpl.updateStudent();
				break;
			}
			}
			System.out.println("Do you want to continue Y/N");
			a = sc.next().charAt(0);
		} while (a == 'Y' || a == 'y');
		System.out.println("Thanks!!!");
	}
}
