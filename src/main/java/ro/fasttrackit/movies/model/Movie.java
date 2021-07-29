package ro.fasttrackit.movies.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Movie {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;
    private int year;

    @OneToOne(cascade = CascadeType.PERSIST)
    private MovieRating movieRating;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Review> review;

    @ManyToOne
    private Studio studio;

    @ManyToMany
    private List<Actor> actor;


    public Movie(){
    }

    public Movie( String name, int year, MovieRating movieRating, List<Review> review, Studio studio, List<Actor> actor ){
        this.name = name;
        this.year = year;
        this.movieRating = movieRating;
        this.review = review;
        this.studio = studio;
        this.actor = actor;
    }


    public Integer getId(){
        return id;
    }

    public void setId( Integer id ){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName( String name ){
        this.name = name;
    }

    public int getYear(){
        return year;
    }

    public void setYear( int year ){
        this.year = year;
    }

    @Override
    public String toString(){
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
