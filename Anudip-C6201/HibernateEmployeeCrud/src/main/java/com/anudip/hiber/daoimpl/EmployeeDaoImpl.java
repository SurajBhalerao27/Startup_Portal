package com.anudip.hiber.daoimpl;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.anudip.hiber.config.HibernateUtil;
import com.anudip.hiber.dao.EmployeeDao;
import com.anudip.hiber.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	Scanner scanner = new Scanner(System.in);
	public void addEmployee() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		String empName, surname, designation;
		long phone;
		System.out.println("Enter First Name: ");
		empName = scanner.next();

		System.out.println("Enter Last Name: ");
		surname = scanner.next();

		System.out.println("Enter Designation: ");
		designation = scanner.next();

		System.out.println("Enter Mobile Number: ");
		phone = scanner.nextLong();

		Employee emp = new Employee();
		emp.setEmpName(empName);
		emp.setSurname(surname);
		emp.setDesignation(designation);
		emp.setPhone(phone);

		session.save(emp);
		tx.commit();
		session.close();
		System.out.println("Data added !!!");
	}

	public void updateEmployee() {
		System.out.println("Enter Employee ID to update: ");
		int empId = scanner.nextInt();

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();

		Employee emp = session.get(Employee.class, empId);
		if (emp != null) {
			System.out.println("Enter new First Name: ");
			String newFirstName = scanner.next();
			emp.setEmpName(newFirstName);

			System.out.println("Enter new Last Name: ");
			String newLastName = scanner.next();
			emp.setSurname(newLastName);

			System.out.println("Enter new Designation: ");
			String newDesignation = scanner.next();
			emp.setDesignation(newDesignation);

			System.out.println("Enter new Mobile Number: ");
			long newMobile = scanner.nextLong();
			emp.setPhone(newMobile);

			session.update(emp);
			tx.commit();
			System.out.println("Employee updated successfully!");
		} else {
			System.err.println("Employee not found!");
		}

		session.close();
	}

	public void deleteEmployee() {
		System.out.println("Enter Employee ID to delete: ");
		int empId = scanner.nextInt();

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();

			Employee emp = session.get(Employee.class, empId);
			if (emp != null) {
				session.delete(emp);
				tx.commit();
				System.out.println("Employee deleted successfully!");
			} else {
				System.out.println("Employee not found!");
			}
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	public void getEmployee() {
		System.out.println("Enter Employee ID to display: ");
		int empId = scanner.nextInt();

		Session session = HibernateUtil.getSessionFactory().openSession();

		try {
			Employee emp = session.get(Employee.class, empId);
			if (emp != null) {
				System.out.println(emp);
			} else {
				System.out.println("Employee not found!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

	}

}
