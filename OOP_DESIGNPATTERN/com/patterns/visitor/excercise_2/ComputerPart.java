package com.patterns.visitor.excercise_2;

public interface ComputerPart {
    void accept(ComputerPartVisitor v);
}
