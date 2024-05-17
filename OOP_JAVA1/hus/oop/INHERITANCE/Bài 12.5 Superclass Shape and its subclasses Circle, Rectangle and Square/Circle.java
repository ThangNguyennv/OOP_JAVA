public class Circle extends Shape {
    private double radius = 0.0;
    
    public Circle() {
        
    }
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public Circle(double radius, String color, boolean filled) {
        super(color,filled);
        this.radius = radius;
    }
    
    public double getRadius() {
        return this.radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea() {
        return 3.14 * radius * radius;
    }
    
    public double getPerimeter() {
        return 3.14 * 2 * radius;
    }
    
    public String toString() {
        return "Circle[" + super.toString() + ",radius=" + this.radius + "]";
     }
}