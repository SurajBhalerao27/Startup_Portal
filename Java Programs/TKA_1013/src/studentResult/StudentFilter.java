package studentResult;

public class StudentFilter {

	int countAllFirstClass(Student s1, Student s2, Student s3, Student s4, Student s5) {
		int count = 0;
		if (s1.marks >= 60 && s1.marks <= 100) {
			count++;
		}
		if (s2.marks >= 60 && s2.marks <= 100) {
			count++;
		}
		if (s3.marks >= 60 && s3.marks <= 100) {
			count++;
		}
		if (s4.marks >= 60 && s4.marks <= 100) {
			count++;
		}
		if (s5.marks >= 60 && s5.marks <= 100) {
			count++;
		}
		return count;

	}
}
