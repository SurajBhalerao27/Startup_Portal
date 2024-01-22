package practice;

import java.util.Scanner;

class Student {
    String name;
    int roll;
    int marks;

    public Student(String name2, int roll2, int marks2) {
		// TODO Auto-generated constructor stub
	}

	void input() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Your Name | Roll_no | Marks");
            name = sc.nextLine();
            roll = sc.nextInt();
            marks = sc.nextInt();

        }
    }

    void show() {
        System.out.println("Name = " + name + " Roll_no = " + roll + " Marks = " + marks);

    }
}

public class Studentdemo {
    public static void main(String[] args) {
        String Suraj = null;
		Student student = new Student(Suraj, 7, 85);
        student.input();
        student.show();
    }
}
