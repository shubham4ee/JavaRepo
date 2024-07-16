package movie_api.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import movie_api.entities.Movie;
import movie_api.repository.MovieRepository;


@Service//Marks this class as a Service
public class MovieService {
	//This makes use of MovieRepository to get the data and may process that data.
	@Autowired //Injecting MovieRepository reference
	private MovieRepository movieRepositoryRef;
	
	public Collection<Movie> getAllMovies(){
		List<Movie> movieList = movieRepositoryRef.findAll();
		return movieList;
	}
	
	public Movie getOneMovie(Integer id) {
		Movie foundMovie = null;
		Optional<Movie> movieOptional = movieRepositoryRef.findById(id);
		if(!movieOptional.isEmpty())
			foundMovie = movieOptional.get();
		return foundMovie;
	}
	
	public void insertNewMovie(Movie mv) {
		movieRepositoryRef.save(mv);
	}
	
}






