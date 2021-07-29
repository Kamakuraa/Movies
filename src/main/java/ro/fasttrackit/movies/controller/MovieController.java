package ro.fasttrackit.movies.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ro.fasttrackit.movies.model.Movie;
import ro.fasttrackit.movies.service.MovieService;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {
    public final MovieService movieService;


    public MovieController( MovieService movieService ){
        this.movieService = movieService;
    }

    @GetMapping
    List<Movie> getAll( ){
        return movieService.getAll();
    }
}
