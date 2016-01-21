package com.as.util;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
//import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtil {

	public static SessionFactory getFactory() {
		Configuration configuration = new Configuration().configure();
		ServiceRegistryBuilder builder = new ServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		SessionFactory sessionFactory = configuration
				.buildSessionFactory(builder.buildServiceRegistry());
		return sessionFactory;
	}
}
