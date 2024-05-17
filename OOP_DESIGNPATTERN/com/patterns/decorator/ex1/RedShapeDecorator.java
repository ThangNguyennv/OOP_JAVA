package com.patterns.decorator.ex1;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        setRedBorder();
    }

    public void setRedBorder() {
        System.out.println("Border Color: Red");
    }
}
