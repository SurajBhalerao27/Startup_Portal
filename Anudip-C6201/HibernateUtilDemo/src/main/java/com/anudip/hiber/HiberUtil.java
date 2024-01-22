package com.anudip.hiber;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

public class HiberUtil {

	public static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null)
			try {
				Properties properties = new Properties();
				properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
				properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
				properties.put(Environment.URL, "jdbc:mysql://localhost:3306/anudip");
				properties.put(Environment.USER, "root");
				properties.put(Environment.PASS, "root");
				properties.put(Environment.HBM2DDL_AUTO, "update");
				properties.put(Environment.SHOW_SQL, "true");

				Configuration configuration = new Configuration().setProperties(properties)
						.addAnnotatedClass(Employee.class);

				ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
						.applySettings(configuration.getProperties()).build();

				sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			} catch (Exception e) {
				System.err.println("Error");
			}

		return sessionFactory;
	}
}
