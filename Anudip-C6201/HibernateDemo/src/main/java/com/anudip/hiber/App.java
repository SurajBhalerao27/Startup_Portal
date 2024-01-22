package com.anudip.hiber;

import java.util.ArrayList;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Configuration cfg = new Configuration(); // configuring the hibernate.cfg. xml
		cfg.configure("hibernate.cfg.xml");
		// craated a Session factory- once
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		// created a session
		Session session = sessionFactory.openSession();
		// created trabsaction
		Transaction transaction = session.beginTransaction();

		ArrayList<Employee> listOfEmp = new ArrayList<>();

		for (int i = 0; i < 2; i++) {
			Employee emp = new Employee();
			System.out.println("Enter ID: ");
			int id = scanner.nextInt();
			System.out.println("Enter Name: ");
			String name = scanner.next();
			System.out.println("Enter Designation: ");
			String designation = scanner.next();
			System.out.println("Enter Salary: ");
			int salary = scanner.nextInt();
			System.out.println();
			emp.setId(id);
			emp.setName(name);
			emp.setDesig(designation);
			emp.setSal(salary);
			listOfEmp.add(emp);
		}

		for (Employee employee : listOfEmp) {
			session.save(employee);
		}

		System.out.println("Employee Add hua");
		transaction.commit();
		session.close();
	}
}
