package studentResult2;

import java.util.ArrayList;

public class StudentFilter {

	int countAllFirstClass(ArrayList<Student> list) {
		int count = 0;

		for (int i = 0; i < list.size(); i++) {
			Student student = list.get(i);
			if (student.marks >= 60  && student.marks<=100) {
				count++;
			}
		}
		return count;
	}

}
