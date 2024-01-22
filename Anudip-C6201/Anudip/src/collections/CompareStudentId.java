package collections;

import java.util.Comparator;

public class CompareStudentId implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getSid().compareTo(o2.getSid());
	}
}
