package ro.fasttrackit.movies.service;

import org.springframework.stereotype.Service;
import ro.fasttrackit.movies.model.Movie;
import ro.fasttrackit.movies.repository.MovieRepository;

import java.util.List;

@Service
public class MovieService {
    private final MovieRepository movieRepository;

    public MovieService( MovieRepository movieRepository ){
        this.movieRepository = movieRepository;
    }



    public List<Movie> getAll(){
        return movieRepository.findAll();
    }
}
