package lab4.TheRectangleClass;

public class Rectangle {
    private float length;
    private float width;

    public Rectangle(){ // Hàm dựng đc định nghĩa
        length = 1.0f;
        width = 1.0f;
    }
    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }
    public float getLength() {
        return length;
    }
    public void setLength(float length) {
        this.length = length;
    }
    public float getWidth() {
        return width;
    }
    public void setWidth(float width) {
        this.width = width;
    }
    public double getArea(){
        return this.width*this.length;
    }
    public double getPerimeter(){
        return 2*(this.length+this.width);
    }
    public String toString(){
        return "Rectangle[length = " + this.length + ",width = " + this.width + "]";
    }
    

    
}
