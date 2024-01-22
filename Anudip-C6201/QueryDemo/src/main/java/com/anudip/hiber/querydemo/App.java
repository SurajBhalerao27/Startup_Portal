package com.anudip.hiber.querydemo;

import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class App {
	public static void main(String[] args) {

		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory = meta.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		Employee emp = new Employee();
		emp.setEmpName("Gevanand");
		emp.setSurname("Barbate");
		emp.setDesignation("Chaprasi");
		emp.setPhone(9213214560L);

		TypedQuery query = session.getNamedQuery("findEmployeeByName");
		query.setParameter("empName", "Gevanand");
		List<Employee> employeeList = query.getResultList();
		Iterator<Employee> itr = employeeList.iterator();
		while (itr.hasNext()) {
			Employee e = itr.next();
			System.out.println(e);
		}
		session.save(emp);
		session.close();
	}
}
