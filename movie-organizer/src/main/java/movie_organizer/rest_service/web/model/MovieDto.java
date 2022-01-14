package movie_organizer.rest_service.web.model;

import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;

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
public class MovieDto {
	
	private String  id;
	

	private String title;
	
	/*
	 * @NotNull private MovieGenreEnum gengre;
	 * 
	 * @NotNull private LocalDate releaseDate;
	 * 
	 * @Positive private int runTimeInMinutes;
	 * 
	 * @NotNull private MovieRatingEnum movieRating;
	 * 
	 * @NotEmpty private List<Actor> starring;
	 * 
	 * @NotEmpty private List<Director> director;
	 * 
	 * @NotEmpty private List<Screenwriter> screenwriter;
	 * 
	 * @NotEmpty private List<Producer> producer;
	 * 
	 * @PositiveOrZero
	 * 
	 * @Min(value = 0, message = "Rating should not be less than zero.")
	 * 
	 * @Max(value = 10, message = "Rating should not be greater than 10.") private
	 * int myRating;
	 * 
	 * private String myReview;
	 */
}
