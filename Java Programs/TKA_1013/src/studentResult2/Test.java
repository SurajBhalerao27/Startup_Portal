package studentResult2;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		Student s1 = new Student();s1.Roll_No = 1; s1.name = "Suraj";s1.marks = 45;
		Student s2 = new Student();s2.Roll_No = 2; s2.name = "Rahul";s2.marks = 56;
		Student s3 = new Student();s3.Roll_No = 3; s3.name = "Snehal";s3.marks = 86;
		Student s4 = new Student();s4.Roll_No = 4; s4.name = "Akash";s4.marks = 85.23f;
		Student s5 = new Student();s5.Roll_No = 5; s5.name = "Shraddha";s5.marks = 75;

		ArrayList<Student> studList =new  ArrayList<>();
		studList.add(s1);
		studList.add(s2);
		studList.add(s3);
		studList.add(s4);
		studList.add(s5);

		StudentFilter sfilter = new StudentFilter();
		int res = sfilter.countAllFirstClass(studList);
		System.out.println("The Student With First Class: " +res);
	}

}
