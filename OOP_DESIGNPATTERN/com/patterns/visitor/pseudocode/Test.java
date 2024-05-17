package com.patterns.visitor.pseudocode;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Dot(1, new int[]{1, 1}),
                new Circle(2, new int[]{2, 2}, 5),
                new Rectangle(3, new int[]{3, 3}, 10, 20),
                new CompoundShape(4, new Shape[] { new Dot(5, new int[]{5, 5}), new Circle(6, new int[]{6, 6}, 3) })
        };

        Application app = new Application(shapes);
        app.export();
    }
}
