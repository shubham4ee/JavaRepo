package day5.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import day5.entities.Course;

public class HibernateRecordInsertionExampleMain {

	public static void main(String[] args) {
		//Configuring Hibernate
		Configuration hibernateConfig = new Configuration();
		hibernateConfig = hibernateConfig.configure();
		
		//Obtaining SessionFactory
		SessionFactory hibernateFactory = hibernateConfig.buildSessionFactory();
		
		//Obtaining Session
		Session hibernateSession = hibernateFactory.openSession();
		
		//Creating Entity Class Object
		Course courseObject = new Course(103, "Vue", 40, 10000, "Udemy");
		
		//Obtaining and Starting the Transaction
		Transaction hibernateTransaction = 	hibernateSession.beginTransaction();
				//Storing the entity class object
				hibernateSession.persist(courseObject);//Results into Record Insertion
		//Committing the transaction
		hibernateTransaction.commit();
		
		//Closing the Session
		hibernateSession.close();
		
		//Closing the SessionFactory
		hibernateFactory.close();
		System.out.println("Record inserted successfully...");
	}

}







