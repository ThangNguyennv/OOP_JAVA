package com.patterns.singleton.exercise;

public class ChocolateController {
    public static void main(String[] args) {
        ChocolateBoiler boiler1 = ChocolateBoiler.getInstance();
        boiler1.fill();
        boiler1.boil();
        boiler1.drain();
        System.out.println();
        ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
        boiler2.fill();

        // Check the status of the first boiler
        System.out.println("Is the first boiler empty? " + boiler1.isEmpty());
        System.out.println("Is the first boiler boiled? " + boiler1.isBoiled());
        
        // Check the status of the second boiler
        System.out.println("Is the second boiler empty? " + boiler2.isEmpty());
        System.out.println("Is the second boiler boiled? " + boiler2.isBoiled());
    }
}
