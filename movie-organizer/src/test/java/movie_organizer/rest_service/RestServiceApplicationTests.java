package movie_organizer.rest_service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import movie_organizer.rest_service.web.model.Actor;
import movie_organizer.rest_service.web.model.Director;
import movie_organizer.rest_service.web.model.MovieDto;
import movie_organizer.rest_service.web.model.MovieDto.MovieBuilder;
import movie_organizer.rest_service.web.model.MovieGenreEnum;
import movie_organizer.rest_service.web.model.MovieRatingEnum;
import movie_organizer.rest_service.web.model.Producer;
import movie_organizer.rest_service.web.model.Screenwriter;
import movie_organizer.rest_service.web.services.MovieCollectionServices;

@SpringBootTest
class RestServiceApplicationTests {
	
	@Autowired
	private MovieCollectionServices movieServices;
	private LocalDate dateNow = LocalDate.now();
	private List<Actor> actors = new ArrayList<Actor>();
	private List<Director> directors = new ArrayList<Director>();
	private List<Screenwriter> screenwriters = new ArrayList<Screenwriter>();
	private List<Producer> producer = new ArrayList<Producer>();
	private MovieBuilder movie;
	
	/*
	 * private Movie movie = Movie.builder() .id("1") .title("The Batman")
	 * .gengre(MovieGenreEnum.ACTION) .releaseDate(dateNow) .runTimeInMinutes(190)
	 * .movieRating(MovieRatingEnum.R_RESTRICTED) .starring(actors)
	 * .director(directors) .screenwriter(screenwriters) .producer(producer)
	 * .myRating(4) .myReview("very good, recomend");
	 */
	
	
	@Test
	void savedNewMovie() {
		 movie = MovieDto.builder()
				  .id("1")
				  .title("Test builder");
		MovieDto savedMovie = movieServices.saveNewMovie(movie);
	}
	
	
}
