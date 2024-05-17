package com.patterns.visitor.excercise_1;

public class JavaCoreBook implements ProgramingBook {

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public String getResource() {
        return "https://thangnguyen1020";
    }

    public String getFavouriteBook() {
        return "The most favourite book of java core";
    }
}