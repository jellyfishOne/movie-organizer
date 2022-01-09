package movie_organizer.rest_service.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import movie_organizer.rest_service.web.model.Movie;

@Repository
public interface MoviesRepositry extends MongoRepository<Movie, String>{
	
	Optional<Movie> findById(String Id);
	Optional<Movie> findByTitle(String title);
	
}
