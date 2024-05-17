package com.patterns.visitor.excercise_1;

public class VisitorPatternExample {

    public static void main(String[] args) throws Exception {
        Book book1 = new BusinessBook();
        Book book2 = new JavaCoreBook();
        Book book3 = new DesignPatternBook();

        Visitor v = new VisitorImpl();
        book1.accept(v);
        book2.accept(v);
        book3.accept(v);
    }
}