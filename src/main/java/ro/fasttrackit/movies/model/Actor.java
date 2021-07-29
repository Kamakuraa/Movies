package ro.fasttrackit.movies.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Actor {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;
    private int year;

    public Actor(){
    }

    public Actor( String name, int year ){
        this.name = name;
        this.year = year;
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
        return "Actor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
