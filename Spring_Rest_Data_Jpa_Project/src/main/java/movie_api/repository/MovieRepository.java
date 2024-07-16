package movie_api.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import movie_api.entities.Movie;


//No need to add @Repository because JpaRepository is already a Managed Component
//And therefore its sub-interface also becomes a Managed Component
public interface MovieRepository extends JpaRepository<Movie, Integer>{}


