package movie_organizer.rest_service.web.services;

import java.util.List;

import movie_organizer.rest_service.web.model.MovieDto;
import movie_organizer.rest_service.web.model.MovieGenreEnum;

public interface MovieCollectionServices {
	MovieDto saveNewMovie(MovieDto newMovie);
	MovieDto getMovieWithId(String movieId); 
	MovieDto getMovieWithTitle(String movieTitle);
	List<MovieDto> getMoviesWithGenre(MovieGenreEnum genre);
	List<MovieDto> getMoviesWitActorFirstName(String FirstName);
}
