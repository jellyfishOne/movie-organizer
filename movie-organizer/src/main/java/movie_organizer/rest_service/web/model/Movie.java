package movie_organizer.rest_service.web.model;

import java.time.LocalDate;
import java.util.List;

public class Movie {
	//Variables
	private String title;
	private MovieGenreEnum gengre;
	private LocalDate releaseDate;
	private int runTimeInMinutes;
	private MovieRatingEnum movieRating;
	private List<Actor> starring;
	private List<Director> director;
	private List<Screenwriter> screenwriter;
	private List<Producer> producer;
	private int myRating;
	private String myReview;
	
}
