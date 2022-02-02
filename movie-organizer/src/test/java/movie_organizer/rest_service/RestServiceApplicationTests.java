package movie_organizer.rest_service;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import movie_organizer.rest_service.web.model.Actor;
import movie_organizer.rest_service.web.model.Director;
import movie_organizer.rest_service.web.model.MovieDto;
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
	private List<Actor> actors;
	private Actor actor;	
	private List<Director> directors;
	private Director director;
	private List<Screenwriter> screenwriters;
	private Screenwriter screenwriter;
	private List<Producer> producers;
	private Producer producer;
	private MovieDto movie; 
	
	@BeforeEach
	void init(){
		actors = new ArrayList<Actor>();
		actor = Actor.builder()
				 .firtName("firtName")
				 .surName("SurName").build();
		actors.add(actor);
		directors = new ArrayList<Director>();
		director = Director.builder()
							.firstName("FIrstName")
							.lastName("Last Name").build();
		directors.add(director);
		screenwriters = new ArrayList<Screenwriter>();
		screenwriter = Screenwriter.builder()
				.firstName("FIrstName")
				.lastName("Last Name").build();
		screenwriters.add(screenwriter);
		producers = new ArrayList<Producer>();
		producer = Producer.builder()
				.firstName("FIrstName")
				.lastName("Last Name").build();
		producers.add(producer);
		movie =  MovieDto.builder()
				.id("1")
				.title("The Batman")
				.genre(MovieGenreEnum.ACTION) 
				.releaseDate(dateNow) 
				.runTimeInMinutes(190)
				.movieRating(MovieRatingEnum.R_RESTRICTED) 
				.starring(actors)
				.director(directors) 
				.screenwriter(screenwriters) 
				.producer(producers)
				.myRating(4) .myReview("very good, recomend").build();
	}
	 
	@Test
	void savedNewMovie() {
		MovieDto savedMovie = movieServices.saveNewMovie(movie);
		assertNotNull(savedMovie);
	}
	
	@Test
	void getMovieWIthId() {
		Optional<MovieDto> movieById = movieServices.getMovieWithId(movie.getId());
		assertNotNull(movieById);
	}
	
	@Test
	void getMovieWtihTitle() {
		Optional<MovieDto> movieByTitle = movieServices.getMovieWithId(movie.getTitle());
		assertNotNull(movieByTitle);
	}
	
	@Test
	void getMoviesWithGenre() {
		List<MovieDto> moviesWithGenre = movieServices.getMoviesWithGenre(MovieGenreEnum.ACTION);
		assertNotNull(moviesWithGenre);
	}
	
	@Test
	void getMoviesWithActorFirstName() {
		List<MovieDto> moviesWithActorFirstName = movieServices.getMoviesWitActorFirstName("FirstName");
		assertNotNull(moviesWithActorFirstName);
	}
	
}
