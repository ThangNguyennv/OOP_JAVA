package lab7.geometricobject;

public class Rectangle implements GeometricObject{
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public String toString(){
        return "Rectangle[width=" + this.width + ",length=" + this.length + "]";
    }

    @Override
    public double getArea(){
        return this.width * this.length;
    }

    @Override
    public double getPerimeter(){
        return 2 * (this.length + this.width);
    }    
}
