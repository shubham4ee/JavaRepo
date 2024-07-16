package day6.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import day6.entities.Movie;
import day6.utils.HibernateUtils;

public class HibernateRecordInsetionExampleMain {

	public static void main(String[] args) {
		try(
				SessionFactory hibernateFactory = HibernateUtils.getSessionFactory();
				Session hibernateSession = hibernateFactory.openSession()
				){
			Movie m1 = new Movie(103, "Bhoot", "Horror", 2004);
			Transaction hibernateTransaction = hibernateSession.beginTransaction();
				hibernateSession.persist(m1);
			hibernateTransaction.commit();
			System.out.println("Movie record added successfully.");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}








