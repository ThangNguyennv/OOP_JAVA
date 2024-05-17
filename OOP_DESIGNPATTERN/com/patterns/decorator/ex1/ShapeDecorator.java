package com.patterns.decorator.ex1;

public abstract class ShapeDecorator implements Shape {
    protected Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    public void draw() {
        this.shape.draw();
    }
}
