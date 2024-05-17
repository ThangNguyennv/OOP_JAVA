package com.patterns.visitor.pseudocode;

public interface Visitor {
    public void visitDot(Dot d);
    public void visitCircle(Circle c);
    public void visitRectangle(Rectangle r);
    public void visitCompoundShape(CompoundShape cs);
}
