package lab4.circle;

public class Circle{
    private double radius = 1.0;
    
    public Circle(){

    }

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }
    public double getCircumference(){
        return 2*Math.PI*this.radius;
    }
    public String toString(){
        return "Circle[radius = " + this.radius + "]"; 
    }
}
