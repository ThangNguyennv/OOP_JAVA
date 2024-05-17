package hus.oop.comparator;

import java.util.Comparator;

public class RatingCompare implements Comparator<Movie>{
    public int compare(Movie left, Movie right){
        double ratingLeft = left.getRating();
        double ratingRight = right.getRating();

        if (ratingLeft < ratingRight) {
            return -1; // left < right
        } else if (ratingLeft > ratingRight) {
            return 1; // left > right
        } else {
            return 0; // left == right
        }
    }
}
