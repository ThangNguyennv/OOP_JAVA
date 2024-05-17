package com.patterns.visitor.pseudocode;

public class Rectangle implements Shape{
    private int id;
    private int[] leftTop;
    private int width;
    private int height;

    public Rectangle(int id, int[] leftTop, int width, int height) {
        this.id = id;
        this.leftTop = leftTop;
        this.width = width;
        this.height = height;
    }

    public int getID() {
        return id;
    }

    public int[] getLeftTop() {
        return leftTop;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void move(int x, int y) {
        System.out.println("Move the rectangle to the specified coordinates" + " (x" + "," + "y)" );
    }

    public void draw() {
        System.out.println("Draw the rectangle");
    }

    public void accept(Visitor v) {
        v.visitRectangle(this);
    }
}
