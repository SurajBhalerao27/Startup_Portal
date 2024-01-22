package practice;

import java.util.Scanner;

public class Studentdemoo {
	String name;
	int roll;
	int marks;

	public Studentdemoo(String name, int roll, int marks) {
		this.name = name;
		this.roll = roll;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Name of Student:" + name + " " + "Roll No:" + roll + " " + "Marks:" + marks;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name");
		String name = sc.nextLine();
		System.out.println("enter the roll");
		int roll = sc.nextInt();
		System.out.println("enter the marks");
		int marks = sc.nextInt();
		Student s1 = new Student(name, roll, marks);
		System.out.println(s1);
		sc.close();
	}
}