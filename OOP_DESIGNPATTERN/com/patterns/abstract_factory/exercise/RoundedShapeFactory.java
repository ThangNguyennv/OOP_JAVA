package com.patterns.abstract_factory.exercise;

public class RoundedShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("Square"))
            return new RoundedSquare();
        else if (shapeType.equalsIgnoreCase("Rectangle"))
            return new RoundedRectangle();
        else
            return null;
    }
}
