package com.patterns.abstract_factory.exercise;

public class ShapeFactory extends AbstractFactory{
    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("Square"))
            return new Square();
        else if (shapeType.equalsIgnoreCase("Rectangle"))
            return new Rectangle();
        else
            return null;
    }
}
