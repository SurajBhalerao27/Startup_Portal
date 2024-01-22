package collections;

import java.util.ArrayList;
import java.util.Collections;

public class StudentTest {

	public static void main(String[] args) {
		
		ArrayList<Student> slist = new ArrayList<Student>();
		slist.add(new Student(101, "Kartik", "kartikpawar301@gmail.com", 88.40, 22));
		slist.add(new Student(105, "Bipin", "bipinpawar2gmail.com", 70.00, 26));
		slist.add(new Student(102, "Srushti", "srushtigarudkar@gmail.com", 92.36, 22));
		slist.add(new Student(104, "Pranjali", "pranjaliburke19@gmail.com", 80.20, 21));
		slist.add(new Student(103, "Shubham", "shubham27hole@gmail.com", 60.22, 24));
		
		System.out.println("Before Sorting: " + slist);
		
		Collections.sort(slist, new CompareStudentId());
		
		System.out.println("Sorting id wise: " + slist);
		
		Collections.sort(slist, new CompareStudentName());
		
		System.out.println("Sorting name wise: " + slist);
		
		Collections.sort(slist, new CompareStudentMarks());
		
		System.out.println("Sorting marks wise: " + slist);
	}

}
