package lab7.shape_abstract;

public class Circle extends Shape{
    protected double radius;
 
    public Circle(double radius) {
        this.radius = radius;
    }
 
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
 
    @Override
    public double getArea() {
        return 3.14 * 3.14 * radius;
    }
 
    @Override
    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }

    @Override
    public String toString(){
        return "Circle[" + super.toString() + ",radius=" + this.radius + "]";
    }

}
