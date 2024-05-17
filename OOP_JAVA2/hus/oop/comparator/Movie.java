package hus.oop.comparator;

import java.io.*;
import java.util.*;

public class Movie implements Comparable<Movie>{
    private String name;
    private double rating;
    private int year;

    public Movie() {

    }

    public Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public int compareTo(Movie movie){
       return Double.compare(this.rating, movie.rating);
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public int getYear() {
        return year;
    }

    public String toString(){
        return "Movie{" + "'name=" + this.name + "'" + ", " + "rating=" + this.rating + ", " + "year=" + this.year + "}";
    }

    
    
    
}
