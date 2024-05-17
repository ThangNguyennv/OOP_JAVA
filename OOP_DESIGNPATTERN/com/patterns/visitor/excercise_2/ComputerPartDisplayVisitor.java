package com.patterns.visitor.excercise_2;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    public void visit(Computer computer) {
        System.out.println("Displaying Computer");
    }

    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard");
    }

    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor");
    }

    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse");
    }
}