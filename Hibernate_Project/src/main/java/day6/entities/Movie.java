package day6.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity//Marks this class as a JPA Entity
@Table(name = "Movie_Master")//Maps this class to the database table
public class Movie {
	@Id//Marks this field as an identity.
	@Column(name = "movie_id")
	private int movieId;
	@Column(name = "movie_title", length = 50)
	private String title;
	@Column(name = "movie_genre", length = 25)
	private String genre;
	@Column(name = "movie_year")
	private int releaseYear;
	public Movie() {
		// TODO Auto-generated constructor stub
	}
	public Movie(int movieId, String title, String genre, int releaseYear) {
		super();
		this.movieId = movieId;
		this.title = title;
		this.genre = genre;
		this.releaseYear = releaseYear;
	}
	
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", title=" + title + ", genre=" + genre + ", releaseYear=" + releaseYear
				+ "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(genre, movieId, releaseYear, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		return Objects.equals(genre, other.genre) && movieId == other.movieId && releaseYear == other.releaseYear
				&& Objects.equals(title, other.title);
	}

}
