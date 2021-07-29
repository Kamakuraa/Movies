package ro.fasttrackit.movies;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ro.fasttrackit.movies.model.*;
import ro.fasttrackit.movies.repository.ActorRepository;
import ro.fasttrackit.movies.repository.MovieRepository;
import ro.fasttrackit.movies.repository.StudioRepository;

import java.util.List;

@SpringBootApplication
public class MoviesApplication {

    public static void main( String[] args ){
        SpringApplication.run(MoviesApplication.class, args);
    }

    @Bean
    CommandLineRunner asStart( MovieRepository movieRepository, StudioRepository studioRepository, ActorRepository actorRepository){

        return args -> {
            Studio Studio = studioRepository.save(new Studio("Warner Bros", "USA"));
            Studio Studio1 = studioRepository.save(new Studio("Universal", "USA"));

            Actor actor = actorRepository.save(new Actor("Jenifer Anniston", 1969));
            Actor actor1 = actorRepository.save(new Actor("Claudia Schiffer", 1970));
            Actor actor2 = actorRepository.save(new Actor("Christian Bale", 1974));
            movieRepository.saveAll(List.of(
                    new Movie("Batman", 2015, new MovieRating(9, "Warner Bros"),
                            getReview1(), Studio, List.of(actor2, actor1)),
                    new Movie("Friends", 1996, new MovieRating(9, "Universal"),
                            getReview2(), Studio1, List.of(actor)),
                    new Movie("X-MEN", 2015, new MovieRating(7, "HBO"),
                            getReview3(), Studio, List.of(actor))
            ));
        };
    }



    private List<Review> getReview3(){
        return List.of(new Review("medium", "bun"), new Review("good", "bun"));
    }

    private List<Review> getReview2(){
        return List.of(new Review("good", "bun"), new Review("good", "bun"));
    }

    private List<Review> getReview1(){
        return List.of(new Review("Very good", "cel mai bun"), new Review("bad", "slab"));
    }

}
