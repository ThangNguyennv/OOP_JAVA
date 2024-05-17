package lab7.shape_abstract;

public class Square extends Rectangle{

    public Square(){

    }

    public Square(double side){
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide(){
        return super.getWidth();
    }
 
    public void setSide(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public double getArea() {
        return width * length;
    }
 
    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString(){
        return "Square[" + super.toString() + ",width=" + this.width + ",length=" + this.length + "]]";
    }

}
