package com.anudip.hiber.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.anudip.hiber.entity.Employee;

public class HibernateUtil {
	public static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null)
			try {
				Properties settings = new Properties();
				settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
				settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
				settings.put(Environment.URL, "jdbc:mysql://localhost:3306/anudip");
				settings.put(Environment.USER, "root");
				settings.put(Environment.PASS, "root");
				settings.put(Environment.HBM2DDL_AUTO, "create");
				settings.put(Environment.SHOW_SQL, "true");

				Configuration configuration = new Configuration().setProperties(settings)
						.addAnnotatedClass(Employee.class);

				ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
						.applySettings(configuration.getProperties()).build();

				sessionFactory = configuration.buildSessionFactory(serviceRegistry);

			} catch (Exception e) {
				System.err.println("Error !!");
			}
		return sessionFactory;
	}
}
