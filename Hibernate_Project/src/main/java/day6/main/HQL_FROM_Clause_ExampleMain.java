package day6.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import day6.entities.Movie;
import day6.utils.HibernateUtils;

public class HQL_FROM_Clause_ExampleMain {

	public static void main(String[] args) {
		try(
				SessionFactory hibernateFactory = HibernateUtils.getSessionFactory();
				Session hibernateSession = hibernateFactory.openSession()
				){
			//Building HQL query string
			String hqlQuery = "from Movie m";
			//Obtaining a reference of type 'Query'
			Class<Movie> entityClass = Movie.class;
			Query<Movie> queryRef = 	hibernateSession.createQuery(hqlQuery, entityClass);
			List<Movie> movieList = queryRef.getResultList();//Returns a List holding Movie objects.
			//Traversing over the list
			for(Movie currentMovie : movieList)
				System.out.println(currentMovie.getTitle());
			
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
