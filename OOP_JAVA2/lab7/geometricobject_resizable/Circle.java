package lab7.geometricobject_resizable;

public class Circle implements GeometricObject{
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public String toString(){
        return "Circle[radius=" + this.radius + "]";
    }

    @Override
    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public double getPerimeter(){
        return 2 * Math.PI * this.radius;
    }

}
