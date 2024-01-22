/*
 * create a class which is has instance variable roo_no and name.
 * Student class has a method attendSession which prints "Student is attending the session."
 * create a child class Student_name;
 * when we call attenSession from studentName class it should specify that studend is attending online.
 * */
package polymorphisms;

class Student {
	public int roll_no;
	public String name;

	void attendSession() {
		System.out.println("Student is attending the session...");
	}

}

class Suraj extends Student {
	@Override
	// Here we override the method.
	void attendSession() {
		System.out.println("Student is attending online...");
	}
}

public class MethodOverPract {

	public static void main(String[] args) {
		Suraj suraj = new Suraj();
		suraj.attendSession();

	}

}
