package com.patterns.visitor.pseudocode;

public class Dot implements Shape{
    private int id;
    private int[] center;

    public Dot(int id, int[] center) {
        this.id = id;
        this.center = center;
    }

    public int getID() {
        return id;
    }

    public int[] getCenter() {
        return center;
    }

    public void move(int x, int y) {
        System.out.println("Move the dot to the specified coordinates" + " (x" + "," + "y)" );
    }

    public void draw() {
        System.out.println("Draw the dot");
    }

    public void accept(Visitor v) {
        v.visitDot(this);
    }

}
