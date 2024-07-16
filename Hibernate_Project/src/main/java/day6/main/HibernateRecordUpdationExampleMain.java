package day6.main;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import day6.entities.Movie;
import day6.utils.HibernateUtils;

public class HibernateRecordUpdationExampleMain {

	public static void main(String[] args) {
		// This program updates Movie record against its ID
		
		try(
				SessionFactory hibernateFactory = HibernateUtils.getSessionFactory();
				Session hibernateSession = hibernateFactory.openSession()
				){
				Class<Movie> entityClass = Movie.class;
				Serializable identity = 102;//Serializable identity = new Integer(102);
				Movie foundMovie = 	hibernateSession.find(entityClass, identity);//Fetching Movie against its id: 102
				Transaction hibernateTransaction = hibernateSession.beginTransaction();
					//Changing movie title and year
					foundMovie.setTitle("Speed 2");
					foundMovie.setReleaseYear(2001);
				hibernateTransaction.commit();
				System.out.println("Movie record updated successfully.");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
