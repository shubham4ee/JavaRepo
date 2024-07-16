package day6.main;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import day6.entities.Movie;
import day6.utils.HibernateUtils;

public class HibernateRecordDeletionExampleMain {

	public static void main(String[] args) {
		// This program deletes Movie record against its ID
		
		try(
				SessionFactory hibernateFactory = HibernateUtils.getSessionFactory();
				Session hibernateSession = hibernateFactory.openSession()
				){
				Class<Movie> entityClass = Movie.class;
				Serializable identity = 102;//Serializable identity = new Integer(102);
				Movie foundMovie = 	hibernateSession.find(entityClass, identity);//Fetching Movie against its id: 102
				Transaction hibernateTransaction = hibernateSession.beginTransaction();
					//Removing Movie
					hibernateSession.remove(foundMovie);//Performing removal
				hibernateTransaction.commit();
				System.out.println("Movie record deleted successfully.");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
