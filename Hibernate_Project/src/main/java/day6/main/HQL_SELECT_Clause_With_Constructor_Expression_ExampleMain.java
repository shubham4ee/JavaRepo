package day6.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import day6.beans.MovieInfo;
import day6.entities.Movie;
import day6.utils.HibernateUtils;

public class HQL_SELECT_Clause_With_Constructor_Expression_ExampleMain {

	public static void main(String[] args) {
		try(
				SessionFactory hibernateFactory = HibernateUtils.getSessionFactory();
				Session hibernateSession = hibernateFactory.openSession()
				){
			//Building HQL query string for Constructor Expression
			String hqlQuery = "select new day6.beans.MovieInfo(m.title, m.releaseYear) from Movie m";
			Class<MovieInfo> beanClass = MovieInfo.class;
			Query<MovieInfo> queryRef = hibernateSession.createQuery(hqlQuery, beanClass);
			List<MovieInfo> movieInfoList = queryRef.getResultList();
			for(MovieInfo info : movieInfoList)
				System.out.println(info);
			
					
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
