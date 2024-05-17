package com.patterns.visitor.pseudocode;

import java.util.Arrays;

public class XMLExportVisitor implements Visitor{
    public void visitDot(Dot d) {
        // Export the dot's ID and center coordinates.
        System.out.println("Exporting dot: ID=" + d.getID() + ", Center=" + Arrays.toString(d.getCenter()));
    }

    public void visitCircle(Circle c) {
        // Export the circle's ID, center coordinates, and radius.
        System.out.println("Exporting circle: ID=" + c.getID()
                        + ", Center=" + Arrays.toString(c.getCenter())
                        + ", Radius=" + c.getRadius());
    }

    public void visitRectangle(Rectangle r) {
        // Export the rectangle's ID, left-top coordinates, width, and height.
        System.out.println("Exporting rectangle: ID=" + r.getID()
                            + ", LeftTop=" + Arrays.toString(r.getLeftTop())
                            + ", Width" + r.getWidth()
                            + ", Height=" + r.getHeight());
    }

    public void visitCompoundShape(CompoundShape cs) {
        // Export the shape's ID as well as the list of its children's IDs.
        System.out.println("Exporting compound shape: ID=" + cs.getID() + ", Children=" + Arrays.toString(cs.getChildren()));
    }
}
