package com.patterns.visitor.pseudocode;

public class Application {
    private final Shape[] allShapes;

    public Application(Shape[] shapes) {
        this.allShapes = shapes;
    }

    public void export() {
        Visitor exportVisitor = new XMLExportVisitor();

        for (Shape shape : allShapes) {
            shape.accept(exportVisitor);
        }
    }
}
