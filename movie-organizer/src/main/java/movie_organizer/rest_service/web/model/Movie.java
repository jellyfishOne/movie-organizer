package movie_organizer.rest_service.web.model;

import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Document(collection ="movies")
public class Movie {
	@Id
	@Null
	private String  id;
	
	@NotBlank
	private String title;
	
	@NotNull
	private MovieGenreEnum gengre;
	
	@NotNull
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
