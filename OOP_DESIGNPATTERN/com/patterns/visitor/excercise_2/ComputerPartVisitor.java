package com.patterns.visitor.excercise_2;

public interface ComputerPartVisitor {
    void visit(Computer computerPart);
    void visit(Mouse computerPart);
    void visit(Keyboard computerPart);
    void visit(Monitor computerPart);
}
