package day6.main;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import day6.entities.Movie;
import day6.utils.HibernateUtils;

public class HibernateRecordRetrievalExampleMain {

	public static void main(String[] args) {
		// This program fetches Movie record against its ID and displays the same
		
		try(
				SessionFactory hibernateFactory = HibernateUtils.getSessionFactory();
				Session hibernateSession = hibernateFactory.openSession()
				){
				Class<Movie> entityClass = Movie.class;
				Serializable identity = 102;//Serializable identity = new Integer(102);
				Movie foundMovie = 	hibernateSession.find(entityClass, identity);//Fetching Movie against its id: 102
				if(foundMovie != null)
					System.out.println(foundMovie);
				else
					System.out.println("Movie with the given ID does not exist.");
				
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
