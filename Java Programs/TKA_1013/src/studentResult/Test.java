package studentResult;

public class Test {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.Roll_No = 1;
		s1.name = "Suraj";
		s1.marks = 900;
		Student s2 = new Student();
		s2.Roll_No = 2;
		s2.name = "Rahul";
		s2.marks = 80;
		Student s3 = new Student();
		s3.Roll_No = 3;
		s3.name = "Snehal";
		s3.marks = 86;
		Student s4 = new Student();
		s4.Roll_No = 4;
		s4.name = "Akash";
		s4.marks = 62;
		Student s5 = new Student();
		s5.Roll_No = 5;
		s5.name = "Shraddha";
		s5.marks = 75;

		StudentFilter sfilter = new StudentFilter();
		int res = sfilter.countAllFirstClass(s1, s2, s3, s4, s5);
		System.out.println("The Student With First Class: " + res);
	}

}
