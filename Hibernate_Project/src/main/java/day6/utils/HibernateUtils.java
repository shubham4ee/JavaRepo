package day6.utils;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import day6.entities.Movie;

public class HibernateUtils {

	public static SessionFactory getSessionFactory() {
		//This method builds a SessionFactory using Configuration and returns the same.
		Configuration hibernateConfig = new Configuration();
		//Building the 'Properties' object
		Properties configProperties = new Properties();
		//Adding the properties
		configProperties.put("hibernate.connection.url", "jdbc:mysql://localhost:3306/training");
		configProperties.put("hibernate.connection.username", "root");
		configProperties.put("hibernate.connection.password", "root");
		configProperties.put("hibernate.show_sql", "true");
		configProperties.put("hibernate.hbm2ddl.auto", "update");
		
		//Setting these properties with Configuration
		hibernateConfig.setProperties(configProperties);
		
		//Registering the entity class: Movie with the 'Configuration'
		/*
		 * Class<Movie> entityClass = Movie.class;
		 * hibernateConfig.addAnnotatedClass(entityClass);
		*/
		hibernateConfig.addAnnotatedClass(Movie.class);
		
		SessionFactory hibernateFactory = hibernateConfig.buildSessionFactory();
		
		return hibernateFactory;
	}

}










