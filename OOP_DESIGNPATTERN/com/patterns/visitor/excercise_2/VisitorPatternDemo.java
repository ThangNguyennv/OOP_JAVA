package com.patterns.visitor.excercise_2;

public class VisitorPatternDemo {
    public static void main(String[] args) {
        ComputerPart computerPart1 = new Computer();
        ComputerPart computerPart2 = new Keyboard();
        ComputerPart computerPart3 = new Mouse();
        ComputerPart computerPart4 = new Monitor();

        ComputerPartVisitor v = new ComputerPartDisplayVisitor();
        computerPart1.accept(v);
        System.out.println();
        computerPart2.accept(v);
        System.out.println();
        computerPart3.accept(v);
        System.out.println();
        computerPart4.accept(v);
    }
}
