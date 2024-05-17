package com.patterns.visitor.excercise_2;

public class Monitor implements ComputerPart{
    public void accept(ComputerPartVisitor v) {
        v.visit(this);
    }
}
