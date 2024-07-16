package movie_rest_api.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import movie_rest_api.entities.Movie;
import movie_rest_api.repository.MovieRepository;
@Service//Marks this class as a Service
public class MovieService {
	//This makes use of MovieRepository to get the data and may process that data.
	@Autowired //Injecting MovieRepository reference
	private MovieRepository movieRepositoryRef;
	
	public Collection<Movie> getAllMovies(){
		//Talks to MovieRepository to get all movies and returns them
		Collection<Movie> allLoadedMovies = movieRepositoryRef.getAllMovies();
		return allLoadedMovies;
	}
	
	public Movie getSingleMovie(Integer id) {
		//Talks to MovieRepository to get single movie against its ID and returns it.
		Movie loadedMovie = movieRepositoryRef.getOneMovie(id);
		return loadedMovie;
	}
	
	public void insertNewMovie(Movie mv) {
		//Talks to MovieRepository to add a new movie
		movieRepositoryRef.addNewMovie(mv);
	}
	
}






