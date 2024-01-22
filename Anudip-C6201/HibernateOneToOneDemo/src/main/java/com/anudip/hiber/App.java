package com.anudip.hiber;

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

		Wife wife = new Wife();
		Husband husband = new Husband();

		husband.setHid(1);
		husband.sethName("Amitabh");
		husband.setWife(wife);

		wife.setWid(1);
		wife.setwName("Pradnya");
		wife.setHusband(husband);

		session.save(husband);
		session.save(wife);
		tx.commit();
		session.close();
		System.out.println("Data added !!!");
	}
}
