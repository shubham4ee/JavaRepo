package movie_api.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import movie_api.entities.Movie;
import movie_api.service.MovieService;

@RestController
public class MovieRestController {
	//This is a Restful Controller that provides end-points to work upon Movies data
	//It makes use of Service to handle further operations
	
	@Autowired //Injecting MovieService reference
	private MovieService movieServiceRef;
	
	
	//1 GET /movie-api -> Returns all the movies
	@GetMapping("/movie-api")
	public Collection<Movie> getAllMovies(){
		Collection<Movie> allMovies = movieServiceRef.getAllMovies();
		return allMovies;
	}
	
	//2  GET /movie-api/{ID}
	@GetMapping("/movie-api/{m_id}")
	public Movie getOneMovie(@PathVariable("m_id") Integer movieId) {
		Movie returnedMovie = movieServiceRef.getOneMovie(movieId);
		return returnedMovie;
	}
	
	//3 POST /movie-api
	@PostMapping("/movie-api")
	public void createNewMovie(@RequestBody Movie movieRef) {
		System.out.println("Accepted Movie : " + movieRef);
		movieServiceRef.insertNewMovie(movieRef);
	}
	

}


