package com.anudip.hiber.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.AvailableSettings;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.anudip.hiber.entity.Student;

public class HibernateUtil {

	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {

		if (sessionFactory == null) {
			try {
				Properties settings = new Properties();
				settings.put(AvailableSettings.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
				settings.put(AvailableSettings.DRIVER, "com.mysql.cj.jdbc.Driver");
				settings.put(AvailableSettings.URL, "jdbc:mysql://localhost:3306/anudip");
				settings.put(AvailableSettings.USER, "root");
				settings.put(AvailableSettings.PASS, "root");
				settings.put(AvailableSettings.HBM2DDL_AUTO, "update");
				settings.put(AvailableSettings.SHOW_SQL, "true");

				Configuration cfg = new Configuration().setProperties(settings).addAnnotatedClass(Student.class);

				ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
						.applySettings(cfg.getProperties()).build();

				sessionFactory = cfg.buildSessionFactory(serviceRegistry);

			} catch (Exception ex) {
				System.out.println("Error exists!!");
			}
		}
		return sessionFactory;

	}
}
