package com.patterns.factory_method.exercise;

public class FruitFactory {
    private FruitFactory() {

    }
    public static final Fruit provideFruit(String type) {
        if (type.equalsIgnoreCase("apple")) {
            return new Apple();
        } else if (type.equalsIgnoreCase("banana")) {
            return new Banana();
        } else if (type.equalsIgnoreCase("orange")) {
            return new Orange();
        }
        throw new IllegalArgumentException("Invalid fruit type: " + type);
    }
}

