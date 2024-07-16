package movie_rest_api.repository;

import java.util.Collection;

import org.springframework.stereotype.Repository;

import movie_rest_api.entities.Movie;
import movie_rest_api.store.MovieStore;

@Repository//Marks this class as a Repository
public class MovieRepository {
	public Collection<Movie> getAllMovies(){
		//This method loads all movies from MovieStore and returns them
		Collection<Movie> allRetrievedMovies = MovieStore.getAllMovies();
		return allRetrievedMovies;		
	}
	
	public Movie getOneMovie(Integer id) {
		//This method loads one movie from MovieStore against its ID and returns it.
		Movie retrievedMovie = MovieStore.getOneMovieById(id);
		return retrievedMovie;
	}
	
	public void addNewMovie(Movie movieRef) {
		//This method sends the movie to MovieStore for further addition
		MovieStore.createNewMovie(movieRef);
	}
}


