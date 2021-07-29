package ro.fasttrackit.movies.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.fasttrackit.movies.model.Actor;

public interface ActorRepository extends JpaRepository <Actor, Integer>{
}
