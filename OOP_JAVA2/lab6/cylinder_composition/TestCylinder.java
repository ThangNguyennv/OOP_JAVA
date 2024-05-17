package lab6.cylinder_composition;

public class TestCylinder {
    public static void main(String[] args){
        Cylinder cylinder2 = new Cylinder(3,30,"yellow");
        System.out.println(cylinder2);
        cylinder2.setHeight(50);
        cylinder2.setBase(new Circle(4,"Green"));
        System.out.println("After changing: " + cylinder2);
        System.out.println(cylinder2.getBase());
        System.out.println( "Cylinder:" + " radius=" + cylinder2.getBase().getRadius() +
                " height=" + cylinder2.getHeight() +
                " base area=" + cylinder2.getBase().getArea() + " volume=" + cylinder2.getVolume());
    }
}
