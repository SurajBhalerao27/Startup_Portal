package com.practice.hiber;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		List<Student> studentList = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			Student student = new Student();
			System.out.println("First Name ?");
			String fname = scanner.next();
			System.out.println("Last Name ?");
			String lname = scanner.next();
			System.out.println("Full Address ?");
			String addresss = scanner.next();
			System.out.println("Primary Email ?");
			String mail = scanner.next();
			System.out.println("Course Name ?");
			String course = scanner.next();
			System.out.println("Total Marks Obtained ?");
			int marks = scanner.nextInt();
			System.out.println();
			student.setFirstName(fname);
			student.setLastName(lname);
			student.setAddress(addresss);
			student.setEmail(mail);
			student.setCourseName(course);
			student.setTotalMarks(marks);
			studentList.add(student);
		}
		for (Student student : studentList) {
			session.save(student);
		}
		System.out.println("Data added Successfully!");
		transaction.commit();
		session.close();
	}
}
