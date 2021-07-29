package ro.fasttrackit.movies.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.fasttrackit.movies.model.Movie;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
    List<Movie> findAll();
}
