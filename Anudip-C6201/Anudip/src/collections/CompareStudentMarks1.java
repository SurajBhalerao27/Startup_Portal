package collections;

import java.util.Comparator;

public class CompareStudentMarks1 implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.getTotalMarks().compareTo(o2.getTotalMarks());
	}	

}

