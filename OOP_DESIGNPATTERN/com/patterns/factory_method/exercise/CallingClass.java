package com.patterns.factory_method.exercise;

public class CallingClass {
    public static void main(String[] args) {
        Fruit fruit1 = FruitFactory.provideFruit("Apple");
        System.out.println(fruit1.produceJuice());
        Fruit fruit2 = FruitFactory.provideFruit("Banana");
        System.out.println(fruit2.produceJuice());
        Fruit fruit3 = FruitFactory.provideFruit("Orange");
        System.out.println(fruit3.produceJuice());
    }
}
