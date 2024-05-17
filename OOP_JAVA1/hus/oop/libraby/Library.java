package hus.oop.libraby;

import java.util.*;

public class Library {
    Rent[] rents;

    public Library(Rent[] rents) {
        this.rents = rents;
    }
    
    public Rent getLongestRent() {
        Rent longestRent = null;
        long longestDuration = 0;
        for (Rent rent : rents) {
            Date begin = rent.getBegin();
            Date end = rent.getEnd();
            long duration = end.getTime() - begin.getTime();

            if (duration > longestDuration) {
                longestRent = rent;
                longestDuration = duration;
            }
        }
        return longestRent;
    }
}
