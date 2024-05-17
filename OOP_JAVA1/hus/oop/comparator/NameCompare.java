package hus.oop.comparator;

import java.util.Comparator;

public class NameCompare implements Comparator<Movie>{
    public int compare(Movie left, Movie right){
        String ratingLeft = left.getName();
        String ratingRight = right.getName();

        return ratingLeft.compareTo(ratingRight);
    }
}
