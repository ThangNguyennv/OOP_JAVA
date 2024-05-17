package com.patterns.visitor.excercise_2;

public class Computer implements ComputerPart {
    private ComputerPart[] parts;

    public Computer() {
        parts = new ComputerPart[] { new Keyboard(), new Monitor(), new Mouse() };
    }

    public void accept(ComputerPartVisitor v) {
        for (ComputerPart part : parts) {
            part.accept(v);
        }
        v.visit(this);
    }
}