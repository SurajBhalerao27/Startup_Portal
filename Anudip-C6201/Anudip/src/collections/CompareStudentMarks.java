package collections;

import java.util.Comparator;

public class CompareStudentMarks implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getTotalMarks().compareTo(o2.getTotalMarks());
	}
}
