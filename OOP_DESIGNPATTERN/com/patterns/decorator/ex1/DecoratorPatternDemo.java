package com.patterns.decorator.ex1;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        circle.draw();
        rectangle.draw();

        RedShapeDecorator redShapeDecorator = new RedShapeDecorator(circle);
        redShapeDecorator.draw();
        redShapeDecorator.setRedBorder();
    }
}
