package com.anudip.hiber;

import java.util.ArrayList;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class App {
	public static void main(String[] args) {
		Session session = HiberUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		try {
			Scanner scanner = new Scanner(System.in);
			ArrayList<Employee> listOfEmp = new ArrayList<>();

			for (int i = 0; i < 2; i++) {
				Employee emp = new Employee();

				System.out.println("Enter ID: ");
				int id = scanner.nextInt();

				System.out.println("Enter Name: ");
				String name = scanner.next();

				System.out.println("Enter Sunname: ");
				String surName = scanner.next();

				System.out.println("Enter Designation: ");
				String designation = scanner.next();

				System.out.println("Enter Mobile: ");
				long mobile = scanner.nextLong();

				emp.setEmpId(id);
				emp.setEmpName(name);
				emp.setSurname(surName);
				emp.setDesignation(designation);
				emp.setPhone(mobile);

				listOfEmp.add(emp);
			}

			for (Employee employee : listOfEmp) {
				session.save(employee);
			}
			tx.commit();
			session.close();
			System.out.println("data added successfully!!!");
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
