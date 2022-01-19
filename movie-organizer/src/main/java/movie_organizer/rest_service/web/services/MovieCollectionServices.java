package movie_organizer.rest_service.web.services;

import java.util.List;
import java.util.Optional;

import movie_organizer.rest_service.web.model.MovieDto;
import movie_organizer.rest_service.web.model.MovieGenreEnum;

public interface MovieCollectionServices {
	MovieDto saveNewMovie(MovieDto newMovie);
	
	Optional<MovieDto> getMovieWithId(String movieId); 
	Optional<MovieDto> getMovieWithTitle(String movieTitle);
	//List<MovieDto> getMoviesWithGenre(MovieGenreEnum genre);
	List<MovieDto> getMoviesWitActorFirstName(String firstName);
}
