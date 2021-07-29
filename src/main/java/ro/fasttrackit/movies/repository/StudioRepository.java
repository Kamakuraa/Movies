package ro.fasttrackit.movies.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.fasttrackit.movies.model.Studio;

public interface StudioRepository extends JpaRepository<Studio, Integer> {
}
