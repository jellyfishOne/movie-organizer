package movie_organizer.rest_service.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import movie_organizer.rest_service.web.model.MovieDto;
import movie_organizer.rest_service.web.model.MovieGenreEnum;

@Repository
public interface MovieRepository extends MongoRepository<MovieDto, String>{
	
	Optional<MovieDto> findById(String Id);
	Optional<MovieDto> findByTitle(String title);
	List<MovieDto> findAll(MovieGenreEnum genre);
	
	List<MovieDto> findByStarring(String firstName);
	
}
