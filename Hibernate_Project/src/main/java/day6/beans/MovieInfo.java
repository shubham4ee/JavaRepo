package day6.beans;

public class MovieInfo {
	private String movieTitle;
	private int movieYear;
	public MovieInfo() {
		// TODO Auto-generated constructor stub
	}
	public MovieInfo(String movieTitle, int movieYear) {
		super();
		this.movieTitle = movieTitle;
		this.movieYear = movieYear;
	}
	public String getMovieTitle() {
		return movieTitle;
	}
	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}
	public int getMovieYear() {
		return movieYear;
	}
	public void setMovieYear(int movieYear) {
		this.movieYear = movieYear;
	}
	@Override
	public String toString() {
		return "MovieInfo [movieTitle=" + movieTitle + ", movieYear=" + movieYear + "]";
	}

}
