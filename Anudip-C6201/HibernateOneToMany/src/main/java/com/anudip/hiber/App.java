package com.anudip.hiber;

import java.util.HashSet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		Parent parent = new Parent();
		parent.setPid(1);
		parent.setpName("Amitabh");
		parent.setChild(null);

		Child child = new Child(), child2 = new Child();
		child.setCid(1);
		child.setcName("Abhishek");

		child2.setCid(2);
		child2.setcName("Sakshi");

		session.save(child);
		session.save(child2);

		HashSet<Child> childset = new HashSet<Child>();

		childset.add(child);
		childset.add(child2);

		parent.setChild(childset);
		session.save(parent);

		tx.commit();
		System.out.println("Data added !!");
	}
}
