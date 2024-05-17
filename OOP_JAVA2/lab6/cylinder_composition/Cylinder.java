package lab6.cylinder_composition;

public class Cylinder {
    private Circle base;
    private double height;

    public Cylinder(){
        base = new Circle();
        height = 1.0;
    }

    public Cylinder(double radius, double height, String color) {
        base = new Circle(radius, color);
        this.height = height;
    }

    public Circle getBase() {
        return base;
    }

    public void setBase(Circle base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return base.getArea()*this.height;
    }
    @Override
    public String toString(){
        return "Cylinder: subclass of " + base.toString() + " height=" + this.height;
    }
}
