package movie_organizer.rest_service.web.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import movie_organizer.rest_service.web.model.MovieDto;
import movie_organizer.rest_service.web.services.MovieCollectionServices;

@RestController
@RequestMapping("api/v1/movie-organizer")
public class MovieOrganizerController {
	
	private final MovieCollectionServices movieServices;
	
	public MovieOrganizerController( MovieCollectionServices movieServices) {
		this.movieServices = movieServices;
	}
	
	/*
	 * TODO Document function to Java Standards
	 */
	@PostMapping(value="/save-movie")
	public ResponseEntity<MovieDto> saveNewMovie(@Valid @RequestBody MovieDto movieDto){
		MovieDto savedMovie = movieServices.saveNewMovie(movieDto);
		return ResponseEntity.status(HttpStatus.OK).body(savedMovie);
	}
	

}
