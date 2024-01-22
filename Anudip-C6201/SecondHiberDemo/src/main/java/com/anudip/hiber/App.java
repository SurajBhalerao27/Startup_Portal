package com.anudip.hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		Student student = new Student(), student2 = new Student();
		student.setId(1);
		student.setName("Suraj");
		student.setAge("27");
		student.setCourse("Java");

		student2.setId(2);
		student2.setName("Poms");
		student2.setAge("23");
		student2.setCourse("Python");

		session.save(student);
		session.save(student2);
		tx.commit();
		session.close();
		System.out.println("Data Added Successfully !");
	}
}
