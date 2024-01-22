package com.anudip.hiber.daoimpl;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.anudip.hiber.config.HibernateUtil;
import com.anudip.hiber.dao.StudentDao;
import com.anudip.hiber.entity.Student;

public class StudentDaoImpl implements StudentDao {
	Scanner sc = new Scanner(System.in);

	@Override
	public void addStudent() {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();

		String stName, email;
		long phone;
		String course;

		System.out.println("Enter the full name: ");
		stName = sc.nextLine();
		System.out.println("Enter the email: ");
		email = sc.nextLine();
		System.out.println("Enter the mobile number: ");
		phone = sc.nextLong();
		System.out.println("Enter the course name: ");
		course = sc.next();

		Student st = new Student();
		st.setStName(stName);
		st.setEmail(email);
		st.setPhone(phone);
		st.setCourse(course);

		session.save(st);
		tx.commit();
		session.close();
		System.out.println("Student added successfully!!!");

	}

	@Override
	public void deleteStudent() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();

		System.out.println("Enter the student ID to delete: ");
		int stId = sc.nextInt();

		Student st = session.get(Student.class, stId);
		if (st != null) {
			session.delete(st);
			tx.commit();
			System.out.println("Student deleted successfully!");
		} else {
			System.err.println("Student not found with ID: " + stId);
		}
		session.close();
	}

	@Override
	public void updateStudent() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();

		System.out.println("Enter the student ID to update: ");
		int stId = sc.nextInt();

		Student st = session.get(Student.class, stId);
		if (st != null) {
			System.out.println("Enter the full name: ");
			String newstName = sc.next();
			st.setStName(newstName);

			System.out.println("Enter the email: ");
			String newemail = sc.next();
			st.setEmail(newemail);

			System.out.println("Enter the course name: ");
			String newCourse = sc.next();
			st.setCourse(newCourse);

			System.out.println("Enter the phone number: ");
			Long newphone = sc.nextLong();
			st.setPhone(newphone);

			session.update(st);
			tx.commit();
			System.out.println("Student updated successfully!");
		} else {
			System.err.println("Student not found with ID: " + stId);
		}
		session.close();
	}

	@Override

	public void getStudent() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		try {
			System.out.println("Enter the student ID to retrieve details: ");
			int stId = sc.nextInt();
			Student st = session.get(Student.class, stId);
			if (st != null) {
				System.out.println("Student details:");
				System.out.println("ID: " + st.getStId());
				System.out.println("Name: " + st.getStName());
				System.out.println("Email: " + st.getEmail());
				System.out.println("Course: " + st.getCourse());
				System.out.println("Phone: " + st.getPhone());
			} else {
				System.err.println("Student not found with ID: " + stId);
			}
			session.close();
		} catch (Exception e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
	}
}
