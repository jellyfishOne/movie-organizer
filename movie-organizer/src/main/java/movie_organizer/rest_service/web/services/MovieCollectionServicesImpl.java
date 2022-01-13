package movie_organizer.rest_service.web.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import movie_organizer.rest_service.repositories.MovieRepository;
import movie_organizer.rest_service.web.model.MovieDto;
import movie_organizer.rest_service.web.model.MovieGenreEnum;

@Service
public class MovieCollectionServicesImpl implements MovieCollectionServices{
	
	@Autowired
	MovieRepository movieRepo;
	
	@Override
	public MovieDto saveNewMovie(MovieDto newMovie) {
		//TODO Validate movie object
		movieRepo.save(newMovie);
		return newMovie;
	}

	@Override
	public Optional<MovieDto> getMovieWithId(String movieId) {
		return movieRepo.findById(movieId);
	}

	@Override
	public Optional<MovieDto>  getMovieWithTitle(String movieTitle) {
		return movieRepo.findByTitle(movieTitle);
	}

	@Override
	public List<MovieDto> getMoviesWithGenre(MovieGenreEnum genre) {
		return movieRepo.findAll(genre);
	}

	@Override
	public List<MovieDto> getMoviesWitActorFirstName(String firstName) {
		return movieRepo.findByStarring(firstName);
	}

}
