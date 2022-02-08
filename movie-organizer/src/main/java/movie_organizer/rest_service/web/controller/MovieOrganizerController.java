package movie_organizer.rest_service.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
	

}
