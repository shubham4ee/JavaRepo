package day6.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import day6.entities.Movie;
import day6.utils.HibernateUtils;

public class HQL_SELECT_Clause_ExampleMain {

	public static void main(String[] args) {
		try(
				SessionFactory hibernateFactory = HibernateUtils.getSessionFactory();
				Session hibernateSession = hibernateFactory.openSession()
				){
			//Building HQL query string
			String hqlQuery = "select m.title, m.releaseYear from Movie m";
			
			Query<Object []> queryRef = hibernateSession.createQuery(hqlQuery, Object[].class);
			List<Object[]> values = queryRef.getResultList();
			for(Object[] data : values) {
				System.out.println("Title: " + data[0] + ", Release Year: " + data[1]);
			}			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
