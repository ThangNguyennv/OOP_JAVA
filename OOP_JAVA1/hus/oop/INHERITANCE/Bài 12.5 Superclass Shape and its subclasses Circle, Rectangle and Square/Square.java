public class Square extends Rectangle {
    public Square() {
        
    }
    
    public Square(double side) {
        super(side,side);
    }
    
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    
    public double getSide() {
        return super.getWidth();
    }
    
    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }
    
    public void setWidth(double side) {
        super.setWidth(side);
    }
    
    public void setLength(double side) {
        super.setLength(side);
    }
    
    
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}