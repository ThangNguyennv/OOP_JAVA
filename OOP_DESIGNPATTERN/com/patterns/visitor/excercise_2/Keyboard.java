package com.patterns.visitor.excercise_2;

public class Keyboard implements ComputerPart{
    public void accept(ComputerPartVisitor v) {
        v.visit(this);
    }
}
