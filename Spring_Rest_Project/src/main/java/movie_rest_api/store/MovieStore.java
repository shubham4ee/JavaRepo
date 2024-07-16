package movie_rest_api.store;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import movie_rest_api.entities.Movie;

public class MovieStore {
	//This class is meant for maintaining Movie Data Store
	private static Map<Integer, Movie> movieMap;
	static {
		movieMap = new HashMap<Integer, Movie>();
		Movie m1 = new Movie(101, "Mr. India", "Fantasy", 1988);
		Movie m2 = new Movie(102, "Evil Dead", "Horror", 1988);
		Movie m3 = new Movie(103, "Speed", "Thriller", 1997);
		movieMap.put(m1.getMovieId(), m1);
		movieMap.put(m2.getMovieId(), m2);
		movieMap.put(m3.getMovieId(), m3);
	}
	
	public static Collection<Movie> getAllMovies(){
		Collection<Movie> allAvailableMovies = 	movieMap.values();
		return allAvailableMovies;
	}
	public static Movie getOneMovieById(Integer id) {
		Movie foundMovie = movieMap.get(id);
		return foundMovie;
	}
	public static void createNewMovie(Movie newMovie) {
		movieMap.put(newMovie.getMovieId(), newMovie);
	}
}





