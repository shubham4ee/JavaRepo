package movie_rest_api.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import movie_rest_api.entities.Movie;
import movie_rest_api.service.MovieService;

@RestController
public class MovieRestController {
	//This is a Restful Controller that provides end-points to work upon Movies data
	//It makes use of Service to handle further operations
	
	@Autowired //Injecting MovieService reference
	private MovieService movieServiceRef;
	
	
	//1 GET /movie-api -> Returns all the movies
	@RequestMapping("/movie-api")
	public Collection<Movie> getAllMovies(){
		Collection<Movie> allMovies = movieServiceRef.getAllMovies();
		return allMovies;
	}
	
	//2  GET /movie-api/{ID}
	@RequestMapping("/movie-api/{m_id}")
	public Movie getOneMovie(@PathVariable("m_id") Integer movieId) {
		Movie returnedMovie = movieServiceRef.getSingleMovie(movieId);
		return returnedMovie;
	}
	
	//3 POST /movie-api
	@RequestMapping(value = "/movie-api", method = RequestMethod.POST)
	public void createNewMovie(@RequestBody Movie movieRef) {
		System.out.println("Accepted Movie : " + movieRef);
		movieServiceRef.insertNewMovie(movieRef);
	}
	

}


