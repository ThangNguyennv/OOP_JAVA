package com.patterns.visitor.excercise_1;

public class DesignPatternBook implements ProgramingBook {

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public String getResource() {
        return "https://thangnguyen1020";
    }

    public String getBestSeller() {
        return "The best Seller of design pattern book";
    }
}